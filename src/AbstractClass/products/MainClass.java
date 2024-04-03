package AbstractClass.products;

import java.util.ArrayList;
import java.util.List;

class ElectronicsProduct extends Product{

    public ElectronicsProduct(String description, double price) {
        super(description, price);
    }

}
class ClothingProduct extends Product{

    public ClothingProduct(String description, double price) {
        super(description, price);
    }
}
class BookProduct extends Product{

    public BookProduct(String description, double price) {
        super(description, price);
    }

}

class ShoppingCart{
    private List<Product> cartList;

    public ShoppingCart(){
        cartList=new ArrayList<>();
    }
    public void addProduct(Product product){
        cartList.add(product);
    }
    public void displayCart(){
        for(Product p:cartList){
            System.out.println("Product Description is "+p.getDescription());
            System.out.println("Product Price is "+p.getPrice());
        }
        System.out.println("Total Price is "+calculateTotalPrice());
    }

    private double calculateTotalPrice() {
        double totalPrice=0;
        for(Product p:cartList){
            totalPrice+=p.getPrice();
        }
        return totalPrice;
    }
}
public class MainClass {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        ElectronicsProduct phone = new ElectronicsProduct("Smartphone", 799.99);
        ClothingProduct shirt = new ClothingProduct("T-Shirt", 29.99);
        BookProduct book = new BookProduct("Java Programming", 49.99);

        cart.addProduct(phone);
        cart.addProduct(shirt);
        cart.addProduct(book);

        cart.displayCart();
    }
}
