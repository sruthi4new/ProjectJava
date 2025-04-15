package resturantsProject;

public class CustMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resturant rs = new Resturant();
		//rs.display();
		Customer c1 = new Customer("7:30 pm" , 5 , true);
		 c1.displayReservation();
		 c1.displayorder();


	}

}
