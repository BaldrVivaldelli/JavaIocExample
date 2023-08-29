package controllers;

public class CreditCardPaymentGateway implements PaymentGateway {
    @Override
    public String processPayment(Double amount) {
        return String.format("Procesando pago de tarjeta de crédito por %s", amount);
    }
}
