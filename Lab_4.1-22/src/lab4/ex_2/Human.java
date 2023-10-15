package lab4.ex_2;

public class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(String hairColor, String eyeColor, int legLength, int fingers) {
        this.head = new Head(hairColor, eyeColor);
        this.leftLeg = new Leg(legLength);
        this.rightLeg = new Leg(legLength);
        this.leftHand = new Hand(fingers);
        this.rightHand = new Hand(fingers);
    }

    public void speak() {
        head.talk();
    }

    public void walk() {
        leftLeg.walk();
        rightLeg.kick();
    }

    public void wave() {
        leftHand.wave();
        rightHand.grab();
    }

    public String getHairColor() {
        return head.getHairColor();
    }

    public String getEyeColor() {
        return head.getEyeColor();
    }

    public int getLegLength() {
        return leftLeg.getLength();
    }

    public int getFingerCount() {
        return leftHand.getFingers();
    }
}
