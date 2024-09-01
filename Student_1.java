//import java.security.PublicKey;
//import java.sql.PseudoColumnUsage;

public class Student_1 {
    private int age;
    private String name;

    public void setAge(int age){
        this.age = age;
    }

    public  void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;       
    }

    public static void main(String[] args) {
        Student_1 student_1 = new Student_1();
        student_1.setAge(19);
        student_1.setName("Abhishek Lamichhane.");

        System.out.println("Name: " + student_1.getName());
        System.out.println("Age: " + student_1.getAge());
        
    }   
}