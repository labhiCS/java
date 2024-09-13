public class HierarchicalInherit {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Pitbull pitbull = new Pitbull();
        pitbull.eat();
        pitbull.colour();
    }

    // Inner class Animal
    static class Animal {
        public void eat() {
            System.out.println("Animal can eat food.");
        }
    }

    // Inner class Dog extends Animal
    static class Dog extends Animal {
        public void bark() {
            System.out.println("Dog can barks.");
        }
    }

    // Inner class Pitbull extends Animal
    static class Pitbull extends Animal {
        public void colour() {
            System.out.println("My pet pitbull is brown and white in colour.");
        }
    }
}
