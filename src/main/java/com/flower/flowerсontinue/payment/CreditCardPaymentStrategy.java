package com.flower.flowerсontinue.payment;

import lombok.Setter;

@Setter
public class CreditCardPaymentStrategy implements Payment {
    private String cardHolderName;

    @Override
    public String pay(double price) {
        return ("Processing credit card payment for " + cardHolderName + " of amount " + price + ".");
    }
}
