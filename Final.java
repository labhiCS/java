public class Final {
    final int age = 18;

    void display(){
        System.out.println("Eligible to vote.");
    }
    
    public static void  main(String[]args){
        Final obj = new Final();
        obj.display();
        System.out.println("Age: " + obj.age); // Print the constant value.
    }
}