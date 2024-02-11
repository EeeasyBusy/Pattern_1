public class PersonBuilder {
    public String name;
    public String surName;
    public int age;
    public String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surName = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Недопустимый возраст!");
        }
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalArgumentException, IllegalStateException{

        Person person = new Person(name, surName, age, address);
        if (name == null || surName == null){
            throw new IllegalStateException("Заполнены не все обязательные поля!");
        }
        return person;

    }
}