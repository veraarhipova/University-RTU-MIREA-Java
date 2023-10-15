package lab4.ex_2;

public class Head {
    private String hairColor;
    private String eyeColor;

    public Head(String hairColor, String eyeColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public void talk() {
        System.out.println("Человек разговаривает");
    }

    public void think() {
        System.out.println("Человек думает");
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }
}
