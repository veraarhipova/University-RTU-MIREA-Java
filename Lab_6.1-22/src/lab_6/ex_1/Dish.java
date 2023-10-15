package lab_6.ex_1;

// Абстрактный класс Dish, описывающий общие свойства и методы посуды
public abstract class Dish {
    private String material;
    private int capacity; // Вместимость в миллилитрах

    public Dish(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    public String getMaterial() {
        return material;
    }

    public int getCapacity() {
        return capacity;
    }


    public void displayInfo() {
        System.out.println("Тарелка:");
        System.out.println("Материал: " + getMaterial());
        System.out.println("Объем: " + getCapacity() + " мл");
    }
}


