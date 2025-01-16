public class Animal {
    public void sound(){
        System.out.println("An animal makes sound");
    }

    public static class Dog extends Animal{
        @Override
        public void sound(){
            System.out.println("A Dog barks");
        }

    }

   public static class Cat extends Animal{
        @Override
        public void sound(){
            System.out.println("A cat meows");
        }

    }
}
