package lab_6.ex_2;

// Класс для породы собаки Bulldog, наследующийся от Dog
public class Bulldog extends Dog {
    public Bulldog(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " бульдог громко лает");
    }

    @Override
    public void play() {
        System.out.println(getName() + " бульдог играет в мяч");
    }
}
