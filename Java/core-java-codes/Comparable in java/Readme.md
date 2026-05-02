
In Java, Comparable is an interface used to define the natural ordering of objects. It lets you specify how instances of a class should be compared to each other.

🔹 What it does

If a class implements Comparable, you can sort its objects (for example, using Collections.sort() or arrays sorting), because Java knows how to compare them.

🔹 The key method

Comparable has one method you must implement:

int compareTo(T other)

🔹 How compareTo works

It returns:

Negative number → current object is less than other
Zero → both objects are equal
Positive number → current object is greater than other

🔹 When to use Comparable

Use it when:

Your class has a single natural way of ordering (e.g., by age, name, ID)
You want sorting to be built into the class itself

🔹 Comparable vs Comparator (quick difference)
Comparable → defines natural/default ordering inside the class. used when you have to implement only single sorting logic.
Comparator → defines custom/external ordering outside the class. used when you have to implement different sorting logics.

### important: If want to sort salary wise using Comparable interface. Use as followa:

##### Employee.java
public class Employee implements Comparable<Employee>{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}'+'\n';
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary,o.salary);
    }
}

##### Main.java
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

### Note: If you have used Comparable interface you can sort only by single logic. You cant use multiple logics.
