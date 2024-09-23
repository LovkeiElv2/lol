package org.example;

import java.util.Arrays;

public class Book {
    private String title;
    private int year;
    private Author[] authors;


    public Book(String title, int year, Author[] authors) {
        this.title = title;
        this.year = year;
        this.authors = authors;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        if (authors != null && authors.length > 0) {
            this.authors = authors;
        } else {
            System.out.println("Книга должна иметь автора.");
        }
    }

    // Метод toString для вывода информации о книге
    @Override
    public String toString() {
        return "Название: " + title + ", Год: " + year + ", Авторы: " + Arrays.toString(authors);
    }
}
