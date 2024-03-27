package model;

public interface IVendingMachine {
    void addCurrency(int amount);

    int getBalance();

    Product request(int id);

    int endSession();

    String getDescription(Product id);

    String[] getProducts();
}
