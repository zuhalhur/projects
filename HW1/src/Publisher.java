
public class Publisher {

	public String name;
	public int numOfBooks;
	
	public Publisher(){
		
	}
	
	public Publisher(String name){
		
		this.name=name;
		
	}
	
	public String publisherInfo(){
		
		return "Name : " + name + "\nNumber Of Books : " + numOfBooks + " ";
		
	}
	
	public int numOfBooks(){
		
		return numOfBooks;
		
	}
	
	
}
