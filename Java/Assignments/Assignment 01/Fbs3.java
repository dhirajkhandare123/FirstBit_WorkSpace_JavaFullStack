class PlacedStudent{
    String frn, studentName, companyName, designation;
    int distanceCovered;
}

class Fbs3 {
    public static void main(String[] args) {
        PlacedStudent p1 = new PlacedStudent();

        System.out.println("FRN: "+p1.frn);
        System.out.println("Name: "+p1.studentName);
        System.out.println("Comapany Name: "+p1.companyName);
        System.out.println("Designation: "+p1.designation);
        System.out.println("Distance: "+p1.distanceCovered);

        p1.frn="J25/10";
        p1.studentName="Dhiraj";
        p1.companyName="Wipro";
        p1.designation="Manager";
        p1.distanceCovered=12;

        System.out.println("FRN: "+p1.frn);
        System.out.println("Name: "+p1.studentName);
        System.out.println("Comapany Name: "+p1.companyName);
        System.out.println("Designation: "+p1.designation);
        System.out.println("Distance: "+p1.distanceCovered);
    }
}
