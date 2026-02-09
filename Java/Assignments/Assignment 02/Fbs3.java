class PlacedStudent{
String frn, studentName, companyName, designation;
int distanceCovered;

void setFrn(String frn){
this.frn = frn;
}

void setStudentName(String name){
this.studentName = name;
}

void setCompanyName(String companyName){
this.companyName = companyName;
}

void setDesignation(String designation){
this.designation = designation;
}

void setDistanceCovered(int distance){
this.distanceCovered = distance;
}

void getData(){
System.out.println("FRN: "+this.frn);
System.out.println("Name: "+this.studentName);
System.out.println("Comapany Name: "+this.companyName);
System.out.println("Designation: "+this.designation);
System.out.println("Distance: "+this.distanceCovered);

}
}

class Test {
public static void main(String[] args) {
PlacedStudent obj = new PlacedStudent();

obj.getData();

obj.setFrn("J25/10");
obj.setStudentName("Dhiraj");
obj.setCompanyName("Wipro");
obj.setDesignation("Manager");
obj.setDistanceCovered(12);

obj.getData();
    }
}
