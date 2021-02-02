import java.util.Scanner;

public class WorkWithCycle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число для расчета факториала");
        int number = in.nextInt();
        System.out.println("Факториал числа " + number + ": " + Factorial(number));
    }


    public static int Factorial(int number){
        int i = number-1;
        while (i>0){
            number *= i;
            i--;
        }
        if (number <=1) number = 1;
        return number;
    }
}
