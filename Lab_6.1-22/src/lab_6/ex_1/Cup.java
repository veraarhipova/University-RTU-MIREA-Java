package lab_6.ex_1;

public class Cup extends Dish {
    private boolean isHandle; // Наличие ручки

    public Cup(String material, int capacity, boolean isHandle) {
        super(material, capacity);
        this.isHandle = isHandle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Кружка:");
        System.out.println("Материал: " + getMaterial());
        System.out.println("Объем: " + getCapacity() + " мл");
        System.out.println("Ручка: " + (isHandle ? "Да" : "Нет"));
    }
}