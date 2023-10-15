package lab_6.ex_2;

// Класс для породы собаки Labrador, наследующийся от Dog
public class Labrador extends Dog {
    public Labrador(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " лабрадор тихо лает");
    }

    @Override
    public void play() {
        System.out.println(getName() + " лабрадор играет с кошкой");
    }
}