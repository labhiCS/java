public class Num {
    int num, den;
    public Num(int a, int b){
        this.num = a;
        this.den = b;

    }
    public void display(){
        System.out.println("The assigned number is: " + num);
        System.out.println("Another number is: "+ den);
    }

    public static void main (String []args){
        Num a = new Num(55, 155);
        a.display();
    }
    
}
