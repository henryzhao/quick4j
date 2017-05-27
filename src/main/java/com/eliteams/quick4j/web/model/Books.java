package com.eliteams.quick4j.web.model;

import java.math.BigDecimal;

public class Books {
    private Long id;

    private String name;

    private String year;

    private BigDecimal price;

    private BigDecimal pricereal;

    private String source;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPricereal() {
        return pricereal;
    }

    public void setPricereal(BigDecimal pricereal) {
        this.pricereal = pricereal;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }
}