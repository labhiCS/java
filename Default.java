public class Default {
    int num, den;
    public Default(){
        this.num = 25;
        this.den = 50;

    }
    public void display(){
        System.out.println("num: " + num);
        System.out.println("den: " + den);

    }
    public static void main(String[]args){
    Default obj = new Default();
    obj.display();
    }
}