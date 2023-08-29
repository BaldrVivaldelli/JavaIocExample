package services;

import controllers.PaymentGateway;
import entities.Order;

public class OrderService {

    private PaymentGateway paymentGateway;

    public OrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processOrder(Order order) {
        // Procesar la orden
        String returnValue = paymentGateway.processPayment(order.getTotalAmount());
        System.out.println(returnValue);
        // Más lógica para procesar la orden...
    }
}
