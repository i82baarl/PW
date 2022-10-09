package E2.Book;

public class FamiliarBook extends Book {
	
	// Variables
	
	private int nOfKids;
	
	private int nOfAdults; // ¡¡!! > 1
	
	// Constructor
	
	public FamiliarBook(int nAdults, int nKids) {
		this.nOfKids = nKids;
		this.nOfAdults = nAdults;
	}
	
	// Observadores
	
	public int getNOfKids() {
		return this.nOfKids;
	}
	public int getnOfAdults() {
		return this.nOfAdults;
	}
		
	// Modificadores
		
	public void setNOfKids(int nKids) {
		this.nOfKids = nKids;
	}
	public void setnOfAdults(int nAdults) {
		this.nOfAdults = nAdults;
	}
}
