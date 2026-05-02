import java.util.ArrayList;
import java.util.Collections;

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

        Collections.sort(emp);
        System.out.println(emp);

    }
}