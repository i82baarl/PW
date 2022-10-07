package E2.Book;

public class IndividualBook extends AbstractBook {
	
	public InfantBook createInfantBook() {
		
		InfantBook item = new InfantBook(1);

		return item;
	}
	
	public FamiliarBook createFamiliarBook() {
			
		FamiliarBook item = new FamiliarBook();
		return item;
	}

	public AdultBook createAdultBook() {
		
		AdultBook item = new AdultBook();
		return item;
	}
}
