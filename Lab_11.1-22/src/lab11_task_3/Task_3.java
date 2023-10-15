package lab11_task_3;

import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Студент{" +
                "имя='" + name + '\'' +
                ", возраст=" + age +
                '}';
    }
}

public class Task_3 {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Вася", 20));
        list1.add(new Student("Гриша", 22));
        list1.add(new Student("Марина", 19));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Аня", 21));
        list2.add(new Student("Вика", 23));

        System.out.println("Неотсортированный список 1:");
        printStudents(list1);

        System.out.println("\nНеотсортированный список 2:");
        printStudents(list2);

        List<Student> mergedList = mergeSort(list1, list2);

        System.out.println("\nОтсортированный объединенный список:");
        printStudents(mergedList);
    }

    private static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        while (index1 < list1.size() && index2 < list2.size()) {
            Student student1 = list1.get(index1);
            Student student2 = list2.get(index2);

            if (student1.compareTo(student2) <= 0) {
                mergedList.add(student1);
                index1++;
            } else {
                mergedList.add(student2);
                index2++;
            }
        }

        while (index1 < list1.size()) {
            mergedList.add(list1.get(index1));
            index1++;
        }

        while (index2 < list2.size()) {
            mergedList.add(list2.get(index2));
            index2++;
        }

        return mergedList;
    }

    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
