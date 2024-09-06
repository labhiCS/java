public class Num {
    int num, den;
    public Num(int a, int b){
        this.num = a;
        this.den = b;

    }
    public void display(){
        System.out.println("num: " + num);
        System.out.println("den: "+ den);
    }

    public static void main (String []args){
        Num a = new Num(10, 20);
        a.display();
    }
    
}
