package E2.Book;

public class BonusBook extends AbstractBook {
	
	public InfantBook createInfantBook( ) {
		
		InfantBook item = new InfantBook();
		return item;
	}
	
	public FamiliarBook createFamiliarBook( ) {
			
		FamiliarBook item = new FamiliarBook();
		return item;
	}

	public AdultBook createAdultBook( ) {
		
		AdultBook item = new AdultBook();
		return item;
	}
}
