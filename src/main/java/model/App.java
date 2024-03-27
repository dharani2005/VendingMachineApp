package model;

import model.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Drinks drinks = new Drinks(Brand.COLA, true);
        Drinks drink2 = new Drinks(Brand.COLA, false);
        Chips chips = new Chips(true, Type.DORITOS);
        Candy candy = new Candy(CandyType.CHOCOLATE, false);
        Product[] products = {drinks, drink2, chips, candy};
        System.out.println();
        VendingMachine order = new VendingMachine(products);
        order.addCurrency(200);
        System.out.println("Initial amount:" + order.getBalance());
        for (String items : order.getProducts()) {//this displays the products having id,name and price
            System.out.println("::: " + items);
        }
        Product p1 = order.request(1);//passing the id value in request method (choosing the id from console)
        Product p2 = order.request(2);// after displaying the products using for-loop(getproducts method)
        Product p3 = order.request(3);
        Product p4 = order.request(4);
        System.out.println("products purchased:" + p1.examine() + "\n" + p2.examine() + "\n" + p3.examine() + "\n" + p4.examine());
        System.out.println("remaining balance:" + order.getBalance());
    }

}
