package ua.edu.ucu.apps.lab_8.decorator;

import ua.edu.ucu.apps.lab_8.model.Flower;

public abstract class FlowerDecorator extends Flower {
    protected Flower item;

    public FlowerDecorator(Flower item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    public abstract String getDescription();
}