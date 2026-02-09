class Hospital{
String doctorName, patientName;
int patientId, fees;
}

class Test{
public static void main(String[] args){
Hospital obj = new Hospital();

System.out.println("Doctor Name: "+obj.doctorName);
System.out.println("Patient Name: "+obj.patientName);
System.out.println("Patient ID: "+obj.patientId);
System.out.println("Fees: "+obj.fees);


obj.doctorName="Dr. Sancheti";
obj.patientName="Ramesh";
obj.patientId=2201;
obj.fees=100;

System.out.println("Doctor Name: "+obj.doctorName);
System.out.println("Patient Name: "+obj.patientName);
System.out.println("Patient ID: "+obj.patientId);
System.out.println("Fees: "+obj.fees);
}
}