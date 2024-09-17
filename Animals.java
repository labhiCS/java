public class Animals {

    public final void makeSound() {
        System.out.println("Animal sound");
    }
    
}
public class Dog extends Animal {

    public void wagTail() {
        System.out.println("Wagging tail");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Outputs: Animal sound
        dog.wagTail();   // Outputs: Wagging tail
    }
}
