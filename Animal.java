public class Animal {
    public void eat(){
        System.out.println("Animal can eat.");

    }
public Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks.");
    }

public class Pitbull extends Dog{
    public void colour(){
        System.out.println("He is brown in colour.");
    }
}

public class MultilevelInherit{
    public static void main(String []args){
        Pitbull pet_1 = new Pitbull();
        pet_1.eat();
        pet_1.bark();
        pet_1.colour();
    }
}
}
    
}
