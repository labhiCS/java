public class Ram {
    int num, den;
    public Ram(){
        this.num = 20;
        this.den = 29;

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