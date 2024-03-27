package model;

public abstract class Product {
    private int id;
    private double price;
    private String productName;
    private static int sequencer = 0;

    public Product(double price, String productName) {
        this.id = setId();
        this.price = price;
        setProductName(productName);
    }

    public int setId() {
        return ++sequencer;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {

        return productName;
    }

    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty())
            throw new IllegalArgumentException("Product name cannot be empty or null");
        this.productName = productName;
    }

    public abstract String examine();

    public abstract String use();
}
