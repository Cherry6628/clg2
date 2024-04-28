class Order {
    private int orderid;
    private String orderedfood;
    private double totalprice;
    private String status;

    public Order(int orderid, String orderedfood) {
        this.orderid = orderid;
        this.orderedfood = orderedfood;
    }

    public double calculateTotalPrice(int unitPrice) {
        double totalPrice = unitPrice * 1.05; // Applying a service charge of 5%
        this.totalprice = totalPrice;
        return totalPrice;
    }

    // Getters and setters for the instance variables
    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getOrderedfood() {
        return orderedfood;
    }

    public void setOrderedfood(String orderedfood) {
        this.orderedfood = orderedfood;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

public class Farm {
    public static void main(String[] args) {
        Order order = new Order(1, "Pizza");
        double totalPrice = order.calculateTotalPrice(10);
        order.setStatus("Pending");

        System.out.println("Order ID: " + order.getOrderid());
        System.out.println("Ordered Food: " + order.getOrderedfood());
        System.out.printf("Total Price: %.2f%n", order.getTotalprice()); // formatting total price to two decimal places
        System.out.println("Status: " + order.getStatus());
    }
}
