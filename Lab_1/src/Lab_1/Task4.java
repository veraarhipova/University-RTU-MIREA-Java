package Lab_1;

import java.util.Formatter;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Formatter f = new Formatter();
            f.format("Элемент - %f" , 1./i);
            System.out.println(f);
        }
    }
}
