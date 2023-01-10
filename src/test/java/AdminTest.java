import org.junit.Test;

import static org.junit.Assert.*;

public class AdminTest {

    @Test
    public void addProductTest() {
        var admin = new Admin(101, "Rahim");
        var product = new Products();
        admin.addProduct(product, 101, "Apple", "Fruit", 25);
        assertTrue(product.productId.equals(101));
    }

    @Test
    public void deleteProduct() {
    }

    @Test
    public void productsList() {
    }
}