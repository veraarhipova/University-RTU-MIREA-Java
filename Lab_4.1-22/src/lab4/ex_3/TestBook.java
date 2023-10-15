package lab4.ex_3;

public class TestBook {
    public static void main(String[] args) {
        // Создаем объект книги
        Book book = new Book("Иван Иванов", "Книга о книге", 2022);

        // Выводим информацию о книге
        System.out.println("Информация о книге:");
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год: " + book.getYear());

        // Меняем автора и год книги
        book.setAuthor("Сергей Сергеев");
        book.setYear(2023);

        // Выводим обновленную информацию о книге
        System.out.println("\nИзмененная информация о книге:");
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Год: " + book.getYear());
    }
}
