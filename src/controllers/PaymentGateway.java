package controllers;

public interface PaymentGateway {

    public String processPayment(Double amount);
}
