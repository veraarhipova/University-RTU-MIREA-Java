package lab4.ex_2;

import lab4.ex_2.Human;

public class HumanTest {
    public static void main(String[] args) {
        Human person = new Human("Каштановые", "Голубые", 37, 5);

        System.out.println("Характеристики человека:");
        System.out.println("Цвет волос: " + person.getHairColor());
        System.out.println("Цвет глаз: " + person.getEyeColor());
        System.out.println("Размер ноги: " + person.getLegLength());
        System.out.println("Количество пальцев на одной руке: " + person.getFingerCount());

        System.out.println("\nДействия человека:");
        person.speak();
        person.walk();
        person.wave();
    }
}
