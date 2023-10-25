package org.shevtsov.task5;

public class VacuumCleaner extends Appliance {
    private double power;

    public VacuumCleaner(String name, double price, String description, double dimensions, double power) {
        super(name, price, description, dimensions);
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("Power: " + power+'\n');
        return  stringBuilder.toString();
    }
}

