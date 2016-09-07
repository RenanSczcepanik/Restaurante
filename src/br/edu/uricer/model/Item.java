package br.edu.uricer.model;

import java.math.BigDecimal;

public class Item {
    private Product product = new Product();
    private BigDecimal quantity;
    private BigDecimal unitaryValue;
    private BigDecimal totalValue;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitaryValue() {
        return unitaryValue;
    }

    public void setUnitaryValue(BigDecimal unitaryValue) {
        this.unitaryValue = unitaryValue;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }
    public void totalize(){
        totalValue = quantity.multiply(unitaryValue).setScale(2);
    }
}
