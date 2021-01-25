import java.util.ArrayList;
import java.util.Scanner;

public class ExecutionProduct {
    public static void main(String[] args) {
        ArrayList<Product> setOfProduct = new ArrayList<Product>();
        int index;
        for (index = 0; index <10; index++){
            setOfProduct.add(new Product());
        }

        System.out.println("Список товаров");
        System.out.println("Код :: Цена");
        for (index = 0; index <10; index++){
            System.out.println(setOfProduct.get(index).code + " :: " + setOfProduct.get(index).price);
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Введите код продукта, по которому необходимо найти цену");
        int code = in.nextInt();

        index = 0;
        do{
            if (setOfProduct.get(index).code == code) {
                System.out.println("Цена для продукта с кодом '" + code + "': " + setOfProduct.get(index).price);
                break;
            }
            index++;
        }while (index < setOfProduct.size());
        if (index == setOfProduct.size()){
            System.out.println("Вы ебобо и товара с данным кодом не существует");
        }
    }
}
