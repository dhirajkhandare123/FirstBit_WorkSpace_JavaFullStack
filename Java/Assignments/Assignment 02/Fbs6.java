class Admin{
int id, salary, allowance;
String name;

void setId(int id){
this.id=id;
}

void setSalary(int salary){
this.salary=salary;
}

void setAllowance(int allowance){
this.allowance=allowance;
}

void setName(String name){
this.name=name;
}

void getData(){
System.out.println("ID: "+this.id);
System.out.println("Name: "+this.name);
System.out.println("Salary"+this.salary);
System.out.println("Commision: "+this.allowance);
}

}

class Test{
public static void main(String[] args){
Admin obj = new Admin();

obj.getData();

obj.setId(102);
obj.setName("Dhiraj");
obj.setSalary(24000);
obj.setAllowance(1000);

obj.getData();

}
}