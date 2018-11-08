package hotelbooking;

public class FrequentTravellerGuest extends HotelGuest{
	
	public String bookRoom(){
	roomCounter++;
	double FTCost = roomCost * 0.8;
	String welcomeGift = "Free Slippers and Dressing Gown";
	System.out.printf("Frequent Traveller Room " + roomCounter + " booked: Price = £%6.2f" , FTCost);
	System.out.println("Please enjoy the " + welcomeGift);
	return "You are a frequent traveller to us, thank you for returning and enjoy your stay!";
}
}
