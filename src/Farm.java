import Animals.Animal;
import Animals.Size;
import Flowers.Flower;

import java.util.ArrayList;
import java.util.Random;

public class Farm {
    private double freeSpace;
    private ArrayList<Flower> plantedFlowers = new ArrayList<>();
    private ArrayList<Animal> barn = new ArrayList<>();
    private int barnSize;
    private int numberOfBigAnimals = 0;
    private int numberOfSmallAnimals = 0;

    public Farm(double freeSpace, int barnSize) {
        this.freeSpace = freeSpace;
        this.barnSize = barnSize;
    }

    public boolean plant(Flower flower) {
        if (flower.getNeededArea() > freeSpace) {
            System.out.println("Not enough space on field.");
            return false;
        } else {
            plantedFlowers.add(flower);
            freeSpace -= flower.getNeededArea();
            System.out.println("Flower planted successfully.");
            return true;
        }
    }

    public void harvest() {
        for (Flower f : plantedFlowers) {
            double grownChance = f.getChanceOfGrowth();
            Random r = new Random();
            double chance = r.nextDouble(100);
            if (chance <= grownChance) {
                System.out.println("You have harvested : " + f + " successfully.");
            } else {
                System.out.println("You failed to harvested : " + f + " successfully.");
            }
        }
        plantedFlowers = new ArrayList<>();
    }

    public void water() {
        for (Flower f : plantedFlowers) {
            f.water();
        }
    }

    public boolean buy(Animal animal) {
        Size size = animal.getSize();
        if (barn.size() == barnSize) {
            System.out.println("Nedostatek místa.");
            return false;
        } else {
            switch (size) {
                case BIG -> {
                    if (numberOfBigAnimals == (barnSize / 2)) {
                        System.out.println("Nedostatek místa.");
                        return false;
                    } else {
                        System.out.println("You bought : " + animal);
                        numberOfBigAnimals++;
                        return true;
                    }
                }
                case SMALL -> {
                    if (numberOfSmallAnimals == (barnSize / 2)) {
                        System.out.println("Nedostatek místa.");
                        return false;
                    } else {
                        System.out.println("You bought : " + animal);
                        numberOfSmallAnimals++;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}