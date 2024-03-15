import java.util.Scanner;

// Class to represent appliances
class Appliance {
    private String name;
    private int powerUsage; // in watts

    public Appliance(String name, int powerUsage) {
        this.name = name;
        this.powerUsage = powerUsage;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public String getName() {
        return name;
    }
}

// Class to represent the Home Energy Management System
public class HomeEnergyManagementSystem {
    private static final int MAX_APPLIANCES = 5;
    private Appliance[] appliances;
    private int numAppliances;

    public HomeEnergyManagementSystem() {
        appliances = new Appliance[MAX_APPLIANCES];
        numAppliances = 0;
    }

    public void addAppliance(Appliance appliance) {
        if (numAppliances < MAX_APPLIANCES) {
            appliances[numAppliances++] = appliance;
            System.out.println("Appliance '" + appliance.getName() + "' added.");
        } else {
            System.out.println("Cannot add more appliances. Maximum limit reached.");
        }
    }

    public int getTotalPowerUsage() {
        int totalUsage = 0;
        for (int i = 0; i < numAppliances; i++) {
            totalUsage += appliances[i].getPowerUsage();
        }
        return totalUsage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HomeEnergyManagementSystem system = new HomeEnergyManagementSystem();

        // Adding appliances
        system.addAppliance(new Appliance("Refrigerator", 150)); // Assume power usage in watts
        system.addAppliance(new Appliance("TV", 200));
        system.addAppliance(new Appliance("Washing Machine", 500));

        // Display total power usage
        System.out.println("Total power usage: " + system.getTotalPowerUsage() + " watts");

        scanner.close();
    }
}
