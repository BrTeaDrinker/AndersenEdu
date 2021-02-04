package Animals;

import Animals.Dog;

public class Doggy extends Dog {
    public void eating(int howMany) {
        System.out.println("Я люблю кушать. За раз я съедаю " + howMany + " киллограмм мяса");
    }
    public void movement(String speed){
        System.out.println("Как же я хорош, какие у меня лапищи. Я двигаюсь со скоростью " + speed + " много в час");
    }

}
