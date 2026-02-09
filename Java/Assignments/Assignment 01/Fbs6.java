class Admin{
int id, salary, allowance;
String name;
}

class Test{
public static void main(String[] args){
Admin obj = new Admin();

System.out.println("Name: "+obj.name);
System.out.println("ID: "+obj.id);
System.out.println("Salary: "+obj.salary);
System.out.println("Commision: "+obj.allowance);

obj.name="Om";
obj.id=102;
obj.salary=100000;
obj.allowance=1000;

System.out.println("Name: "+obj.name);
System.out.println("ID: "+obj.id);
System.out.println("Salary: "+obj.salary);
System.out.println("Commision: "+obj.allowance);

}
}