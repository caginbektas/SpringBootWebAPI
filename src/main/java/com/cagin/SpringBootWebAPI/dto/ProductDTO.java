package com.cagin.SpringBootWebAPI.dto;

public class ProductDTO {
    private long id;
    private String name;
    private String imgUri;
    private float price;
    private String currency;
    private String description;

    public ProductDTO() {
    }

    public ProductDTO(long id, String name, String imgUri, float price, String currency, String description) {
        this.id = id;
        this.name = name;
        this.imgUri = imgUri;
        this.price = price;
        this.currency = currency;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
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
