package hotelbooking;

public class VipGuest extends HotelGuest {

	public String bookRoom(){
		roomCounter++;
		double vipCost = roomCost * 0.9;
		String welcomeGift = "Free Bar";
		System.out.printf("VIP Room " + roomCounter + " booked: Price = £%6.2f" , vipCost);
		System.out.println("Please enjoy the " + welcomeGift);
		return "You are a very important person to us, enjoy your stay!";	
	}
}
