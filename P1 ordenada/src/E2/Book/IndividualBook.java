package E2.Book;


import java.util.*;
import E1.User.*;
import E1.Track.*;
import E2.*;
import E3.Manager.UserManager;
import java.text.SimpleDateFormat;


public class IndividualBook extends AbstractBook {
	
	public InfantBook createInfantBook() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("¿Cuantos niños van?\n");
		int i = input.nextInt();
		InfantBook item = new InfantBook(i);
		
		UserManager user = UserManager.getInstance();
		
		item.setId(user.getActiveUser().getUserId());
		
		System.out.println("\nDuracion (min) :");
		i = input.nextInt();
		item.setDuration(i);
		
		System.out.println("\nNombre del circuito :");
		i = input.nextInt();
		item.setTrackId(i);
		
        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        String s = input.nextLine();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date bookDate = null;

        try{
            bookDate = df.parse(s);
            item.setDate(bookDate);
        } catch (Exception e){ System.out.println("invalid format");}

        if (!df.format(bookDate).equals(s)){
            System.out.println("invalid date!!");
        } else {
            System.out.println("valid date");
        }
        
        System.out.println("Introduzca la hora con formato HH:mm");
        s = input.nextLine();

        SimpleDateFormat dt = new SimpleDateFormat("HH:mm");
        Date bookTime = null;

        try{
            bookTime = dt.parse(s);
            item.setTime(bookTime);
        } catch (Exception e){ System.out.println("invalid format");}

        if (!df.format(bookTime).equals(s)){
            System.out.println("invalid date!!");
        } else {
            System.out.println("valid date");
        }
		
		Track track = new Track();
		track.setType(Type.INFANTIL);
		return item;
	}
	
	public FamiliarBook createFamiliarBook() {
			
		Scanner input = new Scanner(System.in);
		FamiliarBook item = null;

		System.out.println("¿Cuantos adultos van?\n");
		int i = input.nextInt();
		
		if (i == 0) {
			System.out.println("Tiene que ir minimo un adulto\n");
		} else {
			System.out.println("¿Cuantos niños van?\n");
			int j = input.nextInt();
			item = new FamiliarBook(i,j);
		
			UserManager user = UserManager.getInstance();
			
			item.setId(user.getActiveUser().getUserId());
			
			System.out.println("\nDuracion (min) :");
			i = input.nextInt();
			item.setDuration(i);
			
			System.out.println("\nNombre del circuito :");
			i = input.nextInt();
			item.setTrackId(i);
			
	        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
	        String s = input.nextLine();
	
	        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	        Date bookDate = null;
	
	        try{
	            bookDate = df.parse(s);
	            item.setDate(bookDate);
	        } catch (Exception e){ System.out.println("invalid format");}
	
	        if (!df.format(bookDate).equals(s)){
	            System.out.println("invalid date!!");
	        } else {
	            System.out.println("valid date");
	        }
	        
	        System.out.println("Introduzca la hora con formato HH:mm");
	        s = input.nextLine();
	
	        SimpleDateFormat dt = new SimpleDateFormat("HH:mm");
	        Date bookTime = null;

        	try{
            	bookTime = dt.parse(s);
            	item.setTime(bookTime);
        	} catch (Exception e){ System.out.println("invalid format");}

        	if (!df.format(bookTime).equals(s)){
        		System.out.println("invalid date!!");
        	} else {
        		System.out.println("valid date");
        	}
		
			Track track = new Track();
			track.setType(Type.FAMILIAR);
		}
		return item;
	}

	public AdultBook createAdultBook() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("¿Cuantos adultos van?\n");
		int i = input.nextInt();
		AdultBook item = new AdultBook(i);
		
		UserManager user = UserManager.getInstance();
		
		item.setId(user.getActiveUser().getUserId());
		
		System.out.println("\nDuracion (min) :");
		i = input.nextInt();
		item.setDuration(i);
		
		System.out.println("\nNombre del circuito :");
		i = input.nextInt();
		item.setTrackId(i);
		
        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        String s = input.nextLine();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date bookDate = null;

        try{
            bookDate = df.parse(s);
            item.setDate(bookDate);
        } catch (Exception e){ System.out.println("invalid format");}

        if (!df.format(bookDate).equals(s)){
            System.out.println("invalid date!!");
        } else {
            System.out.println("valid date");
        }
        
        System.out.println("Introduzca la hora con formato HH:mm");
        s = input.nextLine();

        SimpleDateFormat dt = new SimpleDateFormat("HH:mm");
        Date bookTime = null;

        try{
            bookTime = dt.parse(s);
            item.setTime(bookTime);
        } catch (Exception e){ System.out.println("invalid format");}

        if (!df.format(bookTime).equals(s)){
            System.out.println("invalid date!!");
        } else {
            System.out.println("valid date");
        }
		
		Track track = new Track();
		track.setType(Type.ADULTO);
		return item;
	}
}
