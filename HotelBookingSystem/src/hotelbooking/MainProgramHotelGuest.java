package hotelbooking;

public class MainProgramHotelGuest {

	public static void main(String[] args) {
		HotelGuest normal = new HotelGuest();
		HotelGuest vip = new VipGuest();
		HotelGuest frequent = new FrequentTravellerGuest();
		
		System.out.println(normal.bookRoom() + "\n");
		System.out.println(vip.bookRoom() + "\n");
		System.out.println(frequent.bookRoom() + "\n");
		System.out.println(normal.bookRoom() + "\n");
		System.out.println(frequent.bookRoom() + "\n");
		System.out.println(vip.bookRoom() + "\n");

	}

}
