package com.flower.flowerсontinue.order;

import java.util.ArrayList;
import java.util.List;

import com.flower.flowerсontinue.delivery.Delivery;
import com.flower.flowerсontinue.diagramUser.User;
import com.flower.flowerсontinue.flower.Flower;
import com.flower.flowerсontinue.flower.Item;
import com.flower.flowerсontinue.payment.Payment;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Order {
    private List<User> users = new ArrayList<>();
    private int orderId;
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;
    
    public void setPaymentStrategy(Payment paymentSrategy) {
        payment = paymentSrategy;
    }
    public void setDeliveryStrategy(Delivery deliverySrategy) {
        delivery = deliverySrategy;
    }

    public void addItem(Flower item) {
        items.add(item);
    }

    public void removeItem(Flower item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public void processOrder() {
        double sum = calculateTotalPrice();
        payment.pay(sum);
        delivery.deliver(items);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUsers() {
        String status = "Order status changed";
        for (User user : users) {
            user.update(status);
        }
    }

    public void order() {
        System.out.println("Order processed.");
        notifyUsers();
    }
}
