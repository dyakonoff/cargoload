package io.dyakonoff.cargoload.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s (%s)|name,shipType")
@Table(name = "CARGOLOAD_SHIP")
@Entity(name = "cargoload$Ship")
public class Ship extends StandardEntity {
    private static final long serialVersionUID = 1415145438533094537L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "SHIP_TYPE")
    protected String shipType;

    @NotNull
    @Column(name = "TONNAGE", nullable = false)
    protected BigDecimal tonnage;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getShipType() {
        return shipType;
    }

    public void setTonnage(BigDecimal tonnage) {
        this.tonnage = tonnage;
    }

    public BigDecimal getTonnage() {
        return tonnage;
    }


}