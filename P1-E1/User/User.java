package User;
import java.util.Date;

public class User {

    // Variables
	
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
    
    public String getfirstName() {
    	return this.firstName;
    }
    
    public String getsecondName() {
    	return this.secondName;
    }
    
    public Date getbirthDate() {
    	return this.birthDate;
    }
    
    public Date getregisterDate() {
    	return this.registerDate;
    }
   
    public String getmail() {
    	return this.mail;
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