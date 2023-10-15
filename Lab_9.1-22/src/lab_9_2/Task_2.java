package lab_9_2;

interface Priceable {
    double getPrice();
}

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Продукт: " + name + ", Цена: " + price;
    }
}

class Service implements Priceable {
    private String serviceName;
    private double hourlyRate;

    public Service(String serviceName, double hourlyRate) {
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPrice() {
        return hourlyRate;
    }

    @Override
    public String toString() {
        return "Сервис: " + serviceName + ", Почасовая ставка: " + hourlyRate;
    }
}

class Membership implements Priceable {
    private String type;
    private double membershipFee;

    public Membership(String type, double membershipFee) {
        this.type = type;
        this.membershipFee = membershipFee;
    }

    @Override
    public double getPrice() {
        return membershipFee;
    }

    @Override
    public String toString() {
        return "Группа о готовке: " + type + ", Членский взнос: " + membershipFee;
    }
}

public class Task_2 {
    public static void main(String[] args) {
        Priceable product = new Product("IPhone 15", 150000.000);
        Priceable service = new Service("Услуги сантехники", 3500.000);
        Priceable membership = new Membership("Премиум", 15000.000);

        System.out.println(product);
        System.out.println("Цена: " + product.getPrice());

        System.out.println(service);
        System.out.println("Цена: " + service.getPrice());

        System.out.println(membership);
        System.out.println("Цена: " + membership.getPrice());
    }
}
