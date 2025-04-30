package inheritance2;

public class Book {
	
	String title;
	String author;
	
	Book(String title , String author){
		this.title = title;
		this.author = author;
	}
	
	void displayDetails() {
		System.out.println("Title :"+" "+title);
		System.out.println("Author :"+" "+author);
	}

}

 class EBook extends Book{

	double fileSize;
	 String format;
	 
	 EBook(String title , String author,double fileSize, String format) {
		 super(title , author);
			this.fileSize = fileSize;
			this.format = format;
		}
	 
	 @Override
	 void displayDetails() {
		 super.displayDetails();
		 System.out.println("File size :"+" "+fileSize+" "+"MB");
		 System.out.println("Format :"+" "+format);
		 
	 }
  }
 
   class PrintedBook extends Book{
	   int pages;
	   double weight;

	PrintedBook(String title, String author,int pages, double weight) {
		super(title, author);
		this.pages = pages;
		this.weight = weight;
	}
		@Override
		void displayDetails() {
			super.displayDetails();
			System.out.println("Pages :"+pages);
			System.out.println("Weight :"+weight+" "+"gm");
		
	}
	   
   }
  
