import java.util.Random;
import java.util.Scanner;

public class EvenCalculate {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = in.nextInt();
        double mod=number%2;
        if (mod == 0.0){
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}
