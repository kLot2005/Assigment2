package models;

import java.util.Comparator;

public class Student extends Person {
    private double gpa;
    private static final double stipend = 36660.00;
    public Student() {}

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private boolean paymentStatus(){
        return gpa > 2.67;
    };

    @Override
    public double getPaymentAmount() {
        return  paymentStatus() ? stipend : 0.00;
    }

    @Override
    public String getPosition() {
        return "Student";
    }

    @Override
    public String toString() {
        return getPosition() + ": " + super.toString();
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
