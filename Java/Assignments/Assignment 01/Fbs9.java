class Car{
String carCompany, modelName;
long carPrice;
int topSpeed;
}

class Test{
public static void main(String[] args){
Car obj = new Car();

System.out.println("Company Name: "+obj.carCompany);
System.out.println("Model Name: "+obj.modelName);
System.out.println("Price: "+obj.carPrice);
System.out.println("Top Speed: "+obj.topSpeed);


obj.carCompany="Tata";
obj.modelName="Safari";
obj.carPrice=2000000;
obj.topSpeed=180;

System.out.println("Company Name: "+obj.carCompany);
System.out.println("Model Name: "+obj.modelName);
System.out.println("Price: "+obj.carPrice);
System.out.println("Top Speed: "+obj.topSpeed);
}
}