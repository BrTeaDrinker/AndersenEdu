import java.util.ArrayList;

public class ExecutionProduct {
    public static void main(String[] args) {
        ArrayList<Product> setOfProduct = new ArrayList<Product>();
        int i;
        for (i = 0; i<10;i++){
            setOfProduct.add(new Product());
        }

        System.out.println("Список товаров");
        System.out.println("Код :: Цена");
        for (i = 0; i<10;i++){
            System.out.println(setOfProduct.get(i).code + " :: " + setOfProduct.get(i).price);
        }

    }
}
