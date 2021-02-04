package Arrays;

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

        //AVG всех чисел в массиве
        for (int i=0;i<arr.length;i++){
            arr[i]= random.nextInt(1024);
            sum += arr[i];
        }
        avg = sum/arr.length;
        System.out.println("Значения в массиве: " + Arrays.toString(arr));
        System.out.println("сумма всех чисел в массиве равна: "+ sum);
        System.out.println("Среднее арифметическое значения для элементов массива равно: " + avg);

        //Преобразование массива в строку и обратно
        System.out.println("Преобразование массива в строку и обратно");
        String str = Arrays.toString(arr);
        System.out.println(str);
        int[] numArr = Arrays.stream(str.substring(1, str.length()-1).split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(numArr));

        //Добавление каждому элементу массива слово "Hello"
        String [] helloArr = new String[numArr.length];
        int i = 0;
        for (int number: numArr) {
            helloArr[i] = number + " Hello!";
            i++;
        }
        System.out.println("Добавление каждому элементу массива словa \"Hello\"");
        System.out.println(Arrays.toString(helloArr));

        //Преобразование Int в Boolean

    }
}
