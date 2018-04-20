package io.dyakonoff.cargoload.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.math.BigDecimal;
import javax.validation.constraints.DecimalMin;

@NamePattern("%s|name")
@Table(name = "CARGOLOAD_PRODUCT")
@Entity(name = "cargoload$Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = -7413441495689579391L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 100)
    protected String name;

    @NotNull
    @Column(name = "MEASURE", nullable = false)
    protected Integer measure;

    @DecimalMin(message = "Weight per unit can not be negative", value = "0")
    @NotNull
    @Column(name = "WEIGHT_PER_UNIT", nullable = false)
    protected BigDecimal weightPerUnit;

    @DecimalMin(message = "Price can't be negative", value = "0")
    @Column(name = "PRICE_PER_UNIT")
    protected BigDecimal pricePerUnit;

    public void setWeightPerUnit(BigDecimal weightPerUnit) {
        this.weightPerUnit = weightPerUnit;
    }

    public BigDecimal getWeightPerUnit() {
        return weightPerUnit;
    }

    public void setPricePerUnit(BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }


    public void setMeasure(ProductMeasure measure) {
        this.measure = measure == null ? null : measure.getId();
    }

    public ProductMeasure getMeasure() {
        return measure == null ? null : ProductMeasure.fromId(measure);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}