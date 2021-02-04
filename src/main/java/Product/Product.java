package Product;

import java.util.Random;

public class Product {
    public int code;
    public double price;
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


}
