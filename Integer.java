//Default Constructor
public class Integer{
    int m, n;

    public Integer(){
        this.m = 44;
        this.n = 18;
    }

    public void display(){
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }

    public static void main(String[] args){
        Integer i = new Integer();
        i.display();
    }
}