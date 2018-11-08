package hotelbooking;

public class HotelGuest {
	public static int roomCounter = 0;
	public static double roomCost = 100;
	
	public String bookRoom() {
		roomCounter++;
		return "Hotel Guest Room " + roomCounter + " booked £" + roomCost;
	}
}
