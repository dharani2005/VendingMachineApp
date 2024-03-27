package model;

public class Drinks extends Product {
    private Brand brand;
    private boolean hasSugar;

    public Drinks(Brand brand, boolean hasSugar) {
        super(brand.getPrice(), brand.getProductName());
        this.brand = brand;
        this.hasSugar = hasSugar;
    }

    @Override
    public String examine() {
        return "Id:" + getId() + ", Price:" + brand.getPrice() + ", ProductName:" + brand.getProductName() + ", Has sugar:" + hasSugar;

    }

    @Override
    public String use() {
        return "Id:" + getId() + ", Name:" + brand.getProductName() + ", Price:" + brand.getPrice();
    }
}
