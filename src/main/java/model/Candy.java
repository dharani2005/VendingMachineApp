package model;

public class Candy extends Product {
    private boolean unsweetened;
    private CandyType candyType;

    public Candy(CandyType candyType, boolean unsweetened) {
        super(candyType.getPrice(), candyType.getProductName());
        this.candyType = candyType;
        this.unsweetened = unsweetened;
    }

    @Override
    public String examine() {
        return "Id:" + getId() + ", ProductName:" + candyType.getProductName() + ", Price:" + candyType.getPrice() + ", Unsweetened:" + unsweetened;
    }

    @Override
    public String use() {
        return "Id:" + getId() + "ProductName:" + candyType.getProductName() + ", Price:" + candyType.getPrice();
    }
}
