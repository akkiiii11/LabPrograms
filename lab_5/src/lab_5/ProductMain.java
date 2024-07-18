//Write a Java programming to create a e-commerce system with three classes product customer and 
//order, online product and physical product are implementation of Product interface. product 
//interface has list of product as method for adding them. Product should be the interface with 
//methods show product, add product, delete product, and calculate product prize


// package declaration
package lab_5;

// import statements
import java.util.ArrayList;
import java.util.List;

//interface Product declaration
interface Product {
	
	// method to show product details
    void showProduct();
    
 // method to calculate the price of the product
    double calculatePrice();
}

//class OnlineProduct implements Product
class OnlineProduct implements Product {
	
	// fields for product ID, name, price, and shipping cost
    private final int productId;
    private final String name;
    private final double price;
    private final double shippingCost;

 // constructor to initialize the online product
    public OnlineProduct(int productId, String name, double price, double shippingCost) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.shippingCost = shippingCost;
    }

 // overriding the showProduct method
    @Override
    public void showProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs." + price);
        System.out.println("Shipping Cost: Rs." + shippingCost);
    }

 // overriding the calculatePrice method
    @Override
    public double calculatePrice() {
        return price + shippingCost;
    }
}

//class PhysicalProduct implements Product
class PhysicalProduct implements Product {
	
	// fields for product ID, name, price, and weight
    private final int productId;
    private final String name;
    private final double price;
    private final double weight;

 // constructor to initialize the physical product
    public PhysicalProduct(int productId, String name, double price, double weight) {
    	this.productId = productId;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

 // overriding the showProduct method
    @Override
    public void showProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs." + price);
        System.out.println("Weight: " + weight + " kg");
    }

 // overriding the calculatePrice method
    @Override
    public double calculatePrice() {
        return price;
    }
}

//creating a class Customer
 class Customer {
    private final int customerId;
    final String name;
    private final String address;

 // constructor to initialize the customer
    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }
}
 
//creating a class Order
 class Order {
	 
	// fields for order ID, customer, and products
    private final int orderId;
    private final Customer customer;
    private final List<Product> products;

 // constructor to initialize the order
    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

 // method to add a product to the order
     void addProduct(Product product) {
        products.add(product);
    }

  // method to calculate the total price of the order
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.calculatePrice();
        }
        return total;
    }

 // method to show the order details
    public void showOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.name);
        System.out.println("Products:");
        for (Product product : products) {
            product.showProduct();
            System.out.println();
        }
        System.out.println("Total Price: Rs." + calculateTotal());
    }
}

public class ProductMain {
    public static void main(String[] args) {
        
    	// creating a customer object
    	Customer customer1 = new Customer(1, "John Doe", "123 Main St");
        
    	// creating an order object
    	Order order1 = new Order(100, customer1);

    	// adding products to the order
        order1.addProduct(new OnlineProduct(1, "Laptop", 500, 20));
        order1.addProduct(new PhysicalProduct(2, "Headphones", 100, 0.5));

     // showing the order details
        order1.showOrder();
    }
}

/*Dry Run
 
Order ID: 100
Customer: John Doe
Products:
Product ID: 1
Name: Laptop
Price: Rs.500.0
Shipping Cost: Rs.20.0

Product ID: 2
Name: Headphones
Price: Rs.100.0
Weight: 0.5 kg

Total Price: Rs.620.0

*/