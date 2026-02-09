class Hr{
int id, salary, commision;
String name;

void setId(int id){
this.id=id;
}

void setSalary(int salary){
this.salary=salary;
}

void setCommision(int commision){
this.commision=commision;
}

void setName(String name){
this.name=name;
}

void getData(){
System.out.println("ID: "+this.id);
System.out.println("Name: "+this.name);
System.out.println("Salary"+this.salary);
System.out.println("Commision: "+this.commision);
}
}

class Test{
public static void main(String[] args){
Hr obj = new Hr();

obj.setId(102);
obj.setName("Dhiraj");
obj.setSalary(24000);
obj.setCommision(1000);


obj.getData();

}
}