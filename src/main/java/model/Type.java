package model;

public enum Type {
    LAYS("lays", 20),
    DORITOS("doritos", 25),
    PRINGLES("pringles", 30);
    private String productName;
    private double price;

    Type(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
