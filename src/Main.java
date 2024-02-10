public class Main {
    public static void main(String[] args) {
    Duck duck = new Duck(5.0, 2, "Маша");
    duck.move();
    duck.walk();

    Dog dog = new Dog(10.3, 5, "Берта");
    dog.move();
    dog.walk();
    }
}
