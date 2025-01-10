package models;

import java.util.Comparator;

public abstract class Person implements Payable, Comparable<Person> {

    private static int nextId = 1;
    private int id;
    private String name;
    private String surname;

    public Person() {}

    public Person(String name, String surname) {
        this();
        setId(id);
        setName(name);
        setSurname(surname);
    }


    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = nextId++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public abstract String getPosition();

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }


    public static Comparator<Person> compareTo() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getPaymentAmount() > p2.getPaymentAmount()) return 1;
                if (p1.getPaymentAmount() <p2.getPaymentAmount()) return -1;
                return 0;
            }
        };
    }

}
