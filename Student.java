public class Student {
    String name;
    int rollno;
    
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("rollno: " + rollno);
        

    }
    
    public static void main(String[] args){
        
        Student student1 = new Student();
        student1.name = "Abhishek";
        student1.rollno = 2;
        

        Student student2 = new Student();
        student2.name = "siddhi";
        student2.rollno = 24;
        

        System.out.println("Detail of student: ");
        student1.displayDetails();

        System.out.println("Details of student2: ");
        student2.displayDetails(); 
    }

}