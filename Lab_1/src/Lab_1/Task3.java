package Lab_1;

public class Task3 {
    public static void main(String[] args) { //метод ничего не возвращает, название метода - main и в скобках параметры метода - String[] args.
        for (int i = 0; i < args.length; i++) { //идем до конца длины строки
            System.out.println("Аргумент " + (i+1) + ": " + args[i]);
        }
    }
}
