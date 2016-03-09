import java.util.Scanner;
public class BookApp {

	

public static void main(String[] args) {
	
	    int quantity=0;
	    String SKU;
	    Scanner ac =new Scanner(System.in);
	    System.out.println("Enter a SKU:");
		SKU =ac.nextLine();
		bookDB book =new bookDB();
		Book book1=new Book();
		
		book1= book.getBookFromDB(SKU);
		System.out.println(book1.getSKU());
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		System.out.println(book1.getDescription());
		System.out.println(book1.getPrice());
	
		
		
		

	}
}
