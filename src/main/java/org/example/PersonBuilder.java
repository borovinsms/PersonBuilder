package org.example;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.name == null) {
            throw new IllegalStateException("Не указано имя");
        }
        if (this.surname == null) {
            throw new IllegalStateException("Не указана фамилия");
        }
        Person person = new Person(this.name, this.surname, this.age);
        person.setAddress(this.address);
        return person;
    }
}
