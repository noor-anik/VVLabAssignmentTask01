public class Payment {
    int customerId, totalPrice, paidAmount;

    Payment(int customerId) {
        this.customerId = customerId;
    }

    public void paymentUpdate(int newPrice) {
        totalPrice = newPrice;
    }

    public String payment(int paidAmount) {
        this.paidAmount = paidAmount;
        if (this.paidAmount >= totalPrice) {
            return "Paid";
        } else return "Unpaid";
    }
}
