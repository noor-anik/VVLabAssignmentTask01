import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Integer> productId = new ArrayList<>();
    List<String> productName = new ArrayList<>();
    List<String> productGroup = new ArrayList<>();
    List<Integer> productPrice = new ArrayList<>();

    void addToCart(int productId, String productName, String productGroup, int productPrice) {
        this.productId.add(productId);
        this.productName.add(productName);
        this.productGroup.add(productGroup);
        this.productPrice.add(productPrice);
    }

    void deleteFromCart(int productId) {
        int index = this.productId.indexOf(productId);
        if (index != -1) {
            this.productId.remove(index);
            this.productName.remove(index);
            this.productGroup.remove(index);
            this.productPrice.remove(index);
        } else System.out.println("No such product found!");
    }

    void viewCart(Payment payment) {
        int numberOfProducts = productId.size();
        int totalPrice = 0;
        System.out.println("Total number of Products in Cart: " + numberOfProducts);
        for (int i = 0; i < numberOfProducts; i++) {
            totalPrice += productPrice.get(i);
            System.out.println("Id: " + productId.get(i) + " Name: " + productName.get(i) + " Group: " + productGroup.get(i) + " Price: " + productPrice.get(i));
        }
        payment.paymentUpdate(totalPrice);
        System.out.println("Total Price: " + totalPrice);

    }
}
