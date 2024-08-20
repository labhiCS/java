package java;

public class Aa{
    public void display(String name){
        System.out.println(name);
    }
    
    public void display(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args){
        Aa a = new Aa();
        a.display("Abhi");
        a.display("Abhishek", 20);
    }
}