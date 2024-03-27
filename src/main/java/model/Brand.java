package model;

public enum Brand {
    COLA("cola",10),
          SPRITE("sprite",15),
            FANTA("fanta",20);
    private final String productName;
    private final double price;


    Brand(String productName,double price) {
        this.price = price;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
