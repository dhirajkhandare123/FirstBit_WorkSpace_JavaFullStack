class Car{
String carCompany, modelName;
long carPrice;
int topSpeed;

void setCarCompany(String cname){
this.carCompany=cname;
}

void setModelName(String modelName){
this.modelName=modelName;
}

void setCarPrice(long carPrice){
this.carPrice=carPrice;
}

void setTopSpeed(int topSpeed){
this.topSpeed=topSpeed;
}

void getData(){
System.out.println("Company Name: "+this.carCompany);
System.out.println("Model Name: "+this.modelName);
System.out.println("Price: "+this.carPrice);
System.out.println("Top Speed: "+this.topSpeed);
}
}

class Test{
public static void main(String[] args){
Car obj = new Car();

obj.getData();


obj.setCarCompany("Tata");
obj.setModelName("Safari");
obj.setCarPrice(2000000);
obj.setTopSpeed(180);

obj.getData();
}
}