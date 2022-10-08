package E2.Book;
import java.util.Date;

public abstract class Book {
	
	// Variables
	
	protected String id;	 // Identificador (no definida su composicion)
	
	protected Date date;
	
	protected Date time;
	
	protected int duration; // Tiempo expresado en minutos (entero)
	
	protected String trackId; // Nombre del circuito (debe existir)
	
	protected float price; // Precio en euros (flotante)
	
	protected int discount; // Descuento por antiguedad
	
	
	
	// Constructores
	
	public Book(){
		
	}
	
    // Observadores

	public String getId() {
    	return this.id;
    }
	public Date getDate() {
    	return this.date;
    }
	public Date getTime() {
    	return this.time;
    }
	public int getDuration() {
    	return this.duration;
    }
	public String getTrackId() {
    	return this.trackId;
    }
	public float getPrice() {
		return this.price;
	}
	public int getDiscount() {
		return this.discount;
	}
	
	// Modificadores
	
	public void setId(String id) {
    	this.id = id;
    }
	public void setDate(Date date) {
    	this.date = date;
    }
	public void setTime(Date time) {
    	this.time = time;
    }
	public void setDuration(int duration) {
    	this.duration = duration;
    }
	public void setTrackId(String trackId) {
    	this.trackId = trackId;
    }
	public void setPrice(float price) {
		this.price = price;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	// Metodos auxiliares
	
	// ¡¡¡¡Comprobar que el que reserva es adulto!!!!
	
	public String toString () 
    {
       return "\nIdentificador: " + this.id +
              "\nFecha: " + this.date +
              "\nHora: " + this.time +
              "\nDuracion: " + this.duration +
              "\nCircuito: " + this.trackId +
              "\nPrecio: " + this.price +
              "\nDescuento: " + this.discount + "%";
    }
}
