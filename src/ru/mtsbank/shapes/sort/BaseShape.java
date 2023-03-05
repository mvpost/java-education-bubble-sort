package ru.mtsbank.shapes.sort;

abstract class BaseShape {
    final public Integer weight;
    public BaseShape(Integer weight) {
        this.weight = weight;
    }
    public double calculateDensity() {
        return weight / calculateVolume();
    }
    protected abstract double calculateVolume();
}
