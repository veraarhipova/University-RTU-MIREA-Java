package Lab_1;
import java.util.Scanner; //для ввода данных используется класс Scanner из пакета java.util.
public class Task2 {
    public static void main(String[] args){ //метод ничего не возвращает, название метода - main и в скобках параметры метода - String[] args.
        Scanner scan = new Scanner(System.in);
        int countt = 0, sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        do {
            System.out.print("Напишите целое положительное количество чисел в массиве: ");
            countt = scan.nextInt(); //считывание числа, вводимого с клавиатуры и преобразование его в целое число.
            int array[] = new int[countt]; //создание массива из countt элементов.
            //ввод и считывание каждого элемента массива. Подсчет суммы элементов массива.
            System.out.print("Напишите целое число для каждого элемента массива: \n");
            for (int i = 0; i < countt; i++) {
                System.out.printf("[" + i + "] = ");
                array[i] = scan.nextInt();
                sum = sum + array[i];
            }
            System.out.println("Сумма = " + sum );
            for (int j = 0; j < array.length; j++ ){ //цикл идет по длине массива и высчитывает макс. и мин. число
                if(array[j] > max){
                    max = array[j];
                }
                if(array[j] < min){
                    min = array[j];
                }
            }
            System.out.println("Максимальное число массива = " + max);
            System.out.println("Минимальное число массива = " + min);
            break;
        }while(scan.nextInt() > 0 );
    }
}
