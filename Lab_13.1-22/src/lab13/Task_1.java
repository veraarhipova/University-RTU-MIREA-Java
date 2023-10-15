package lab13;

import java.io.*;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Выберите операцию:");
                System.out.println("1. Записать информацию в файл");
                System.out.println("2. Вывести информацию из файла на экран");
                System.out.println("3. Заменить информацию в файле");
                System.out.println("4. Добавить текст в конец файла");
                System.out.println("5. Выход");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Перейти на следующую строку после считывания числа

                switch (choice) {
                    case 1:
                        writeToFile(scanner);
                        break;
                    case 2:
                        readFromFile(scanner);
                        break;
                    case 3:
                        replaceInFile(scanner);
                        break;
                    case 4:
                        appendToFile(scanner);
                        break;
                    case 5:
                        System.out.println("Программа завершена.");
                        return;
                    default:
                        System.out.println("Неправильный выбор операции. Попробуйте снова.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Записать информацию в файл
    private static void writeToFile(Scanner scanner) throws IOException {
        System.out.print("Введите имя файла для записи: ");
        String fileName = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Введите информацию для записи в файл (для завершения введите пустую строку):");
            String line;
            while (!(line = scanner.nextLine()).isEmpty()) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Информация успешно записана в файл.");
        }
    }

    // Вывести информацию из файла на экран
    private static void readFromFile(Scanner scanner) throws IOException {
        System.out.print("Введите имя файла для чтения: ");
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    // Заменить информацию в файле
    private static void replaceInFile(Scanner scanner) throws IOException {
        System.out.print("Введите имя файла для замены информации: ");
        String fileName = scanner.nextLine();

        System.out.print("Введите новую информацию для замены: ");
        String newContent = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(newContent);
            System.out.println("Информация успешно заменена в файле.");
        }
    }

    // Добавить текст в конец файла
    private static void appendToFile(Scanner scanner) throws IOException {
        System.out.print("Введите имя файла для добавления текста: ");
        String fileName = scanner.nextLine();

        System.out.print("Введите текст для добавления в конец файла: ");
        String textToAdd = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(textToAdd);
            writer.newLine();
            System.out.println("Текст успешно добавлен в конец файла.");
        }
    }
}
