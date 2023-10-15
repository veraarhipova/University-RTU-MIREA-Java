package lab_6.ex_2;

// Абстрактный класс Dog, описывающий общие свойства и методы для собак
public abstract class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void bark();

    public abstract void play();
}

