package E2.Book;

public class InfantBook extends Book {
	
	// Variables
	
	private int nOfKids;
	
	// Constructor
	
	public InfantBook() {
		
	}
	public InfantBook(int nKids) {
		this.nOfKids = nKids;
	}
	
	// Observadores
	
	public int getNOfKids() {
		return this.nOfKids;
	}
	
	// Modificadores
	
	public void setNOfKids(int nKids) {
		this.nOfKids = nKids;
	}
	
}
