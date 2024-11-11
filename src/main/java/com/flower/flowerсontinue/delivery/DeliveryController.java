package com.flower.flowerсontinue.delivery;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flower.flowerсontinue.flower.Flower;
import com.flower.flowerсontinue.flower.Item;
import com.flower.flowerсontinue.order.Order;

@RestController
public class DeliveryController {
    Delivery delivery;
    @GetMapping("/delivery")
    public String getDelivery(Order order, Delivery delivery) {
        List<Item> items = new ArrayList<>();
        items.add(new Flower());
        items.add(new Flower());
        delivery.deliver(items);
        return "Delivery completed";
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
}
