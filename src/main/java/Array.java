import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr;
        arr = new int[random.nextInt(12)];
        double sum = 0;
        double avg;
        System.out.println("Длина массива: " + arr.length);

        for (int i=0;i<arr.length;i++){
            arr[i]= random.nextInt(1024);
            sum += arr[i];
        }
        avg = sum/arr.length;
        System.out.println("Значения в массиве: " + Arrays.toString(arr));
        System.out.println("сумма всех чисел в массиве равна: "+ sum);
        System.out.println("Среднее арифметическое значения для элементов массива равно: " + avg);
    }
}
