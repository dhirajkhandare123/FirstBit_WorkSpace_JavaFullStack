

class Date{
int day,month,year;
String dow;

void setDay(int day){
this.day = day;
}

void setMonth(int month){
this.month=month;
}

void setYear(int year){
this.year=year;
}

void setDow(String dow){
this.dow=dow;
}

void getData(){
System.out.println(this.day+"/"+this.month+"/"+this.year);
System.out.println("The day of work is "+this.dow);

}

}

class Test{
public static void main(String[] args) {
Date d1 = new Date();

d1.getData();

d1.setDay(9);
d1.setMonth(2);
d1.setYear(2026);
d1.setDow("Monday");

d1.getData();

    }
}