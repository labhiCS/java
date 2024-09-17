final public class Person {
    private String firstname;

    public String getfirstname(String firstname){
        return firstname;
    }

    public void setfirstname (){
        this.firstname = firstname;
    }

    public static void main (String []args){
        Person obj = new Person();
        obj.getfirstname("Abhishek");
    }