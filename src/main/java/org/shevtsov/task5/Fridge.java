package org.shevtsov.task5;

public class Fridge extends Appliance {
    private boolean hasFreezer;
    private int freezerTemperature;

    public Fridge(String name, double price, String description, double dimensions, boolean hasFreezer, int freezerTemperature) {
        super(name, price, description, dimensions);
        this.hasFreezer = hasFreezer;
        this.freezerTemperature = freezerTemperature;
    }

    public boolean isHasFreezer() {
        return hasFreezer;
    }

    public void setHasFreezer(boolean hasFreezer) {
        this.hasFreezer = hasFreezer;
    }

    public int getFreezerTemperature() {
        return freezerTemperature;
    }

    public void setFreezerTemperature(int freezerTemperature) {
        this.freezerTemperature = freezerTemperature;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("Has Freezer: " + hasFreezer + '\n');
        stringBuilder.append("Freezer Temperature: " + freezerTemperature + '\n');
        return stringBuilder.toString();
    }
}