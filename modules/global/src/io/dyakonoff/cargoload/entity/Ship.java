package io.dyakonoff.cargoload.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    @Column(name = "CARRYING_CAPACITY", nullable = false)
    protected BigDecimal carryingCapacity;

    @Temporal(TemporalType.DATE)
    @Column(name = "BUILD_YEAR")
    protected Date buildYear;

    public void setBuildYear(Date buildYear) {
        this.buildYear = buildYear;
    }

    public Date getBuildYear() {
        return buildYear;
    }


    public void setCarryingCapacity(BigDecimal carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public BigDecimal getCarryingCapacity() {
        return carryingCapacity;
    }


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


}