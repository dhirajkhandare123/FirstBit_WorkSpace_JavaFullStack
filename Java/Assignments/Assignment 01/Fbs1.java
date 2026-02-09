

class Date{
    int day,month,year;
    String dow;
}

class Test{
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1.day+"/"+d1.month+"/"+d1.year);
        System.out.println("The day of work is "+d1.dow);
        d1.day=9;
        d1.month=2;
        d1.year=2026;
        d1.dow="Monday";

        System.out.println(d1.day+"/"+d1.month+"/"+d1.year);
        System.out.println("The day of work is "+d1.dow);

    }
}