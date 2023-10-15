package lab_6.ex_1;

// Класс для тарелок (Plate), наследующийся от Dish
public class Plate extends Dish {
    private boolean hasDivider; // Наличие отделителя (например, для супа)

    public Plate(String material, int capacity, boolean hasDivider) {
        super(material, capacity);
        this.hasDivider = hasDivider;
    }
}