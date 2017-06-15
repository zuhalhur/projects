
public class Book {

	public   String name;
	private  int year;
	private  int numOfPages=0;
	private  Author author;
	private  Publisher publisher;
	private  boolean isLoaned = false;
	
	
	public Book(String name,int year)
	{
		
		this.name=name;
		this.year=year;
		Library.totalCount++; 	
		
	}
	public Book(String name, int year, int numOfPages)
	{
		
		this.name=name;
		this.year=year;
		this.numOfPages=numOfPages;
		Library.totalCount++;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	public void setName(String name) {
		
		this.name = name;
		
	}
	public int getYear() {
		
		return year;
		
	}
	public void setYear(int year) {
		
	  if(year<1000 && year>2016)
         System.out.println("Invalid year!!");
	  
	  else
		this.year = year;
	  
	}
	public int getNumOfPages() {
		
		return numOfPages;
		
	}
	public void setNumOfPages(int numOfPages) {
		
		this.numOfPages = numOfPages;
		
	}
	
	public Author getAuthor() {
		
		return author;
		
	}
	public void setAuthor(Author author) {
		
		this.author = author;
		author.numOfBooks++;
		
	}
	public Publisher getPublisher() {
		
		return publisher;
		
	}
	public void setPublisher(Publisher publisher) {
		
		this.publisher = publisher;
		publisher.numOfBooks++;
		
	}
	public boolean isLoaned() {
		
		if(isLoaned == true)
			return true;
		
		else
			return false;
		
		}
	public void setLoaned(boolean isLoaned) {
		
		this.isLoaned = isLoaned;
	}
	
	
	public  String bookInfo(){
	
		return "Book Name :  " + name + "\nYEAR: " + year + "\nPage Count : " + numOfPages + "\nPublisher : "  + publisher.name +   "\nAuthor : " + author.firstName + " " + author.lastName +  "\nLoaned : " + isLoaned + " ";
}
	public void loanBook(){
		
		if(isLoaned == false){
			 Library.loanedCount++;
		     isLoaned=true;
		}
		
		else 
		   System.out.println("Kitap zaten alýndý.!!!!");
		
	}
	
}
