package ua.edu.ucu.apps.lab_8.decorator;

import ua.edu.ucu.apps.lab_8.model.Flower;

public class RibbonDecorator extends FlowerDecorator {

    public RibbonDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 40;
    }

    @Override
    public String getDescription() {
        return item.getName() + " with ribbon.";
    }

}