package lab_6.ex_3;

// Класс для дивана (Sofa), наследующийся от Furniture
public class Sofa extends Furniture {
    private String material;

    public Sofa(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void description() {
        System.out.println("Диван: " + getName());
        System.out.println("Цена: " + getPrice());
        System.out.println("Материал: " + material);
    }
}