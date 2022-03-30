package Day1Assignment;


public class Date {
	
	private int day;
	private int month;
	private int year;
	
	
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}



	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}
	
	


	public void printDate() {
		System.out.println("Date :"+ day + "/"+month+"/"+year );
	}

	
	@Override
	public String toString() {
		return "Date :"+ day + "/"+month+"/"+year;
	}


	public void swapTwoDates(Date date) {
		int temp = date.day;
		date.day = this.day;
		this.day = temp;
		
		temp = date.month;
		date.month = this.month;
		this.month = temp;
		
		temp = date.year;
		date.year = this.year;
		this.year = temp;
		
	}

}

