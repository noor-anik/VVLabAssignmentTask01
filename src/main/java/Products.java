import java.util.ArrayList;
import java.util.List;

public class Products {
    List<Integer> productId = new ArrayList<>();
    List<String> productName = new ArrayList<>();
    List<String> productGroup = new ArrayList<>();
    List<Integer> productPrice = new ArrayList<>();

    void addProduct(int productId, String productName, String productGroup, int productPrice) {
        this.productId.add(productId);
        this.productName.add(productName);
        this.productGroup.add(productGroup);
        this.productPrice.add(productPrice);
    }

    void deleteProduct(int productId) {
        int index = this.productId.indexOf(productId);
        if (index != -1) {
            this.productId.remove(index);
            this.productName.remove(index);
            this.productGroup.remove(index);
            this.productPrice.remove(index);
        } else System.out.println("No such product found!");
    }

    void viewAllProducts() {
        int totalNumberOfProducts = productId.size();
        System.out.println("Total number of Products are shown: " + totalNumberOfProducts);
        for (int i = 0; i < totalNumberOfProducts; i++) {
            System.out.println("Id: " + productId.get(i) + " Name: " + productName.get(i) + " Group: " + productGroup.get(i) + " Price: " + productPrice.get(i));
        }
    }
}
