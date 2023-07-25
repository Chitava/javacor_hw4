public class Order {
    private Object buyer;
    private Object product;
    private Object countproduct;
    public static int countpurchase;

    public Order(Object buyer, Object product, Object countproduct) {
        this.buyer = buyer;
        this.product = product;
        this.countproduct = countproduct;
    }

    public Object getBuyer() {
        return buyer;
    }

    public void setBuyer(Object buyer) {
        this.buyer = buyer;
    }

    public Object getProduct() {
        return product;
    }

    public void setProduct(Object product) {
        this.product = product;
    }

    public Object getCountproduct() {
        return countproduct;
    }

    public void setCountproduct(Object countproduct) {
        this.countproduct = countproduct;
    }

    public static int getCountpurchase() {
        return countpurchase;
    }

    public static void setCountpurchase(int countpurchase) {
        Order.countpurchase = countpurchase;
    }
}
