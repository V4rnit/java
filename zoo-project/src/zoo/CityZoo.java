package zoo;

import java.util.ArrayList;
import java.util.List;

public class CityZoo extends Zoo implements Restaurant {
    static final int CAPACITY = 100;

    private ArrayList<Animal> animals;
    private ArrayList<String> menu;

    public CityZoo(int staffNo, int animalNo, double area, String name) throws InvalidZooException {
        super(staffNo, animalNo, area, name);
        this.animals = new ArrayList<>();
        this.menu = new ArrayList<>();
    }

    // Animal management
    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public void removeAnimal(Animal a) {
        animals.remove(a);
    }

    public void displayAnimals() {
        for (Animal a : animals) {
            a.displayAnimal();
        }
    }

    // Restaurant implementation
    @Override
    public List<String> getMenu() {
        return new ArrayList<>(menu); // return a copy for safety
    }
    @Override
    public void displayMenu(){
        for(String m : menu){
            System.out.println(m);
        }
    }
    public void addItem(String item) {
        menu.add(item);
    }

    public void removeItem(String item) {
        menu.remove(item);
    }
}
