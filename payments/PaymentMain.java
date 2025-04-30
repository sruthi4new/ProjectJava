package payments;

public class PaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payments Payments;
		Payments  = new DebitCard();
		Payments.makePayments();
		
		Payments = new CreditCard();
		Payments.makePayments();
		
		Payments  = new Upi();
		Payments.makePayments();

	}

}
