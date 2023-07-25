package orders;

import buyers.Buyer;
import exceptions.AmountExeption;
import exceptions.CustomerException;
import exceptions.ProductException;
import products.Product;

import java.util.ArrayList;
import java.util.Stack;

public class Order {
    private String number;
    private String buyer;
    public ArrayList<Product> orderProducts = new ArrayList<>();
    private int countProduct = 0;
    private double price = 0;
    public static int countpurchase = 0;
    public static ArrayList<Order> orders;


    public Order(String buyer, String number) {
        this.number = number;
        this.buyer = buyer;

    }

    public static Order makeOrder(String nameBauyer, String number, String nameProduct, int numb,
                                  ArrayList<Product> arrayOfProducts, ArrayList<Buyer> arrayOfBuyers) {
        Order newOrder = new Order (nameBauyer, number);
        try {
            int count = 0;
            for (Buyer buyer : arrayOfBuyers) {
                if (buyer.getName() == nameBauyer) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                throw new CustomerException("Покупателя " + nameBauyer +  " нет в нашей базе");

            }
        } catch (CustomerException e) {
            e.printStackTrace();
        }

        try {
            if (numb > 100) {
                throw new AmountExeption("Слишком большое значение для позиции " + nameProduct + " " + numb);

            }
        } catch (AmountExeption e) {
            e.printStackTrace();

        }
        try {
            int count = 0;
            for (Product prod : arrayOfProducts) {
                if (prod.getName() == nameProduct) {
                    count++;
                    prod.quantityProduct = 0;
                    newOrder.countProduct = numb;
                    newOrder.price = prod.getPrice()*numb;
                    newOrder.orderProducts.add(prod);
                    prod.quantityProduct = numb;
                    prod.summCoast = numb * prod.getPrice();
                    newOrder.countProduct++;
                    break;
                }
            }
            if (count == 0) {
                throw new ProductException("Товара " + nameProduct + " нет в нашем магазине");
            }
        } catch (ProductException e) {
            e.printStackTrace();
        }
        return newOrder;
    }

    public static void addOrders (Order order, ArrayList<Order> orders){
        try {
            orders.add(order);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Заказ № ");
        info.append(this.number + "\n");
        info.append("покупатель - ");
        info.append(this.buyer + "\n");
        for (Product prod : this.orderProducts) {
            info.append(prod);
            info.append("Количество - ");
            info.append(this.countProduct + "\n");
            info.append("На сумму - ");
            info.append(String.format("%.2f", prod.summCoast) + "\n");
        }
        return info.toString();
    }
}
