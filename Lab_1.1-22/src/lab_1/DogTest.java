package lab_1;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Chloe");
        d3.setAge(1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d1.intoHumanAge());
        System.out.println(d2.intoHumanAge());
        System.out.println(d3.intoHumanAge());

    }
}