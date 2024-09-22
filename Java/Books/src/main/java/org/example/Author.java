public class Author {
    private String firstName;
    private String lastName;

    // Конструктор
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters и Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Метод toString для вывода информации об авторе
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
