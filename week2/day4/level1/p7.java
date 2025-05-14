import java.util.ArrayList;

class ECommercePlatform {
    String platformName;

    ECommercePlatform(String platformName) {
        this.platformName = platformName;
    }

    void showDetails() {
        System.out.println("E-Commerce Platform: " + platformName);
    }
}

class Customer {
    String name;
    int id;
    ArrayList<Order> orders;

    Customer(String name, int id) {
        this.name = name;
        this.id = id;
        orders = new ArrayList<>();
    }

    void placeOrder(Order order) {
        orders.add(order);
        order.setCustomer(this);
        System.out.println(name + " has placed an order.");
    }

    void showOrders() {
        System.out.println(name + "'s Orders:");
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}

class Order {
    int orderId;
    Customer customer;
    ArrayList<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    void setCustomer(Customer customer) {
        this.customer = customer;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in Order: ");
        for (Product product : products) {
            System.out.println(product.getProductName() + " | Price: $" + product.getPrice());
        }
    }
}

class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    String getProductName() {
        return productName;
    }

    double getPrice() {
        return price;
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        ECommercePlatform platform = new ECommercePlatform("Shopify");

        Customer customer1 = new Customer("John Doe", 101);
        Customer customer2 = new Customer("Alice White", 102);

        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 599.99);
        Product product3 = new Product("Headphones", 99.99);

        Order order1 = new Order(1001);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(1002);
        order2.addProduct(product3);

        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        platform.showDetails();
        
        customer1.showOrders();
        customer2.showOrders();
    }
}