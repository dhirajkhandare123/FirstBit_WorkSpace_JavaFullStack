class Employee{
    int id, salary;
    String name;
}

class Fbs4 {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        System.out.println("ID: "+e1.id);
        System.out.println("Name: "+e1.name);
        System.out.println("Salary"+e1.salary);

        e1.id=122;
        e1.salary=20000;
        e1.name="Dhiraj";

        System.out.println("ID: "+e1.id);
        System.out.println("Name: "+e1.name);
        System.out.println("Salary"+e1.salary);
    }
}
