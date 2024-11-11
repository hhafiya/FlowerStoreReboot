package com.flower.flowerсontinue.flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {
    protected String description;
    private double price;
    
    public abstract double getPrice();  

    public String getDescription() {
        return description;
    }
}
