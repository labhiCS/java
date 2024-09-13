public class Overloading {
    int num, den;
    public Overloading(){
        this.num = 1;
        this.den = 0;

    }
    
    public Overloading(int a, int b){
        this.num = a;
        this.den = b;
    }

    public Overloading(Number o){
        this.num = o.num;
        this.den = o.den;
    }

    public void Display(){
        System.out.println("num: " + num);
        System.out.println("den: " + den);
    }

    public static void main(String[]args){
        Overloading o = new Overloading();
        Overloading o1 = new Overloading(44, 55);
        Overloading o2 = new Overloading();

        o.Display();
        o1.Display();
        o2.Display();
    }
}
