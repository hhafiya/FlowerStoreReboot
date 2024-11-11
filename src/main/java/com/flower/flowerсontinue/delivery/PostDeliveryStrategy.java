package com.flower.flowerсontinue.delivery;

import java.util.List;
import com.flower.flowerсontinue.flower.Item;

public class PostDeliveryStrategy implements Delivery{
    private String description;
    @Override
    public String deliver(List<Item> items) {
        return ("Delivering order" +  items.size()
        + " using Post Delivery.");
    }

    public String getDescription() {
        return description;
    }
}
