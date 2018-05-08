package io.dyakonoff.cargoload.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@NamePattern("%s|name")
@Table(name = "CARGOLOAD_CARGO_BAY")
@Entity(name = "cargoload$CargoBay")
public class CargoBay extends StandardEntity {
    private static final long serialVersionUID = 3530321975389151833L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 100)
    protected String name;

    @NotNull
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SHIP_ID")
    protected Ship ship;

    @Digits(integer = 3, fraction = 0)
    @Max(100)
    @Min(0)
    @Column(name = "BAY_NUMBER", unique = true)
    protected Integer bayNumber;

    @Column(name = "MAX_LOAD")
    protected BigDecimal maxLoad;

    @Column(name = "BAY_AREA")
    protected BigDecimal bayArea;

    @NotNull
    @Column(name = "FORE_AND_AFT_POSITION", nullable = false)
    protected Integer foreAndAftPosition;

    @NotNull
    @Column(name = "ATHWARTSHIP_POSITION", nullable = false)
    protected Integer athwartshipPosition;

    public void setBayNumber(Integer bayNumber) {
        this.bayNumber = bayNumber;
    }

    public Integer getBayNumber() {
        return bayNumber;
    }


    public void setBayArea(BigDecimal bayArea) {
        this.bayArea = bayArea;
    }

    public BigDecimal getBayArea() {
        return bayArea;
    }


    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Ship getShip() {
        return ship;
    }


    public void setAthwartshipPosition(PositionAthwartship athwartshipPosition) {
        this.athwartshipPosition = athwartshipPosition == null ? null : athwartshipPosition.getId();
    }

    public PositionAthwartship getAthwartshipPosition() {
        return athwartshipPosition == null ? null : PositionAthwartship.fromId(athwartshipPosition);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMaxLoad(BigDecimal maxLoad) {
        this.maxLoad = maxLoad;
    }

    public BigDecimal getMaxLoad() {
        return maxLoad;
    }

    public void setForeAndAftPosition(PositionLengthwise foreAndAftPosition) {
        this.foreAndAftPosition = foreAndAftPosition == null ? null : foreAndAftPosition.getId();
    }

    public PositionLengthwise getForeAndAftPosition() {
        return foreAndAftPosition == null ? null : PositionLengthwise.fromId(foreAndAftPosition);
    }


}