public class Customer {
    String name, address, phoneNo, paymentStatus = "Unpaid";
    int id;

    Customer(int id, String name, String address, String phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public Cart cart = new Cart();
    public Payment payment = new Payment(id);

    public void viewProducts(Products productsList) {
        productsList.viewAllProducts();
    }

    public void addToCart(int productId, String productName, String productGroup, int productPrice) {

        cart.addToCart(productId, productName, productGroup, productPrice);
    }

    public void deleteFromCart(int productId) {
        cart.deleteFromCart(productId);
    }

    public void viewCart() {
        System.out.println("Customer Id: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone No: " + phoneNo);
        cart.viewCart(payment);
    }

    public void pay(int paymentAmount) {
        paymentStatus = payment.payment(paymentAmount);
        if (paymentStatus.equals("Paid")) {
            System.out.println("Payment Successful!");
            System.out.println("Paid Amount: " + paymentAmount + " BDT");
        } else System.out.println("Sorry! Payment unsuccessful; Try again!");
    }
}
