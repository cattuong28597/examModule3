package model;

import service.ProductService;

public class Product {
    protected int id;
    protected String productName;
    protected int price;
    protected int quantity;
    protected String color;
    protected String category;
    protected String description;

    public Product() {
    }

    public Product(int id, String productName, int price, int quantity, String color, String category, String description) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.category = category;
        this.description = description;
    }

    public Product(String productName, int price, int quantity, String color, String category, String description) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.category = category;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
