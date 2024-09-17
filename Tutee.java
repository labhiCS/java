public class Tutee {
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if (newAge > 0){
            age = newAge;
        }

        else{
            System.out.println("Age cannot be negative.");
        }
    }

    public static void main (String []args){
        Tutee obj = new Tutee();
        obj.setAge(23);

        Tutee obj1 = new Tutee();
        obj1.setAge(29);


        System.out.println("Student age: " + obj.getAge());
        System.out.println("Student age: " + obj1.getAge());
    }
    
}