package E2.Bonus;

import java.time.LocalDateTime;
import java.time.*;
import java.util.Date;

import E1.Track.Type;

public class Bonus {


	private int idBonus;
	
	private int idUser;
	
	// Stores the number of sesions available
	private int numberOfSesion;
	
	private Type bonusType;
	
	private Date dateOfExpiry;
	
	public Bonus(/*int idBonus,*/ int idUser, Type bonusType) {
		
		//this.idBonus = idBonus;
		this.idUser = idUser;
		
		this.numberOfSesion = 5;
				
		LocalDateTime todaysDate = LocalDateTime.now();
		
		todaysDate.plusYears(1);
		
		ZoneId defaultZoneId = ZoneId.systemDefault();
		
		this.dateOfExpiry = Date.from(todaysDate.atZone(defaultZoneId).toInstant());
		
		this.bonusType = bonusType;
	}
	
	public int getIdUser() {
		return this.idUser;
	}
	
	public int getIdBonus() {
		return this.idBonus;
	}
	
	public Date getExpiryDate() {
		return this.dateOfExpiry;
	}
	
	public Type getBonusType() {
		return this.bonusType;
	}
}
