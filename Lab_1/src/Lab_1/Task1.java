package Lab_1;

import java.util.Scanner; //для ввода данных используется класс Scanner из пакета java.util.

public class Task1 {
    public static void main(String[] args){ //метод ничего не возвращает, название метода - main и в скобках параметры метода - String[] args.
        Scanner scan = new Scanner(System.in);
        int countt = 0;
        int sum = 0;
        double arithmetic_mean;

        System.out.print("Напишите количество чисел в массиве целое положительно): ");
        countt = scan.nextInt(); //считывание числа, вводимого с клавиатуры и преобразование его в целое число.
        int array[] = new int[countt]; //создание массива из countt элементов

        System.out.print("Напишите целое значение для каждого элемента массива: \n");
        for (int i = 0; i < countt; i++){ //цикл

            System.out.printf("[" + i + "] = ");
            array[i] = scan.nextInt(); //считывание значения каждого элемента массива.

            sum = sum + array[i]; //вычисление суммы элементов массива.
        }
        arithmetic_mean = sum/countt; //нахождение среднего арифметического.

        System.out.printf("Среднее арифметическое значение чисел массива = " + arithmetic_mean);
    }
}
