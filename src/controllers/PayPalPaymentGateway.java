package controllers;

public class PayPalPaymentGateway implements PaymentGateway {


    @Override
    public String processPayment(Double amount) {
        return String.format("Procesando pago de paypal por %s", amount);
    }
}
