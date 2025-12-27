import java.util.*;

// ---------------------- Abstract Car ----------------------
abstract class Car {
    private int tires = 4;
    private int brake = 4;

    public int getTires() { return tires; }
    public int getBrake() { return brake; }

    public abstract void start();
    public abstract void stop();
    public abstract void honk();
}

// ---------------------- Interfaces ----------------------
interface Icarplay {
    void showMap();
    void playMusic();
}

interface Isunroof {
    void openSunroof();
    void closeSunroof();
}

// ---------------------- HondaCity ----------------------
class HondaCity extends Car implements Icarplay {
    private String engineNumber;
    private String modelMake;

    // Constructor
    HondaCity(String engineNumber, String modelMake) {
        this.engineNumber = engineNumber;
        this.modelMake = modelMake;
    }

    // Getters/Setters
    public String getEngineNumber() { return engineNumber; }
    public String getModelMake() { return modelMake; }
    public void setEngineNumber(String engineNumber) { this.engineNumber = engineNumber; }
    public void setModelMake(String modelMake) { this.modelMake = modelMake; }

    // Car methods
    @Override
    public void start() { System.out.println("Honda City started"); }
    @Override
    public void stop() { System.out.println("Honda City stopped"); }
    @Override
    public void honk() { System.out.println("Beep Beep"); }

    // Icarplay methods
    @Override
    public void showMap() { System.out.println("Map opened"); }
    @Override
    public void playMusic() { System.out.println("Playing music"); }

    // Display
    public void displayHondaCity() {
        System.out.println("Honda City: " + engineNumber + " " + modelMake);
    }
}

// ---------------------- HondaCityPlus ----------------------
class HondaCityPlus extends HondaCity {
    private boolean fastAcceleration;

    HondaCityPlus(String engineNumber, String modelMake, boolean fastAcceleration) {
        super(engineNumber, modelMake);
        this.fastAcceleration = fastAcceleration;
    }

    public boolean getFastAcceleration() { return fastAcceleration; }
    public void setFastAcceleration(boolean fastAcceleration) { this.fastAcceleration = fastAcceleration; }

    // Override display for extra info
    @Override
    public void displayHondaCity() {
        System.out.println("Honda City Plus: " + getEngineNumber() + " " + getModelMake() + " Fast Acceleration: " + fastAcceleration);
    }
}

// ---------------------- Showroom ----------------------
class Showroom {
    private HondaCity[] inventory;
    private int cnt = 0;

    public Showroom(int size) {
        inventory = new HondaCity[size];
    }

    public void addCar(HondaCity car) {
        if(cnt == inventory.length) {
            System.out.println("Showroom full, cannot add car.");
            return;
        }
        inventory[cnt++] = car;
    }

    public HondaCity sellCar() {
        if(cnt == 0) {
            System.out.println("No cars to sell");
            return null;
        }
        HondaCity sold = inventory[--cnt];
        inventory[cnt] = null;
        return sold;
    }

    public void displayInventory() {
        if(cnt == 0) {
            System.out.println("Showroom is empty");
            return;
        }
        for(int i = 0; i < cnt; i++) {
            inventory[i].displayHondaCity();
        }
    }
}

// ---------------------- Main Class ----------------------
public class CarDesign {
    public static void main(String[] args) {
        Showroom showroom = new Showroom(5);

        HondaCity city1 = new HondaCity("ENG123", "2025 Model");
        HondaCity city2 = new HondaCity("ENG124", "2024 Model");
        HondaCityPlus cityPlus1 = new HondaCityPlus("ENG200", "2025 Plus", true);

        // Add cars
        showroom.addCar(city1);
        showroom.addCar(city2);
        showroom.addCar(cityPlus1);

        System.out.println("Cars in showroom:");
        showroom.displayInventory();

        // Sell last car
        System.out.println("\nSelling last car added...");
        HondaCity soldCar = showroom.sellCar();
        if(soldCar != null) {
            System.out.println("Sold car:");
            soldCar.displayHondaCity();
        }

        // Remaining cars
        System.out.println("\nRemaining cars in showroom:");
        showroom.displayInventory();
    }
}
