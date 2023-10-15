package lab5;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число A: ");
        int a = scanner.nextInt();

        System.out.print("Введите целое число B: ");
        int b = scanner.nextInt();

        if (a < b) {
            printNumbersAscending(a, b);
        } else {
            printNumbersDescending(a, b);
        }
    }

    public static void printNumbersAscending(int a, int b) {
        if (a <= b) {
            System.out.println(a);
            printNumbersAscending(a + 1, b);
        }
    }

    public static void printNumbersDescending(int a, int b) {
        if (a >= b) {
            System.out.println(a);
            printNumbersDescending(a - 1, b);
        }
    }
}
