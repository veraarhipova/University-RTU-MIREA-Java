package lab_6.ex_3;

// Абстрактный класс Furniture, описывающий общие свойства и методы для мебели
public abstract class Furniture {
    private String name;
    private double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void description();
}



