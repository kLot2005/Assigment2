import models.Payable;
import models.Person;
import models.Student;
import utils.FileScanerUtil;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MyApplication {

    public static void main(String[] args) throws FileNotFoundException {
        List<Person> persons = FileScanerUtil.loadDate();
        persons.sort(Person.compareTo());
        printData(persons);
    }

    public static void printData(Iterable<Person> persons) {
        for (Person person : persons) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
//            if (person instanceof Student) {
//                Student st = (Student) person;
//                System.out.println(st.getGpa());
//            }
        }
    }
}
