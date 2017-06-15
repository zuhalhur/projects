
public class Library {
	
	public static int totalCount;
	public static int loanedCount;
	
	
	public static String currentLibraryStatus(){
		
		String a="***********************\n";
		a += "TOTAL COUNT:"+totalCount+"\n";
		a += "EXISTING:"+(totalCount-loanedCount)+"\n";
		a += "LOANED:"+loanedCount+"\n";
		a += "****************************";
		return a;
		
	}
	public static void setAuthor(Book book,Author author){
		
		book.setAuthor(author);
				
		}
			
	
	public static void setPublisher(Book book,Publisher publisher){
		
		book.setPublisher(publisher);
	
	}
	
	public static void main(String []args){
		
		
		Book a=new Book("Java Programming", 2000, 500);
		Book b=new Book ("C Programming", 2005 , 698);
		Book c=new Book ("Database Management", 2010, 555);
		Book d=new Book ("Data Structure", 1999,789);
		
		Author e=new Author("Zuhal", "HUR");
		Author f=new Author ("Tugberk", "TAS");
		
		Publisher g=new Publisher("Deitel");
		Publisher h=new Publisher("Mark Allens");
		
		Library.setAuthor(a, e);
		Library.setAuthor(b,f);
		Library.setAuthor(c, e);
		Library.setAuthor(d, f);
		
		Library.setPublisher(a,h);
		Library.setPublisher(b, g);
		Library.setPublisher(c, h);
		Library.setPublisher(d, g);
		
		a.loanBook();
					
		
		System.out.println(a.bookInfo());
		System.out.println("                            ");
		System.out.println(b.bookInfo());
		System.out.println("                            ");
		System.out.println(c.bookInfo());
		System.out.println("                            ");
		System.out.println(d.bookInfo());
		System.out.println("                            ");
		System.out.println("**************************************\n");
		System.out.println(e.authorInfo());
		System.out.println("                            ");
		System.out.println(f.authorInfo());
		System.out.println("                            ");
		System.out.println("**************************************\n");
		System.out.println(g.publisherInfo());
		System.out.println("                            ");
		System.out.println(h.publisherInfo());
		System.out.println("                            ");
		System.out.println("***************************************\n");
		System.out.println(Library.currentLibraryStatus());
		
	}

}
