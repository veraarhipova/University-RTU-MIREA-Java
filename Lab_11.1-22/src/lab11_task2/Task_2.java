package lab11_task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Студент{" +
                "имя='" + name + '\'' +
                ", балл=" + gpa +
                '}';
    }
}

public class Task_2 implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Сортировка по убыванию итоговых баллов (GPA)
        return Double.compare(student2.getGpa(), student1.getGpa());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Катя", 4.9));
        students.add(new Student("Саша", 3.7));
        students.add(new Student("Милана", 4.0));
        students.add(new Student("Дима", 4.5));
        students.add(new Student("Соня", 3.8));

        System.out.println("Неотсортированный список студентов:");
        printStudents(students);

        // Сортировка с использованием класса SortingStudentsByGPA
        Collections.sort(students, new Task_2());

        System.out.println("\nОтсортированный список студентов по GPA (по убыванию):");
        printStudents(students);
    }

    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
