package lab4.ex_2;

public class Hand {
    private int fingers;

    public Hand(int fingers) {
        this.fingers = fingers;
    }

    public void wave() {
        System.out.println("Машет рукой");
    }

    public void grab() {
        System.out.println("Хватает рукой");
    }

    public int getFingers() {
        return fingers;
    }
}
