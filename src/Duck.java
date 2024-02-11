public class Duck extends Animals{
    public Duck() {
    }

    public Duck(double weigth, int age, String name) {
        super(weigth, age, name);
    }

    @Override
    public void move() {
        System.out.println("Утка по кличке " + super.getName() + " бежит по земле");
    }
}
