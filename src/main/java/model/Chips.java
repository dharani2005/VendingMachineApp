package model;

public class Chips extends Product {
    private boolean isSpicy;
    private Type type;

    public Chips(boolean isSpicy, Type type) {
        super(type.getPrice(), type.getProductName());
        this.isSpicy = isSpicy;
        this.type = type;
    }

    @Override
    public String examine() {
        return "Id:" + getId() + ", ProductName:" + type.getProductName() + ", Price:" + type.getPrice() + ", Isspicy:" + isSpicy;
    }

    @Override
    public String use() {
        return "Id:" + getId() + "ProductName:" + type.getProductName() + ", Price:" + type.getPrice();
    }
}
