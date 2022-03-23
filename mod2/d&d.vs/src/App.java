public class App {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Person p2 = new Person();
        p.setName("mary");
        p2.setAge(19);

        System.out.println(p.getAge()); // prints 19
        System.out.println(p2.getName()); // prints Mary
    }
}
