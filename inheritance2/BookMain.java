package inheritance2;


public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook e = new EBook("Ramayana","valmiki",120,"pdf");
		
		PrintedBook p = new PrintedBook("Mahabharat","veda vyasa",1000,900);
		
		System.out.println("Details of the ebook  are :\n");
		e.displayDetails();
		
		System.out.println("\nDetails of the printed book are :\n");
		p.displayDetails();

	}

}
