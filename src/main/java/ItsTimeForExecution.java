import java.util.Scanner;

public class ItsTimeForExecution {
    public static void main(String[] args) {
        ItsTimeFor what = new ItsTimeFor();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вермя суток");
        what.setTime(in.nextDouble());
        System.out.println("Введите количество денег в кармане");
        what.setMoney(in.nextDouble());
        what.ItsTimeForWhat();
        System.out.println(what.NameValue(" - таково имя класса"));
    }
}
