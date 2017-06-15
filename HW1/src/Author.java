
public class Author {

	public String firstName;
	public String lastName;
	public int numOfBooks;
	
	
	public Author(String firstName){
		
		this.firstName=firstName;
		
		}
	
	public Author(String firstName, String lastName){
		
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	
	public String authorInfo(){
		
		return "Name : " + firstName +" " + lastName + "\nNumber Of Books : " + numOfBooks + " ";
	
	}
	public int numOfBooks(){
    
		return numOfBooks;
		
	}
	
}
