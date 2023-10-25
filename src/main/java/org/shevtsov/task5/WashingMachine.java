package org.shevtsov.task5;

public class WashingMachine extends Appliance {
    private boolean hasDryer;
    private double batteryLife;

    public WashingMachine(String name, double price, String description, double dimensions, boolean hasDryer, double batteryLife) {
        super(name, price, description, dimensions);
        this.hasDryer = hasDryer;
        this.batteryLife = batteryLife;
    }

    public boolean isHasDryer() {
        return hasDryer;
    }

    public void setHasDryer(boolean hasDryer) {
        this.hasDryer = hasDryer;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("Has Dryer: " + hasDryer + '\n');
        stringBuilder.append("Battery Life: " + batteryLife + '\n');
        return stringBuilder.toString();
    }
}
