package lab4.ex_2;

public class Leg {
    private int length;

    public Leg(int length) {
        this.length = length;
    }

    public void walk() {
        System.out.println("Человек идет");
    }

    public void kick() {
        System.out.println("Человек делает бросок ногой");
    }

    public int getLength() {
        return length;
    }
}
