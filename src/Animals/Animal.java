package Animals;

public abstract class Animal {
    protected String name;
    protected Size size;
    protected String specialCare;

    public Animal(String name, Size size, String specialCare) {
        this.name = name;
        this.size = size;
        this.specialCare = specialCare;
    }
}
