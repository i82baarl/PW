package E1.User;

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.*;

public class User {

    // Variables
	
    private String firstName;
    
    private String secondName;
    
    private Date birthDate;
    
    private Date registerDate;
    
    private String mail;

    private int userId;
    
    // Constructores
    
    public User () {

    }
    
    public User (String firstName, String secondName, Date birthDate, String mail) {
        
    	this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.mail = mail;
        
        LocalDateTime todaysDate = LocalDateTime.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        this.registerDate = Date.from(todaysDate.atZone(defaultZoneId).toInstant());
        
    }

    // Observadores
    
    public String getFirstName() {
    	return this.firstName;
    }
    
    public String getSecondName() {
    	return this.secondName;
    }
    
    public Date getBirthDate() {
    	return this.birthDate;
    }
    
    public Date getRegisterDate() {
    	return this.registerDate;
    }
   
    public String getMail() {
    	return this.mail;
    }
    
    public int getUserId() {
    	return this.userId;
    }
    
    // Modificadores
    
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
   
    public void setSecondName(String secondName) {
    	this.secondName = secondName;
    }
    
    public void setBirthDate(Date birthDate) {
    	this.birthDate = birthDate;
    }
   
    public void setRegisterDate(Date registerDate) {
    	this.registerDate = registerDate;
    }
    
    public void setMail(String mail) {
    	this.mail = mail;
    }
    
    public void setUserId (int userId) {
    	this.userId = userId;
    }

    // Metodos auxiliares
    
    public String toString () 
    {
       return "\nNombre: " + this.firstName +
              "\nApellido: " + this.secondName +
              "\nFecha de nacimiento: " + this.birthDate +
              "\nFecha de inscripcion: " + this.registerDate +
              "\nCorreo: " + this.mail +
              "\nId usuario: " + this.userId;
    }
    
    public int calculateSeniority (Date actualDate) {
        int registrado;
        
		Calendar calendarA = Calendar.getInstance();
		Calendar calendarP = Calendar.getInstance();
		
		calendarA.setTime(actualDate);
		calendarP.setTime(this.registerDate);
		
		registrado = calendarA.get(Calendar.YEAR) - calendarP.get(Calendar.YEAR);
		return registrado;
    }
}