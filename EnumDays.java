package EnumBasedCodes;

 enum Days {
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY;
	
	
public String getDayType() {
	switch(this) {
	case SUNDAY:
		return "WEEKEND";
	case SATURDAY:
		return "WEEKEND";
	default:
		return "WEEKDAY";
		
		
//using ternary operator		
//		return(this==SUNDAY || this ==SATURDAY) ? "WEEKEND" : "WEEKDAY";
	
	}
	
}

public boolean isWeekend() {
	if(this == SUNDAY || this == SATURDAY ) {
		return true;
	}
	return false;
}

//returns user-friendly name
@Override    
public String toString() {
	String name = this.name();
	return name.charAt(0) + name.substring(1).toLowerCase();
}

public int compareDays(Days day) {
	return Integer.compare(this.ordinal(), day.ordinal());
}


}

public class EnumDays{
	public static void main(String[] args) {
		
		//prints each day and its type
		System.out.println("Days and types: ");
		for(Days days : Days.values()) {
			System.out.println(days + ": " + days.getDayType());
		}
		
		//Check if a specific day is a weekend
		Days checkDay = Days.SATURDAY;
		System.out.println(checkDay.isWeekend());
		
		//compares two days to check which one is earlier or later in the week
		Days day1 = Days.WEDNESDAY;
		Days day2 = Days.MONDAY;
		int compare = day1.compareDays(day2);
		System.out.println(compare);
		if(compare < 0) {
			System.out.println(day1 + " is earlier than " + day2);
		}
		else if(compare > 0) {
			System.out.println(day1 + " is later than " + day2);
		}
		else {
			System.out.println(day1 + " and " + day2 + " are same days");
		}
		
 	}
	
}