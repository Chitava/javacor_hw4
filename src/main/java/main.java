import buyers.Buyer;
import orders.Order;
import products.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        ArrayList<Buyer> buyers = new ArrayList<>();
        ArrayList<Order> orders = new ArrayList<>();
        ArrayList<Order> ordersForOneBuyer = new ArrayList<>(5);
        Buyer buyer1 = new Buyer("Иванов", "Иван", "Иванович", 21, 926);
        Buyer buyer2 = new Buyer("Петров", "Петр", "Петрович", 45, 903);
        Product product1 = new Product("Молоко", (float) 123.60);
        Product product2 = new Product("Хлеб", (float) 32.60);


    }
}
