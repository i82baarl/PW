package E2.Book;

public class AdultBook extends Book {
	
	// Variables
	
	private int nOfAdults;	// El reservador se incluye si o si
	
	// Constructor
	
	public AdultBook(int nAdults) {
		this.nOfAdults = nAdults;
	}
	
	// Observadores
	
	public int getnOfAdults() {
		return this.nOfAdults;
	}
		
	// Modificadores
		
	public void setnOfAdults(int nAdults) {
		this.nOfAdults = nAdults;
	}
}
