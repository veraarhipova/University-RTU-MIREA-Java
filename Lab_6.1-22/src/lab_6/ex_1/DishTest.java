package lab_6.ex_1;


// Тестовый класс для проверки работы классов
public class DishTest {
    public static void main(String[] args) {
        // Создаем объекты различных видов посуды
        Plate plate = new Plate("Керамика", 500, true);
        Cup cup = new Cup("Стекло", 250, true);

        // Выводим информацию о посуде
        plate.displayInfo();
        System.out.println();
        cup.displayInfo();
    }
}