public class Duck extends Animals{
    public Duck() {
    }

    public Duck(double weigth, int age, String name) {
        super(weigth, age, name);
    }

    public void move(){
        System.out.println("Утка по кличке " + super.getName() + " летит в облаках");
    }
}
