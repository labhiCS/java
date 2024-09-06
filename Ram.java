public class Ram {
    int num, den;
    public Ram(){
        this.num = 25;
        this.den = 50;

    }
    public void display(){
        System.out.println("num: " + num);
        System.out.println("den: " + den);

    }
    public static void main(String[]args){
    Ram obj = new Ram();
    obj.display();
    }
}