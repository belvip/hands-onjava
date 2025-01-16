public class PolymorphismExample {
    public static void main(String[] args) {
        // Base class reference, different objects instance
        Animal animal;

        animal = new Animal.Dog();
        animal.sound();

        animal = new Animal.Cat();
        animal.sound();

    }
}
