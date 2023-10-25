package org.shevtsov.task5;

public class Main {
    public static void main(String[] args) {
        Appliance[] appliances = new Appliance[5];

        appliances[0] = new Fridge("Mini Fridge", 200.0, "Compact refrigerator for small spaces", 50.0, false, 0);
        appliances[1] = new Stove("Gas Stove", 500.0, "Gas-powered stove for cooking", 60.0, "Gas");
        appliances[2] = new WashingMachine("Washer", 400.0, "Washing machine with basic features", 70.0, false, 0);
        appliances[3] = new VacuumCleaner("Robot Vacuum Cleaner", 300.0, "Automated vacuum cleaner for easy cleaning", 40.0, 1500.0);
        appliances[4] = new Fridge("Freezer Fridge", 300.0, "Fridge with built-in freezer compartment", 60.0, true, -18);

        for (Appliance appliance : appliances) {
            System.out.println(appliance.toString());
            System.out.println();
        }
    }
}
