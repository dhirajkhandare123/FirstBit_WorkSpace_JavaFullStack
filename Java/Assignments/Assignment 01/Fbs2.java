class Student{
    String frn, studentName;
    int distanceCovered;
}

class Fbs2 {
    public static void main(String[] args) {
        Student s1 = new Student();

	System.out.println("FRN: "+s1.frn);
        System.out.println("Student Name: "+s1.studentName);
        System.out.println("Distance: "+s1.distanceCovered);

        s1.frn="J1234";
        s1.studentName="Dhiraj";
        s1.distanceCovered=23;

        System.out.println("FRN: "+s1.frn);
        System.out.println("Student Name: "+s1.studentName);
        System.out.println("Distance: "+s1.distanceCovered);
    }
}
