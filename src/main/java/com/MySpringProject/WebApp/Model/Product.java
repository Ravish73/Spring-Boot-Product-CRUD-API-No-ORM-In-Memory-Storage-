package com.MySpringProject.WebApp.Model;


import org.springframework.stereotype.Component;


@Component
public class Product
{
   private int ProdId;
    private   String ProdName;
    private int ProdPrice;

    @Override
    public String toString() {
        return "Product{" +
                "ProdId=" + ProdId +
                ", ProdName='" + ProdName + '\'' +
                ", ProdPrice=" + ProdPrice +
                '}';
    }

    public void setProdId(int prodId) {
        ProdId = prodId;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }

    public int getProdPrice() {
        return ProdPrice;
    }

    public void setProdPrice(int prodPrice) {
        ProdPrice = prodPrice;
    }

    public Product(int ProdId, String ProdName, int ProdPrice)
    {
       this. ProdId = ProdId;
        this.ProdName = ProdName;
       this. ProdPrice = ProdPrice;
    }

    public int getProdId()
    {
        return ProdId;
    }

    public Product() {
    }
}
