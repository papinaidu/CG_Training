class Order{
   int orderId;
   String orderDate;
   Order(int orderId, String orderDate){
       this.orderId = orderId;
       this.orderDate = orderDate;
   }

   void getOrderStatus(){
       System.out.println("Order ID: " + orderId);
       System.out.println("Order Date: " + orderDate);
   }
}

class ShippedOrder extends Order{
   int trackingNumber;
   ShippedOrder(int orderId, String orderDate, int trackingNumber){
       super(orderId, orderDate);
       this.trackingNumber = trackingNumber;
   }
   void getOrderStatus(){
       super.getOrderStatus();
       System.out.println("Shipping Order ID: " + orderId);
   }
}

class DeliveredOrder extends ShippedOrder{
   String deliveryDate;
   DeliveredOrder(int orderId, String orderDate, int trackingNumber,  String deliveryDate){
       super(orderId, orderDate, trackingNumber);
       this.deliveryDate = deliveryDate;
   }
   void getOrderStatus(){
       super.getOrderStatus();
       System.out.println("Delivery Date: " + deliveryDate);
   }
}
public class Main {
   public static void main(String[] args) {
       Order o = new Order(1234, "12-2-2025");
       o.getOrderStatus();
       ShippedOrder s = new ShippedOrder(1234, "12-2-2025", 245653242);
       s.getOrderStatus();
       DeliveredOrder d = new DeliveredOrder(1234, "12-2-2025", 245653242, "20-2-2025");
       d.getOrderStatus();
   }
}