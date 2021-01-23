import java.util.ArrayList;
import java.util.Random;

public class Product {
    int code;
    double price;
    Random random = new Random();

    public int setCode(){
        return this.code = random.nextInt(9999);
    }
    public double setPrice(){
        return this.price = Math.round((random.nextInt(999) + random.nextDouble())*100.00)/100.00;
    }

    public Product(){
        this.code = setCode();
        this.price = setPrice();
    }

    public static void main(String[] args) {
        Product i = new Product();
        System.out.println(i.code + " "+ i.price);
    }


}
