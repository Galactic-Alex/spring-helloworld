public class Cat {

    private String name;
    private double weight;

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public void meow() {
        System.out.println("meow");
    }

    public double getWeight() {
        return weight;
    }
}
