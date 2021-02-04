package WorkWithModifier;

public class ClassWithModifier {
    public void opened(){
        System.out.println("Вот он я - открытый метод");
    }
    private void inofficial(){
        System.out.println("Закрытый в калуарах метод");
    }
    protected void defend(){
        System.out.println("Я типа метод. Типа с бодигардом, но без бодигарда и вообще я защищенный метод");
    }

    public static void callWithoutObject(){
        System.out.println("лол. мне не нужен экземпляр класса для вызова. ПНХ");
    }

}
