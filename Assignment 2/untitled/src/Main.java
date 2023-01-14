import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Employee("John","Lennon","teacher", 27045.78));
        persons.add(new Employee("George","Harrison","lector",50000.00));
        persons.add(new Student("Ringo","Starr",2.05));
        persons.add(new Student("Paul","McCartney",3.99));
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (int) (o1.getPaymentAmount() - o2.getPaymentAmount());
            }
        };
        persons.sort(comparator);
        printData(persons);
    }
    public static void printData(Iterable<Person> persons) {
        for (Person human : persons) {
            System.out.println(human.toString() + ' '+ human.getPaymentAmount()+"tenge");
        }
    }
}
