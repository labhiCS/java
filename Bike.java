abstract class Bike {
    abstract void run();

class Honda extends Bike{
    void run(){
        System.out.println("Honda is running safely.");
    }
}
public class Main{
    public  void main(String[]args){  //use static after public
    Bike h1 = new Honda();
    h1.run();
}   

}
}
