public class Main {
    public static void main(String[] args) {
    Animals duck = new Duck(5.0, 2, "Маша");
    duck.move();
    duck.walk();

    Animals dog = new Dog(10.3, 5, "Берта");
    dog.move();
    dog.walk();
    }
}
