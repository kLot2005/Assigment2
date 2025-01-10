package utils;

import models.Employee;
import models.Payable;
import models.Person;
import models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FileScanerUtil {

    public static List<Person> loadDate() throws FileNotFoundException{
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(new File(".\\src\\utils\\people.txt"));

        while(scanner.hasNext()){
            String name = scanner.next();
            String surname = scanner.next();

            String gpaAsString = scanner.next();
            if(isDouble(gpaAsString)){
                double gpa = Double.parseDouble(gpaAsString);
                persons.add(new Student(name, surname, gpa));
            }
            else{
                String position = gpaAsString;
                double salary = Double.parseDouble(scanner.next());
                persons.add(new Employee(name, surname, position, salary));
            }
        }

        return persons;
    }

    public static boolean isDouble(String text) {
        try {
            Double.parseDouble(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
