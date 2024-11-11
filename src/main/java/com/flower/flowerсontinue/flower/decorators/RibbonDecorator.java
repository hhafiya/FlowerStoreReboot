package com.flower.flowerсontinue.flower.decorators;

import com.flower.flowerсontinue.flower.Item;

public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", ribbon";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 40.0; 
    }
}
