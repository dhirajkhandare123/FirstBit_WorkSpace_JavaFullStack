class Student{
String frn, studentName;
int distanceCovered;

void setData(String frn, String name, int distance){
this.frn = frn;
this.studentName=name;
this.distanceCovered=distance;
}

void getData(){
System.out.println("FRN: "+this.frn);
System.out.println("Student Name: "+this.studentName);
System.out.println("Distance: "+this.distanceCovered);
}
}

class Test {
public static void main(String[] args) {
Student d1 = new Student();

d1.getData();

d1.setData("J1234","Dhiraj",23);

d1.getData();
    }
}
