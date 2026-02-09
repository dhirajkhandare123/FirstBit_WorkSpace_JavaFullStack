class Employee{
    int id, salary;
    String name;

    void setId(int id){
        this.id=id;
    }

    void setSalary(int salary){
        this.salary=salary;
    }

    void setName(String name){
        this.name=name;
    }

    void getData(){
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Salary"+this.salary);
    }
}

class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.getData();

        e1.setId(122);
        e1.setSalary(20000);
        e1.setName("Dhiraj");

        e1.getData();
    }
}
