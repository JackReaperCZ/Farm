import Flowers.Flower;

import java.util.ArrayList;
import java.util.Random;

public class Farm {
    private double freeSpace;
    private ArrayList<Flower> plantedFlowers = new ArrayList<>();

    public Farm(double size) {
        this.freeSpace = size;
    }

    public boolean plant(Flower flower){
        if (flower.getNeededArea()>freeSpace){
            System.out.println("Not enough space on field.");
            return false;
        } else {
            plantedFlowers.add(flower);
            freeSpace-=flower.getNeededArea();
            System.out.println("Flower planted successfully.");
            return true;
        }
    }

    public void harvest(){
        for (Flower f: plantedFlowers) {
            double grownChance = f.getChanceOfGrowth();
            Random r = new Random();
            double chance = r.nextDouble(100);
            if (chance<=grownChance){
                System.out.println("You have harvested : "  + f + " successfully.");
            } else {
                System.out.println("You failed to harvested : "  + f + " successfully.");
            }
        }
        plantedFlowers = new ArrayList<>();
    }
    public void water(){
        for (Flower f : plantedFlowers){
            f.water();
        }
    }
}