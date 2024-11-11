package com.flower.flowerсontinue.flower.decorators;

import com.flower.flowerсontinue.flower.Item;

public abstract class ItemDecorator extends Item {
    protected Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
