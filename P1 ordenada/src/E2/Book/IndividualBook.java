package E2.Book;


import java.util.*;
import E1.User.*;
import E2.*;
import E3.Manager.UserManager;


public class IndividualBook extends AbstractBook {
	
	public InfantBook createInfantBook() {
		
		Scanner input = new Scanner(System.in);
		InfantBook item = new InfantBook(1);
		
		UserManager user = UserManager.getInstance();
		
		item.setId( user.getUserId() );
		
		System.out.println("\nDuracion (min) :");
		int i = input.nextInt();
		item.setDuration(i);
		
		System.out.println("\nNombre del circuito :");
		String s = input.nextLine();
		item.setTrackId(s);
		
		System.out.println("\nFecha de la reserva :");
		s = input.nextLine();
		// convertir cadena a fecha
		//item.setDate(s);
		
		System.out.println("\nHora de la reserva :");
		s = input.nextLine();
		// convertir cadena a hora
		//item.setTime(s);
		
		Track track = new Track();
		track.setType("INFANTIL");
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
