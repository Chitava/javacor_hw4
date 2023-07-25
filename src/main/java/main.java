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
        Order order96 = Order.makeOrder("Сидоров", "98", "Вода", 120, products,
                buyers);
        Order order1596 = Order.makeOrder("Иванов", "1596", "Молоко", 5, products,
                buyers);
        Order order596 = Order.makeOrder("Петров", "596", "Хлеб", 3, products,
                buyers);
        Order.addOrders(order96, orders);
        Order.addOrders(order596, orders);
        Order.addOrders(order596, orders);
        System.out.println(orders);


    }
}
