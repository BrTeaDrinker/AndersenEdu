package WorkWithModifier;

public class ClassWithPackageModifier {
    public void callPublic(){
        System.out.println("Вызываю пояснительную бригаду, пыщ пыщ");
    }
    void callPackagePrivetMethod(){
        System.out.println("Я вызываюсь только внутри пакета в котором лежит мой класс");
    }
}
