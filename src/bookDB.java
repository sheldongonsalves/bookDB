
public class bookDB {
	public static Book getBookFromDB(String sku)
	{
		Book book =new Book();
		switch(sku)
		{
		case "Java1001":
		{
			book.setSKU("Java1001");
			book.setTitle("Head First Java");
			book.setAuthor("Kathy Sierra and Bert Bates");
			book.setDescription("Easy to read Java workbook");
			book.setPrice(47.50);
			break;
		}
		case "Java1002":
		{
			book.setSKU("Java1002");
			book.setTitle("Thinking in Java");
			book.setAuthor("Bruce Eckel");
			book.setDescription("Details about Java under the hood");
			book.setPrice(20.00);
			break;
		}
		case "Orcl1003":
		{
			book.setSKU("Orcl1003");
			book.setTitle("OCP: Oracle Certified Professional Java SE");
			book.setAuthor("Jeanne Boyarsky");
			book.setDescription("Everything you need to know in one place");
			book.setPrice(45.00);
			break;
			
		}
		case "Python1004":
		{
			book.setSKU("Python1004");
			book.setTitle("Automate the Boring Stuff with Python");
			book.setAuthor("Al Sweigart");
			book.setDescription("Fun with Python");
			book.setPrice(10.00);
			break;
		}
		case "Zombie1005":
		{
			book.setSKU("Zombie1005");
			book.setTitle("The Maker's Guide to the Zombie Apocalypse");
			book.setAuthor("Simon Monk");
			book.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
			book.setPrice(16.50);
			break;
			
		}
		case "Rasp1006":
		{
			book.setSKU("Zombie1005");
			book.setTitle("Raspberry Pi Projects for the Evil Genius");
			book.setAuthor("Donald Norris");
			book.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
			book.setPrice(14.75);
			break;
		}
		default:
		{
			book.setSKU("");
			book.setTitle("");
			book.setAuthor("");
			book.setDescription("");
			book.setPrice(0.0);
			break;
			
		}
		}
		return book;
	}

}
