import controllers.CreditCardPaymentGateway;
import controllers.PaymentGateway;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new CreditCardPaymentGateway(); // Puedes cambiar esta línea por PayPalPaymentGateway
        OrderService orderService = new OrderService(paymentGateway);

        Order order = new Order(100.0); // Supongamos que la orden tiene un total de $100
        orderService.processOrder(order);
    }
}