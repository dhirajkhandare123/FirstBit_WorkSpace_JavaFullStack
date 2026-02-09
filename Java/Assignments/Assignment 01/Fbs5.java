class Hr{
int id, salary, commision;
String name;
}

class Test{
public static void main(String[] args){
Hr obj = new Hr();

System.out.println("Name: "+obj.name);
System.out.println("ID: "+obj.id);
System.out.println("Salary: "+obj.salary);
System.out.println("Commision: "+obj.commision);

obj.name="Dhiraj";
obj.id=102;
obj.salary=25000;
obj.commision=1000;

System.out.println("Name: "+obj.name);
System.out.println("ID: "+obj.id);
System.out.println("Salary: "+obj.salary);
System.out.println("Commision: "+obj.commision);

}
}