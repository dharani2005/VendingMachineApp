package model;

public class VendingMachine implements IVendingMachine {

    Product[] products;
    int[] validMoney = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
    int depositPool;

    public VendingMachine() {
        super();
    }

    public VendingMachine(Product[] products) {
        this.products = new Product[products.length];
        this.products = products;

    }

    @Override
    public void addCurrency(int amount) {
        if (isValidMoney(amount)) {
            depositPool = depositPool + amount;
        } else {
            throw new IllegalArgumentException("invalid money");
        }
    }

    private boolean isValidMoney(int money) {
        for (int i = 0; i < validMoney.length; i++) {
            if (validMoney[i] == money) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                if (product.getPrice() <= depositPool) {
                    depositPool = depositPool - (int) product.getPrice();
                    Product[] newproducts = new Product[products.length + 1];
                    System.arraycopy(products, 0, newproducts, 0, products.length);
                    newproducts[newproducts.length - 1] = product;
                    products = newproducts;
                    return product;
                }

                throw new IllegalArgumentException("Insufficient deposit");
            }
        }
        throw new IllegalArgumentException("Invalid id");
    }

    @Override
    public int endSession() {
        int remaining = depositPool;
        depositPool = 0;
        return remaining;
    }

    @Override
    public String getDescription(Product id) {
        return id.examine();
    }

    @Override
    public String[] getProducts() {
        String[] items = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            items[i] = products[i].use();
        }
        return items;
    }


}


