package io.dyakonoff.cargoload.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Table(name = "CARGOLOAD_SHIP_LOADING_SCHEME")
@Entity(name = "cargoload$ShipLoadingScheme")
public class ShipLoadingScheme extends StandardEntity {
    private static final long serialVersionUID = -446514465222990238L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 100)
    protected String name;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "shipLoadingScheme")
    protected List<CargoItemPosition> itemPositions;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setItemPositions(List<CargoItemPosition> itemPositions) {
        this.itemPositions = itemPositions;
    }

    public List<CargoItemPosition> getItemPositions() {
        return itemPositions;
    }


}