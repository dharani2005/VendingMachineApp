package model;

public enum CandyType {
    CHOCOLATE("chocolate", 20),
    CARAMEL("caramel", 15),
    GUMMIES("gummies", 10);
    private String ProductName;
    private double price;

    CandyType(String productName, double price) {
        ProductName = productName;
        this.price = price;
    }

    public String getProductName() {
        return ProductName;
    }

    public double getPrice() {
        return price;
    }
}
