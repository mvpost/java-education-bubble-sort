package ru.mtsbank.shapes.sort;

public class Sphere extends BaseShape {
    final private Integer radius;
    public Sphere(Integer weight, Integer radius) {
        super(weight);
        this.radius = radius;
    }
    @Override
    protected double calculateVolume() {
        return Math.PI * Math.pow(radius, 3) * 4 /3;
    }

}
