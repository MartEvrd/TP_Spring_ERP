package com.example.tpspringerp.entite;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal priceHt;
    private BigDecimal priceTtc;
    private String description;

    public Product(String name, BigDecimal priceHt, String description) {
        this.name = name;
        this.priceHt = priceHt;
//        this.priceTtc = this.priceHt.multiply(BigDecimal.valueOf(1.2));
        this.description = description;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPriceHt() {
        return priceHt;
    }

    public void setPriceHt(BigDecimal priceHt) {
        this.priceHt = priceHt;
        this.priceTtc = priceHt.multiply(BigDecimal.valueOf(1.2));
    }

    public BigDecimal getPriceTtc() {
        return priceTtc;
    }

    public void setPriceTtc(BigDecimal priceTtc) {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\n -> Name : "+this.name+
                "\n -> Price H.T : "+this.priceHt+
                "\n -> Price T.T.C : "+this.priceTtc+
                "\n -> Description : "+this.description;
    }
}
