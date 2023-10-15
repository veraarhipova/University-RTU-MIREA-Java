package lab_6.ex_3;

// Класс для стола (Table), наследующийся от Furniture
public class Table extends Furniture {
    private int numberOfLegs;

    public Table(String name, double price, int numberOfLegs) {
        super(name, price);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void description() {
        System.out.println("Стол: " + getName());
        System.out.println("Цена: " + getPrice());
        System.out.println("Количество ножек: " + numberOfLegs);
    }
}