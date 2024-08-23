public class Product {
    private int product_ID;
    private String name;
    private int price;

    public void setProduct_ID(int id){
        this.product_ID = id;    
    }

    public void setName(String name){
        this.name = name;
    }

    public  void setPrice(int price){
        this.price = price;
    }

    public int getProduct_ID(){
        return this.product_ID;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public static void main(String[] args){
        Product product1 = new Product();
        product1.setProduct_ID(22);
        product1.setName("Ram");
        product1.setPrice(299);

        System.out.println(product1.getProduct_ID());
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
    }
}  