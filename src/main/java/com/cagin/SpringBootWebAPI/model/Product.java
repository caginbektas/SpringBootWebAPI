package com.cagin.SpringBootWebAPI.model;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.*;;

@Entity
@Table(name="Product")
@EntityListeners(AuditingEntityListener.class)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull(message = "Name may not be null")
    private String name;
    @NotNull(message = "Image Url may not be null")
    private String imgUri;
    @NotNull(message = "Price may not be null")
    private float price;
    @NotNull(message = "Currency may not be null")
    private String currency;
    @NotNull(message = "Description may not be null")
    private String description;

    public Product() {
    }

    public Product(long id, @NotNull(message = "Name may not be null") String name, @NotNull(message = "Image Url may not be null") String imgUri, @NotNull(message = "Price may not be null") float price, @NotNull(message = "Currency may not be null") String currency, @NotNull(message = "Description may not be null") String description) {
        this.id = id;
        this.name = name;
        this.imgUri = imgUri;
        this.price = price;
        this.currency = currency;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imgUri='" + imgUri + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
