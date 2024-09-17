package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String phone;
    private Address address;

    public Person(String firstName, String lastName, int year, int month, int day, String phone, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(year, month, day);
        this.phone = phone;
        this.address = address;
    }

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(birthDate, person.birthDate) && Objects.equals(phone, person.phone) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate, phone, address);
    }
}
