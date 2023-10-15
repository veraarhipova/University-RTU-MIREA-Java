package lab_6.ex_2;

// Тестовый класс для проверки работы классов
public class TestDog {
    public static void main(String[] args) {
        // Создаем объекты разных пород собак
        Labrador labrador = new Labrador("Рокки", 3);
        Bulldog bulldog = new Bulldog("Мишель", 4);

        // Выводим информацию о собаках и их действиях
        System.out.println("Информация о лабрадоре");
        System.out.println("Имя: " + labrador.getName());
        System.out.println("Возраст: " + labrador.getAge());
        labrador.bark();
        labrador.play();

        System.out.println();

        System.out.println("Информация о бульдоге:");
        System.out.println("Имя: " + bulldog.getName());
        System.out.println("Возраст: " + bulldog.getAge());
        bulldog.bark();
        bulldog.play();
    }
}