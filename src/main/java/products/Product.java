package products;

public class Product {
    private String name;
    private float price;
    public int quantityProduct = 0;
    public double summCoast = 0;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Товар:\n ");
        info.append(getName() + "\n");
        info.append("Цена - ");
        info.append(getPrice() + " р. " + "\n");
        return info.toString();
    }
}
