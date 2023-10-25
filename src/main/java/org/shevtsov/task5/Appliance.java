package org.shevtsov.task5;

public class Appliance {
    private String name;
    private double price;
    private String description;
    private double dimensions;

    public Appliance(String name, double price, String description, double dimensions) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.dimensions = dimensions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDimensions() {
        return dimensions;
    }

    public void setDimensions(double dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: " + name + '\n');
        stringBuilder.append("Price: " + price + '\n');
        stringBuilder.append("Description: " + description + '\n');
        stringBuilder.append("Dimensions: " + dimensions + '\n');
        return stringBuilder.toString();
    }
}
