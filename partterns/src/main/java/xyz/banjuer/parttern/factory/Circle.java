package xyz.banjuer.parttern.factory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("mine shape is " + this.getClass().getSimpleName());
    }
}
