package SecondTraining;

public class Smartphone {
    String model;  // State
    int batteryLevel; // State

    // CONSTRUCTOR: Sets the initial state
    public Smartphone(String modelName) {
        this.model = modelName;
        this.batteryLevel = 100; // New phones start at 100%
        System.out.println("Phone created!");
        System.out.println(batteryLevel);
        System.out.println("Test");
    }

    // METHOD: Defines behavior
    public void sendText(String message) {
        if (batteryLevel > 0) {
            System.out.println("Sending: " + message);
            batteryLevel -= 1; // Behavior changes the state
        }
    }

    public static void main(String[] args) {

        Smartphone sp = new Smartphone("nokia1100");
        sp.sendText("Check");


    }
}

