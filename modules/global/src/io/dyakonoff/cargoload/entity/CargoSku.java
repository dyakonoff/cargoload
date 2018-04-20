package io.dyakonoff.cargoload.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

@NamePattern("%s * %s|product,productQuantity")
@Table(name = "CARGOLOAD_CARGO_SKU")
@Entity(name = "cargoload$CargoSku")
public class CargoSku extends StandardEntity {
    private static final long serialVersionUID = 4169846035104582589L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_ID")
    protected Product product;

    @DecimalMin("0")
    @NotNull
    @Column(name = "PRODUCT_QUANTITY", nullable = false)
    protected BigDecimal productQuantity;

    @Column(name = "QTY_AVALIABLE_TO_BUY")
    protected Integer qtyAvaliableToBuy;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    protected BigDecimal price;

    @DecimalMax("100")
    @DecimalMin("0")
    @Column(name = "CONTAINER_WIDTH")
    protected BigDecimal containerWidth;

    @DecimalMax("500")
    @DecimalMin("0")
    @Column(name = "CONTAINER_DEPTH")
    protected BigDecimal containerDepth;

    @DecimalMax("500")
    @DecimalMin("0")
    @Column(name = "CONTAINER_HEIGHT")
    protected BigDecimal containerHeight;

    public void setContainerWidth(BigDecimal containerWidth) {
        this.containerWidth = containerWidth;
    }

    public BigDecimal getContainerWidth() {
        return containerWidth;
    }

    public void setContainerDepth(BigDecimal containerDepth) {
        this.containerDepth = containerDepth;
    }

    public BigDecimal getContainerDepth() {
        return containerDepth;
    }

    public void setContainerHeight(BigDecimal containerHeight) {
        this.containerHeight = containerHeight;
    }

    public BigDecimal getContainerHeight() {
        return containerHeight;
    }


    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProductQuantity(BigDecimal productQuantity) {
        this.productQuantity = productQuantity;
    }

    public BigDecimal getProductQuantity() {
        return productQuantity;
    }

    public void setQtyAvaliableToBuy(Integer qtyAvaliableToBuy) {
        this.qtyAvaliableToBuy = qtyAvaliableToBuy;
    }

    public Integer getQtyAvaliableToBuy() {
        return qtyAvaliableToBuy;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }


}