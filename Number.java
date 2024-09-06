//Copy Constructor

public class Number {
    int num, den;
    public Number(){
        this.num = 55;
        this.den = 0; 
    }

    public Number (Number n){
        this.num = n.num;
        this.den = n.den;
    }

    public void display(){
        System.out.println("The number is: " + num);
        System.out.println("Another number is: "+ den);
    }

    public static void main (String []args){
        Number a = new Number();
        Number a1 = new Number(a);

        a1.display();
    }
    
}
