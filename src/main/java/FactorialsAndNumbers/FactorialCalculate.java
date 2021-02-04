package FactorialsAndNumbers;

import java.util.Scanner;

public class FactorialCalculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число для расчета факториала");
        int number = in.nextInt();
        int i=number;
        int factorial=1;
        while (i!=0){
            factorial *=i;
            i--;
        }
        System.out.println("Факториал числа " + number + " - число "+ factorial);
    }

}
