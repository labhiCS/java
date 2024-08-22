//Default Constructor
public class Integer{
    int m, n;

    public Integer(){
        this.m = 1;
        this.n = 1;
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