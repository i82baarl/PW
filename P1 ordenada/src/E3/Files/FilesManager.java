package E3.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import E3.Manager.*;
import E1.Track.*;
import E1.User.*;
import E2.Book.*;


public class FilesManager {

	public boolean loadSystem() throws IOException, ParseException {
	    File userStorage = new File("users.txt");
	    File kartStorage = new File("karts.txt");
	    File trackStorage = new File("tracks.txt");
	    File bookStorage = new File("books.txt");
	    File bonusStorage = new File("sesions.txt");

	    if (!userStorage.exists()) {
	      FileWriter newUserStorage = new FileWriter("users.txt");
	      newUserStorage.close();
	    }

	    Scanner userReader = new Scanner(userStorage);

	    UserManager userManager = UserManager.getInstance();

	    if (userReader.hasNextInt()) {
	      String data = userReader.nextLine();

	      while (userReader.hasNextLine()) {
	        data = userReader.nextLine();
	        String[] parts = data.split(",");

	        User user = new User();
	        user.setUserId(Integer.parseInt(parts[0]));
	        user.setFirstName(parts[1]);
	        user.setSecondName(parts[2]);
	        user.setMail(parts[3]);
	        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(parts[4]);
	        user.setBirthDate(date1);
	        Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(parts[5]);
	        user.setRegisterDate(date2);
	        userManager.addUser(user);
	      }
	    }
	    userReader.close();
	    
	    
	    
	    
	    /*if (!bookStorage.exists()) {
		      FileWriter newBookStorage = new FileWriter("books.txt");
		      newBookStorage.close();
		    }

		    Scanner bookReader = new Scanner(userStorage);

		    BookManager bookManager = BookManager.getInstance();

		    if (bookReader.hasNextInt()) {
		      String data = bookReader.nextLine();

		      while (bookReader.hasNextLine()) {
		        data = bookReader.nextLine();
		        String[] parts = data.split(",");

		        Book book = new Book();
		        book.setId(Integer.parseInt(parts[0]));
		        book.setDuration(Integer.parseInt(parts[1]));
		        book.setTrackId(Integer.parseInt(parts[2]));
		        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(parts[3]);
		        book.setDate(date1);
		        Date date2=new SimpleDateFormat("HH:mm").parse(parts[4]);
		        book.setTime(date2);
		        bookManager.addBook(book);
			}
		}
		userReader.close();*/

	    if (!TrackStorage.exists()) {
	      FileWriter newTrackStorage = new FileWriter("users.txt");
	      newTrackStorage.close();
	    }

	    Scanner trackReader = new Scanner(userStorage);

	    TrackManager trackManager = TrackManager.getInstance();

	    if (trackReader.hasNextInt()) {
	      String data = trackReader.nextLine();

	      while (trackReader.hasNextLine()) {
	        data = trackReader.nextLine();
	        String[] parts = data.split(",");

	        Track track = new Track();
	        track.setId( Integer.parseInt(parts[0]) );
	        track.setMax( Integer.parseInt(parts[1]) );
	        track.setName(parts[3]);
	        //track.setStatus(parts[4]);		// cuidado boleano en texto
	        //track.setType(parts[5]);			// cuidado type en texto
	        trackManager.addTrackList(track);
	      }
	    }
	    trackReader.close();

	 
	    return true;
	}
	public boolean saveSystem() throws IOException {
		
		FileWriter userStorage = new FileWriter("users.txt");
		FileWriter kartStorage = new FileWriter("karts.txt");
		FileWriter trackStorage = new FileWriter("tracks.txt");
		FileWriter bookStorage = new FileWriter("books.txt");
		FileWriter bonusStorage = new FileWriter("sesions.txt");

	    UserManager userManager = UserManager.getInstance();
	    ArrayList<User> users = userManager.getUsers();
	    
	    for (int i = 0; i < users.size(); i++) {
	    	 
	        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	        String date1 = formatter.format(users.get(i).getBirthDate());
	        String date2 = formatter.format(users.get(i).getRegisterDate());
	    	
		    userStorage.write(
				users.get(i).getUserId() +
				"," +
				users.get(i).getFirstName() +
				"," +
				users.get(i).getSecondName() +
				"," +
				users.get(i).getMail() +
				"," +
				date1 +
				"," +
				date2 +
				"\n"
		    );
	    }
	    userStorage.close();
		return true;
	}
	
}
