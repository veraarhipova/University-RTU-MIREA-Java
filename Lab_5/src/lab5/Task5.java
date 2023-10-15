package lab5;

import java.util.Scanner;

public class Task5 {

    public static int sumOfDigits(int num) {
        if (num == 0) { // базовый случай: число равно 0
            return 0;
        } else {
            // рекурсивный случай: добавляем последнюю цифру и вызываем сумму оставшихся цифр
            return (num % 10) + sumOfDigits(num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное целое число: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = sumOfDigits(n);
        System.out.println("Сумма цифр числа " + n + " равна " + sum);
    }
}