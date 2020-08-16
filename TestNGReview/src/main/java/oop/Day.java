package oop;

public enum Day {
 SUNDAY,MONDAY;
	public void prinDay() {
		Day s=Day.MONDAY;
		Day[] days=Day.values();
		for(Day d:days)
		{
			System.out.println(d);
		}
	}
}
