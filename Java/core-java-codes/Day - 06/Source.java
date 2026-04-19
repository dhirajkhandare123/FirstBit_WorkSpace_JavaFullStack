class Date
{
		
		int day, month, year;
		String dow;

} // class date ends here



class Test
{
	public static void main(String args[])
	{

		System.out.println("Hello world");

		Date d1; // reference
		d1 = new Date();

		System.out.println(d1);
		System.out.println(d1.day + "/"+d1.month+"/"+d1.year);
		System.out.println("The day of week is "+d1.dow);
		d1.day=6;
		d1.month=2;
		d1.year=2026;
		d1.dow="Friday";
		System.out.println(d1.day + "/"+d1.month+"/"+d1.year);
		System.out.println("The day of week is "+d1.dow);
		
	}
}