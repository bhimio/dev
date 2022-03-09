package mod2.Demo.src;

public class Dog {

    private String name;
    private double weight;
    private String owner;

    public Dog() {
        
    }
    
    public Dog(String nameIn, double weightIn, String ownerIn) {
        this.name = nameIn;
        this.weight = weightIn;
        this.owner = ownerIn;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public void bark() {
        System.out.println("WOOF!");
    }
    
    public void sit() {
        System.out.println("Sitting...");
    }

    public void happyOmeter(boolean goodOrBad) {
        if (goodOrBad) {
            System.out.println("waging...");
        } else {
            System.out.println("wimper...");
        }
    }
    
}
