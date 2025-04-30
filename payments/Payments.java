package payments;

public class Payments {
	void makePayments() {
		System.out.println("Making payment....");
	}

}
class DebitCard extends Payments{
	@Override
	void makePayments() {
		System.out.println("Payment made using debit card");
	}
}
class CreditCard extends Payments{
	@Override
	void makePayments() {
		System.out.println("Payment made using credit card");
	}
}
class Upi extends Payments{
	@Override
	void makePayments() {
		System.out.println("Payment made using UPI");
	}
}
