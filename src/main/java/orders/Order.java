package orders;

import buyers.Buyer;
import exceptions.AmountExeption;
import exceptions.CustomerException;
import exceptions.ProductException;
import products.Product;

import java.util.ArrayList;
import java.util.Stack;

public class Order {
    private final String number;
    private Buyer buyer;
    private ArrayList<Product> products = new ArrayList<>();

    private int countProduct = 0;
    private double price = 0;
    public static int countpurchase = 0;


    public Order(Buyer buyer, String number) {
        this.number = number;
        this.buyer = buyer;
        countpurchase++;
    }


    public void makeOrder(String nameBauyer, String product, int numb, ArrayList<Product> products,
                          ArrayList<Buyer> buyers) {
        try {
            if (numb > 100) {
                throw new AmountExeption("Слишком большое значение для позиции " + product + " " + numb);
            }
        }catch (AmountExeption e) {
            e.printStackTrace();
        }
        try {
            if (!products.contains(product))
                throw new ProductException("Товара" + product +  "нет в нашем магазине");
        }catch (ProductException e){
            e.printStackTrace();
        }
        try {
            if (! buyers.contains(nameBauyer)){
                throw new CustomerException("Такого покупателя нет в нашей базе");
            }
        }catch (CustomerException e){
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Заказ № ");
        info.append(this.number + "\n");
        info.append(this.buyer + "\n");
        info.append("Список покупок: \n");
        for (Product product : this.products) {
            info.append(product);
            info.append("Количество - ");
            info.append(product.quantityProduct + "\n");
            info.append("На сумму - ");
            info.append(String.format("%.2f", product.summCoast) + "\n");
        }

        info.append("Всего позиций в заказе - ");
        info.append(this.countProduct + "\n");
        info.append("На сумму - ");
        info.append(String.format("%.2f", this.price) + "\n");
        return info.toString();
    }
}
