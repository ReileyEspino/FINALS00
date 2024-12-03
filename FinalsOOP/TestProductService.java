import java.util.List;

public class TestProductService {
    public static void main(String[] args) {
        ProductService productService = new ProductService();

        // Adding a product
        productService.addProduct("Product A", 25.50, 100);

        // Retrieve and print all products
        List<Product> products = productService.getProducts();
        for (Product product : products) {
            System.out.println("ID: " + product.getProductId() + ", Name: " + product.getProductName() + ", Price: " + product.getPrice() + ", Stock: " + product.getStock());
        }

        // Updating a product
        productService.updateProduct(1, "Updated Product A", 30.00, 120);

        // Deleting a product
        productService.deleteProduct(1);
    }
}
