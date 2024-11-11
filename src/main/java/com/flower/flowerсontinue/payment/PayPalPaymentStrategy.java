package com.flower.flowerсontinue.payment;

import lombok.Setter;

@Setter
public class PayPalPaymentStrategy implements Payment {
    private String email;

    @Override
    public String pay(double price) {
        return ("Paying " + price + " using PayPal account: " + email + ".");
    }
}
