import java.util.ArrayList;
import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

    public SortBySalary(ArrayList<Employee> emp) {

    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getSalary(),o2.getSalary());
    }
}
