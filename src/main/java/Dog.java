public class Dog implements Animals {

    @Override
    public void grows() {
        System.out.println("А еще я высокий");
    }

    @Override
    public void weight() {
        System.out.println("Вешу много киллограм");
    }

    @Override
    public void movement() {
        System.out.println("Бегаю за мячиком");
    }

    @Override
    public void eating() {
        System.out.println("Я ем собачью еду");
    }
}
