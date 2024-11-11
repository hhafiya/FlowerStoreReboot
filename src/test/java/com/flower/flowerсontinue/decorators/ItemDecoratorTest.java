package com.flower.flowerсontinue.decorators;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flower.flowerсontinue.flower.Flower;
import com.flower.flowerсontinue.flower.FlowerType;
import com.flower.flowerсontinue.flower.Item;
import com.flower.flowerсontinue.flower.decorators.BasketDecorator;
import com.flower.flowerсontinue.flower.decorators.PaperDecorator;
import com.flower.flowerсontinue.flower.decorators.RibbonDecorator;

public class ItemDecoratorTest {
    private Item flower;

    @BeforeEach
    void setUp() {
        flower = new Flower((long) 24, "RED", 3, 10.0, FlowerType.ROSE);
        flower.setDescription("Rose");
    }

    @Test
    void testPaperDecorator() {
        Item paperWrappedFlower = new PaperDecorator(flower);

        assertEquals("Rose, paper", paperWrappedFlower.getDescription());
        assertEquals(23.0, paperWrappedFlower.getPrice(), 0.01);
    }

    @Test
    void testRibbonDecorator() {
        Item ribbonWrappedFlower = new RibbonDecorator(flower);

        assertEquals("Rose, ribbon", ribbonWrappedFlower.getDescription());
        assertEquals(50.0, ribbonWrappedFlower.getPrice(), 0.01);
    }

    @Test
    void testCombinedDecorators() {
        Item decoratedFlower = new PaperDecorator(new RibbonDecorator(flower));

        assertEquals("Rose, ribbon, paper", decoratedFlower.getDescription());
        assertEquals(63.0, decoratedFlower.getPrice(), 0.01);
    }

    @Test
    void testBasketDecorator() {
        Item basketWrappedFlower = new BasketDecorator(flower);

        assertEquals("Rose, basket", basketWrappedFlower.getDescription());
        assertEquals(14.0, basketWrappedFlower.getPrice(), 0.01);
    }

    @Test
    void testCombinedBasketAndPaperDecorator() {
        Item decoratedFlower = new BasketDecorator(new PaperDecorator(flower));

        assertEquals("Rose, paper, basket", decoratedFlower.getDescription());
        assertEquals(27.0, decoratedFlower.getPrice(), 0.01);
    }

    @Test
    void testCombinedBasketRibbonAndPaperDecorators() {
        Item fullyDecoratedFlower = new BasketDecorator(new RibbonDecorator(new PaperDecorator(flower)));

        assertEquals("Rose, paper, ribbon, basket", fullyDecoratedFlower.getDescription());
        assertEquals(67.0, fullyDecoratedFlower.getPrice(), 0.01);
    }
}
