package org.shevtsov.task5;

public class Stove extends Appliance {
    private String type;

    public Stove(String name, double price, String description, double dimensions, String type) {
        super(name, price, description, dimensions);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("Type: " + type + '\n');
        return stringBuilder.toString();
    }
}