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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getSpecialCare() {
        return specialCare;
    }

    public void setSpecialCare(String specialCare) {
        this.specialCare = specialCare;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
    public void pet(){
        System.out.println("You have petted : " + this);
    }
}
