public class Interface {
    void print();
    
class A implements Interface{
    public void print(){
        System.out.println("Hello World.");
    }

}
public static void main(String[] args){
    A obj = new A();
    obj.print();
}
}
