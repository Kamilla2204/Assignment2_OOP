import java.util.ArrayList;
import java.util.Collections;

interface Payable {
    double getPaymentAmount();
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(new Employee("Adelina", "Saidalieva", "Manager", 37095.28));
        peopleList.add(new Employee("Akdidar", "Omirzak", "Accountant", 919935679.00));
        peopleList.add(new Student("Zhanerke", "Daurenkyzy", 3.2));
        peopleList.add(new Student("Aidana", "Rustem", 2.1));


        Collections.sort(peopleList);

        printData(peopleList);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
