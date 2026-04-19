class Date{
	int day, month, year;
	String dow;
	void setDay(int d){
		this.day = d;
	}
	void setDow(String str){
		this.dow = str;
	}
}

class Test{
	public static void main(String[] args){
		Date d1 = new Date();
		d1.setDay(9);
		d1.setDow("Mon");
	}
}