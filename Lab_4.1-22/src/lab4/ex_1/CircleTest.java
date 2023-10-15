package lab4.ex_1;

import lab4.ex_1.Circle;

public class CircleTest {
    public static void main(String[] args) {

        // Circle class test
        Circle circle = new Circle(5.5);
        System.out.println(circle.toString() + ", circle area: " + String.format("%.3f", circle.get_area()));
        circle.set_radius(765.4);
        System.out.println(circle.toString() + ", circle area: " + String.format("%.3f", circle.get_area()));
    }
}