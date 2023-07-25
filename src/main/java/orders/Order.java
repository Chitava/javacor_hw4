package orders;

import buyers.Buyer;
import exceptions.AmountExeption;
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

    public Buyer getBuyer() {
        return buyer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public int getCountproduct() {
        return countProduct;
    }

    public void makeOrder(Product product, int numb) {
        try {
            if (numb > 100) {
                throw new AmountExeption("Слишком большое значение ля позиции " + product.getName() + " " + numb);

            } else {
                for (int i = 0; i < numb; i++) {
                    if (this.products.contains(product)) {
                        product.quantityProduct++;
                        this.price = this.price + product.getPrice();
                        product.summCoast = product.summCoast + product.getPrice();

                    } else {
                        this.products.add(product);
                        this.price = this.price + product.getPrice();
                        product.quantityProduct++;
                        this.countProduct++;
                        product.summCoast = product.summCoast + product.getPrice();
                    }
                }
            }

        } catch (AmountExeption e) {
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
