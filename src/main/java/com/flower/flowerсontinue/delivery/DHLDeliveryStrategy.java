package com.flower.flowerсontinue.delivery;

import java.util.List;

import com.flower.flowerсontinue.flower.Item;

public class DHLDeliveryStrategy implements Delivery {
    private String description;

    public DHLDeliveryStrategy() {
        this.description = "DHL delivery";
    }

    @Override
    public String deliver(List<Item> items) {
        return ("Delivering" + items.size() 
                    + " items using DHL Delivery.");
    }

    public String getDescription() {
        return description;
    }
}
