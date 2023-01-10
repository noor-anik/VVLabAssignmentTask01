public class Admin {
    int Id;
    String Name;

    Admin(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    public void addProduct(Products productsList, int productId, String productName, String productGroup, int productPrice) {
        productsList.addProduct(productId, productName, productGroup, productPrice);
    }

    public void deleteProduct(Products productsList, int productId) {
        productsList.deleteProduct(productId);
    }

    public void productsList(Products productsList) {
        productsList.viewAllProducts();
    }
}
