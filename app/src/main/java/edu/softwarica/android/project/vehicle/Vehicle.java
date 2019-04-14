package edu.softwarica.android.project.vehicle;

public class Vehicle {
    private int id;
    private String manufacturer, color;
    private int year;
    private float price, engine;

    public Vehicle(int id, String manufacturer, String color, int year, float price, float engine) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.color = color;
        this.year = year;
        this.price = price;
        this.engine = engine;
    }

    public Vehicle() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getEngine() {
        return engine;
    }

    public void setEngine(float engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", engine=" + engine +
                '}';
    }
}
