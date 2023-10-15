package Lab_1;

import java.util.Scanner; //для ввода данных используется класс Scanner из пакета java.util.

public class Task5 {
    public static void main(String[] args){ //для ввода данных используется класс Scanner из пакета java.util.
        Scanner scan = new Scanner(System.in);
        int countt;
        System.out.print("Напишите целое положительное число: ");
        countt = scan.nextInt(); //считывание числа, вводимого с клавиатуры и преобразование его в целое число.
        System.out.print(getFactorial(countt)); //вызов и вывод значения метода
    }
    //метод для подсчета факториала числа
    public static long getFactorial(int f){
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}
