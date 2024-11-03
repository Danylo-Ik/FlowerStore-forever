package ua.edu.ucu.apps.lab_8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ua.edu.ucu.apps.lab_8.model.Flower;
import ua.edu.ucu.apps.lab_8.decorator.*;

public class DecoratorTest {
    @Test
    public void testPaper() {
        Flower flower = new Flower();
        flower.setName("Tulip");
        flower.setPrice(15);

        FlowerDecorator paperDecoFlower = new PaperDecorator(flower);
        assertEquals(28, paperDecoFlower.getPrice());
        assertEquals("Tulip wrapped in paper.", paperDecoFlower.getDescription());
    }

    @Test
    public void testRibbon() {
        Flower flower = new Flower();
        flower.setName("Orchid");
        flower.setPrice(12);

        FlowerDecorator ribbonDecoFlower = new RibbonDecorator(flower);
        assertEquals(52, ribbonDecoFlower.getPrice());
        assertEquals("Orchid with ribbon.", ribbonDecoFlower.getDescription());
    }

    @Test
    public void testBasket() {
        Flower flower = new Flower();
        flower.setName("Iris");
        flower.setPrice(17);

        FlowerDecorator ribbonDecoFlower = new BasketDecorator(flower);
        assertEquals(21, ribbonDecoFlower.getPrice());
        assertEquals("Iris in a basket.", ribbonDecoFlower.getDescription());
    }
}
