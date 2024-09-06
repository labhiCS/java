public class Constructor {
    int num, den;
    public Constructor(){
        this.num = 55;
        this.den = 0;
    }

    public Constructor(int a, int b){
        this.num = a;
        this.den = b; 
    }

    public Constructor (Constructor n){
        this.num = n.num;
        this.den = n.den;
    }

    public void display(){
        System.out.println("* The number is: " + num);
        System.out.println("* Another number is: "+ den);
    }

    public static void main (String []args){
        Constructor a = new Constructor();
        Constructor a1 = new Constructor(20, 30);
        Constructor a2 = new Constructor(a);

        System.out.println("Default Constructor."); 
        a.display();
        System.out.println("\n"); 
        
        System.out.println("Parameterized Constructor."); 
        a1.display();
        System.out.println("\n");

        System.out.println("Copy Constructor."); 
        a2.display();
    }
    
}
