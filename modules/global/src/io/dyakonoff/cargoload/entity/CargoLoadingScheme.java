package io.dyakonoff.cargoload.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s x %s -> %s|sku,countToLoad,bay")
@Table(name = "CARGOLOAD_CARGO_LOADING_SCHEME")
@Entity(name = "cargoload$CargoLoadingScheme")
public class CargoLoadingScheme extends StandardEntity {
    private static final long serialVersionUID = -582553532642007085L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SKU_ID")
    protected CargoSku sku;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BAY_ID")
    protected CargoBay bay;

    @NotNull
    @Column(name = "COUNT_TO_LOAD", nullable = false)
    protected Integer countToLoad;

    public void setSku(CargoSku sku) {
        this.sku = sku;
    }

    public CargoSku getSku() {
        return sku;
    }

    public void setBay(CargoBay bay) {
        this.bay = bay;
    }

    public CargoBay getBay() {
        return bay;
    }

    public void setCountToLoad(Integer countToLoad) {
        this.countToLoad = countToLoad;
    }

    public Integer getCountToLoad() {
        return countToLoad;
    }


}