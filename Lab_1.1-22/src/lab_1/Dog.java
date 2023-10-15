/*Необходимо реализовать простейший класс на языке программирования Java.
 Не забудьте добавить метод toString() к вашему классу. Так-же в программе
 необходимо предусмотреть класс-тестер для тестирования класса и вывода
 информации об объекте.
        Упражнение 1.
        Реализуйте простейший класс «Cобака».
Задание: Реализуйте класс «Собака, который содержит данные экземпляра,
которые представляют имя собаки и ее возраст. Определить конструктор собаки,
чтобы принять и инициализировать данные экземпляр. Включите методы получения
и установки для имени и возраста. Включите метод вычисления и возвращает
возраст собаки в "человеческих" лет (возраст семь раз собаки). Включите метод
toString(), который возвращает описание на одну строку собаки. Создание класса
драйвера под названием питомника, основной метод конкретизирует и обновляет несколько
объектов собаки.*/

        package lab_1;

public class Dog {
    private String name;
    private  int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Dog(String n){
        name = n;
        age = 0;
    }
    public Dog(){
        name = "Pup";
        age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public String intoHumanAge(){
        return name + "'s age in human years is " + age*7 + " years.";
    }
}
