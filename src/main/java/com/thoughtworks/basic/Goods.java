package com.thoughtworks.basic;

import java.math.BigDecimal;

public class Goods {
    private String name;
    private BigDecimal cost;
    public Goods(String name,BigDecimal cost){
        this.cost = cost;
        this.name =name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
