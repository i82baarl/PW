package E3.User;
import java.util.Date;

public class User {

    // Variables
	
	private int id;
	
    private String firstName;
    
    private String secondName;
    
    private Date birthDate;
    
    private Date registerDate;
    
    private String mail;

    // Constructores
    
    public User () {

    }
    
    public User (String firstName, String secondName, Date birthDate, String mail) {
        
    	this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.registerDate = new Date();
        this.mail = mail;
        
    }

    // Observadores
    
    public int getUserId() {
    	return id;
    }
    
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

    // Modificadores
    
    public void setUserId(int id) {
    	this.id = id;
    }
    
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

    // Metodos auxiliares
    
    public String toString () 
    {
       return "\nNombre: " + this.firstName +
              "\nApellido: " + this.secondName +
              "\nFecha de nacimiento: " + this.birthDate +
              "\nFecha de inscripcion: " + this.registerDate +
              "\nCorreo: " + this.mail;
    }
    
    public int calculateSeniority (Date actualDate) {
        int registrado;
        registrado = actualDate.getYear() - registerDate.getYear();
        return registrado;
    }
}