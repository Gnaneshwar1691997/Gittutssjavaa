package com.telusko.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;

    // No-args constructor for Spring
    public Product() {
    }

    // Parameterized constructor
    public Product(int proId, String prodName, int price) {
        this.prodId = proId;
        this.prodName = prodName;
        this.price = price;
    }

    // Getters and Setters
    public int getProdId() {
        return prodId;
    }

    public void setProdId(int proId) {
        this.prodId = proId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //
    //package com.telusko.simpleWebApp.model;
    //
    //import lombok.AllArgsConstructor;
    //import lombok.Data;
    //import lombok.NoArgsConstructor;
    //import org.springframework.stereotype.Component;
    //
    //@Component
    //@Data
    //@NoArgsConstructor
    //@AllArgsConstructor
    //public class Product {
    //    private int prodId;
    //    private String prodName;
    //    private int price;
    //
        @Override
        public String toString() {
            return "Product{" +
                    "price=" + price +
                    ", prodName='" + prodName + '\'' +
                    ", prodId=" + prodId +
                    '}';
        }
}






