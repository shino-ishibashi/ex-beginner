package com.example.domain;

public class ProductsPrice {

    private Integer product1Price;
    private Integer product2Price;
    private Integer product3Price;

    private Integer productSumPrice;
    private Integer productSumPriceIncludeTax;


    //    getter setter
    public Integer getProduct1Price() {
        return product1Price;
    }

    public void setProduct1Price(Integer product1Price) {
        this.product1Price = product1Price;
    }

    public Integer getProduct2Price() {
        return product2Price;
    }

    public void setProduct2Price(Integer product2Price) {
        this.product2Price = product2Price;
    }

    public Integer getProduct3Price() {
        return product3Price;
    }

    public void setProduct3Price(Integer product3Price) {
        this.product3Price = product3Price;
    }

    public Integer getProductSumPrice() {
        return productSumPrice;
    }

    public void setProductSumPrice(Integer productSumPrice) {
        this.productSumPrice = productSumPrice;
    }

    public Integer getProductSumPriceIncludeTax() {
        return productSumPriceIncludeTax;
    }

    public void setProductSumPriceIncludeTax(Integer productSumPriceIncludeTax) {
        this.productSumPriceIncludeTax = productSumPriceIncludeTax;
    }
}
