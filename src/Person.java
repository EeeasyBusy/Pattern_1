import java.util.OptionalInt;

public class Person{
    protected final String name;
    protected final String surName;
   private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surName = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surName = surname;
        this.age = age;
    }
    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surName = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return getAge() != null;
    }

    public boolean hasAddress() {
        return getAddress() != null;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public OptionalInt getAge() {
        if (age == 0) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (getAge() != null) {
            age = age + 1;
        }
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surName)
                .setAge(0)
                .setAddress(address);
    }

    @Override
    public String toString() {
        return name + " " + surName;
    }

}