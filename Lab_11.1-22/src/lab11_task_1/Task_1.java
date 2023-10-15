package lab11_task_1;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Студент{" +
                "iD_Номер=" + iDNumber +
                ", имя='" + name + '\'' +
                '}';
    }
}

public class Task_1 {
    public static void main(String[] args) {
        Student[] students = {
                new Student(111, "Даша"),
                new Student(115, "Саша"),
                new Student(112, "Паша"),
                new Student(114, "Наташа"),
                new Student(113, "Миша")
        };

        System.out.println("До сортировки:");
        printStudents(students);

        // Сортировка массива students по полю iDNumber сортировкой вставками
        insertionSort(students);

        System.out.println("После сортировки:");
        printStudents(students);
    }

    private static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student currentStudent = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > currentStudent.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = currentStudent;
        }
    }

    private static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
