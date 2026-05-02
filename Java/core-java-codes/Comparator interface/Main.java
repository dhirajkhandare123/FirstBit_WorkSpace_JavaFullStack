import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello world");

        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(104,"om",20000));
        emp.add(new Employee(107,"zebra",20));
        emp.add(new Employee(102,"dhiraj",35000));
        emp.add(new Employee(101,"munna",25000));
        emp.add(new Employee(106,"chotu",19000));
        emp.add(new Employee(103,"aryan",67000));

        //System.out.println(emp);

        // sort by name
        Collections.sort(emp, new SortByName(emp));

        System.out.println(emp);


        System.out.println();
        System.out.println();


        //sort by salary

        Collections.sort(emp, new SortBySalary(emp));
        System.out.println(emp);
    }
}