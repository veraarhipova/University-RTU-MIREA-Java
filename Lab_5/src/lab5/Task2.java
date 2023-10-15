package lab5;

import java.util.Scanner;

public class Task2 {

    public static void printNumbers(long n) {
        if (n > 1) {
            printNumbers(n - 1);
        }
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное целое число: ");
        long n = scanner.nextInt();

        System.out.print("Все числа от 1 до " + n + ": ");
        printNumbers(n);
    }
}
