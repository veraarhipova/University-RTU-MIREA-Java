package lab_9_1;

interface Nameable {
    String getName();
}

class Car implements Nameable {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String getName() {
        return brand + "_" + model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Информации о машине: Бренд: " + brand + ", Модель: " + model + ", Год выпуска: " + year;
    }
}

class Book implements Nameable {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public String getName() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Информация о книге: Название: " + title + ", Автор: " + author + ", Дата публикации: " + publicationYear;
    }
}

class Game implements Nameable {
    private String title;
    private String platform;
    private int releaseYear;

    public Game(String title, String platform, int releaseYear) {
        this.title = title;
        this.platform = platform;
        this.releaseYear = releaseYear;
    }

    @Override
    public String getName() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Информации об игре: Название: " + title + ", Платформа=" + platform + ", Год выхода=" + releaseYear;
    }
}

public class Task_1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022);
        Book book = new Book("Война и Мир", "Л.Н. Толстой", 1865);
        Game game = new Game("The Legend of Zelda", "Nintendo Switch", 1986);

        System.out.println(car);
        System.out.println("Название: " + car.getName());

        System.out.println(book);
        System.out.println("Название: " + book.getName());

        System.out.println(game);
        System.out.println("Название: " + game.getName());
    }
}
