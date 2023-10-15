package lab_6.ex_3;

// Класс FurnitureShop, моделирующий магазин мебели
public class FurnitureShop {
    public static void main(String[] args) {
        // Создаем объекты различных видов мебели
        Table table = new Table("Большой для праздника", 10000.0, 4);
        Sofa sofa = new Sofa("Раскладной", 20000.0, "Кожа");

        // Выводим информацию о мебели в магазине
        System.out.println("Мебель в магазине:");
        table.description();
        System.out.println();
        sofa.description();
    }
}