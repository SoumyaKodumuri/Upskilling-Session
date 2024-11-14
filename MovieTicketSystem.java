package EnumBasedCodes;


enum TicketType{
	REGULAR,
	VIP,
	STUDENT,
	SENIOR;
	
}

//movieTicket class which stores ticket price and its type
 class MovieTicket{
	private double Regular_Price  = 10.0;
	private TicketType ticketType;
	
	public MovieTicket(TicketType ticketType) {
 		this.ticketType =ticketType;
 	}
	
	
	//calculate ticket price based on ticketType
	public double getTicketPrice() {
		switch(ticketType) {
		case VIP:
			return Regular_Price + 5.0;   //additional chargers:  $5 
		case STUDENT:
			return Regular_Price - (Regular_Price * 20/100);    //20% discount
		case SENIOR:
			return Regular_Price - (Regular_Price * 30/100);   //30% discount
		default:
			return Regular_Price;
		}
 	}
	@Override
	public String toString() {
		return ticketType + " Ticket: $" +getTicketPrice();
	}
}

public class MovieTicketSystem{
	public static void main(String[] args) {
		
		//creating objects for each type of ticket
		MovieTicket regular_Ticket = new MovieTicket(TicketType.REGULAR);
		MovieTicket vip_Ticket = new MovieTicket(TicketType.VIP);
		MovieTicket student_Ticket = new MovieTicket(TicketType.STUDENT);
		MovieTicket senior_Ticket = new MovieTicket(TicketType.SENIOR);

		
		//displaying ticket type and its price 
		System.out.println(regular_Ticket);
		System.out.println(vip_Ticket);
		System.out.println(student_Ticket);
		System.out.println(senior_Ticket);
		
	}
	
}
