public class Main {
    public static void main(String[] args) {
        // Создаем авторов
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Фёдор", "Достоевский");
        Author author3 = new Author("Антон", "Чехов");

        // Создаем массив книг
        Book[] books = new Book[5];

        // Инициализируем книги
        books[0] = new Book("Война и мир", 1869, new Author[] {author1});
        books[1] = new Book("Преступление и наказание", 1866, new Author[] {author2});
        books[2] = new Book("Анна Каренина", 1877, new Author[] {author1});
        books[3] = new Book("Братья Карамазовы", 1880, new Author[] {author2});
        books[4] = new Book("Вишневый сад", 1903, new Author[] {author3});

        // Вывод информации о книгах
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
