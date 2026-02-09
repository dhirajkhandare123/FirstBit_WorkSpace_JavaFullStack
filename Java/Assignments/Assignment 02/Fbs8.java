class Hospital{
String doctorName, patientName;
int patientId, fees;

void setDoctorName(String dname){
this.doctorName=dname;
}

void setPatientName(String pname){
this.patientName=pname;
}

void setPatientId(int pid){
this.patientId=pid;
}

void setFees(int fees){
this.fees=fees;
}

void getData(){
System.out.println("Doctor Name: "+this.doctorName);
System.out.println("Patient Name: "+this.patientName);
System.out.println("Patient ID: "+this.patientId);
System.out.println("Fees: "+this.fees);
}

}

class Test{
public static void main(String[] args){
Hospital obj = new Hospital();

obj.getData();


obj.setDoctorName("Dr. Sancheti");
obj.setPatientName("Ramesh");
obj.setPatientId(2201);
obj.setFees(100);

obj.getData();
}
}