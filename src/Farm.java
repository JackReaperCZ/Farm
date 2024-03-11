import Flowers.Flower;

import java.util.ArrayList;

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
            return true;
        }
    }
}