import java.util.Scanner;

public class ThrowExceptionn {

    static void canVote(int age){
        try{
            if(age<18){
                throw new Exception("Ineligible to vote ");
            }
            
            else{
                System.out.println("Eligible to vote");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = s.nextInt();

        canVote(age);

        s.close();
    }
}