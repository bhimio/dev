package mod2.Demo.src;
public class App {
    
    public static void main(String[] args) {
        
        Dog myDog = new Dog();
        myDog.setName("spot");
        myDog.setWeight(34.0);
        myDog.setOwner("bhima");

        Dog anotherDog = new Dog("buster", 23.5, "yuga");

        String anotherDogOwner = anotherDog.getOwner();
    }
}
