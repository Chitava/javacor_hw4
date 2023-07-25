import buyers.Buyer;
import orders.Order;
import products.Product;

import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        ArrayList<Buyer> buyers = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Order> orders = new ArrayList<>(5);
        Buyer buyer1 = new Buyer("Иванов", 21,  926);
        Buyer buyer2 = new Buyer("Петров", 45, 903);
        Product product1 = new Product("Молоко", (float) 123.60);
        Product product2 = new Product("Хлеб", (float) 32.60);
        buyers.add(buyer1);
        buyers.add(buyer2);
        products.add(product1);
        products.add(product2);
        Order order1 = new Order(buyer1, "1");
        Order order2 = new Order(buyer2, "2");


    }
}
