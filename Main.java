public class Main {

    public static void main(String[] args) {

        Animal a1 = new Animal("Cat", "Aysel", 3);
        Animal a2 = new Animal("Cat", "Aysel", 3);

        System.out.println(a1);
        System.out.println("a1 equals a2: " + a1.equals(a2));

        Dog d1 = new Dog("Max", "Murad", 5, "Labrador");
        Dog d2 = new Dog("Max", "Murad", 5, "Labrador");

        System.out.println(d1);
        System.out.println("d1 equals d2: " + d1.equals(d2));

        // Exception handling example
        try {
            Animal a3 = new Animal("Bird", "Nigar", -2);
            System.out.println(a3);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}