public class Main {
    public static void main(String[] args) {
        Products pList = new Products();

        Admin admin = new Admin(101, "Noor");

        admin.addProduct(pList, 1012, "Tomato", "Vegetable", 15);
        admin.addProduct(pList, 1014, "Potato", "Vegetable", 12);
        admin.addProduct(pList, 1015, "Apple", "Fruit", 25);
        admin.addProduct(pList, 1018, "Orange", "Fruit", 32);
        admin.addProduct(pList, 1021, "Banana", "Fruit", 8);
        admin.addProduct(pList, 1023, "Peanut", "Snacks", 30);
        admin.addProduct(pList, 1024, "Bread", "Snacks", 28);
        admin.addProduct(pList, 1025, "Ice Cream", "Dessert", 55);
        admin.productsList(pList);
        admin.deleteProduct(pList, 1018);
        admin.productsList(pList);

        System.out.println("=========================================================================================");

        Customer customer1 = new Customer(10001, "Neon", "Dhaka", "01789546123");
        customer1.viewProducts(pList);

        customer1.addToCart(1012, "Tomato", "Vegetable", 15);
        customer1.addToCart(1015, "Apple", "Fruit", 25);
        customer1.addToCart(1023, "Peanut", "Snacks", 30);
        customer1.addToCart(1024, "Bread", "Snacks", 28);
        customer1.addToCart(1025, "Ice Cream", "Dessert", 55);
        customer1.viewCart();
        customer1.deleteFromCart(1024);
        customer1.viewCart();

        System.out.println("=========================================================================================");

        customer1.pay(125);
    }
}