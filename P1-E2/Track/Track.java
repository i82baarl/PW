package Track;

import java.util.*;
import Kart.*;

public class Track {
	
	// Variables de la Clase Pista ( Track )
	
	private String name;
	
	private boolean status;
	
	private Type type; // Dificultad o Tipo de pista -> Infantil, Familiar o Adultos.
	
	private int max; 
	
	private List<Kart> karts;
	
	// Constructores de la Clase Pista ( Track )
	
	public Track() {
		
	}
	public Track(String name, boolean status, Type type, int max) {
		
		this.name = name;
		this.status = status;
		this.type = type;
		this.max = max;
		
		karts = new ArrayList<Kart>();
	}
	
	// Observadores de la Clase Pista ( Track )
	
	public String getName() {
		return this.name;
	}
	public boolean getStatus() {
		return this.status;
	}
	public Type getType() {
		return this.type;
	}
	public int getMax() {
		return this.max;
	}
	
	// Modificadores de la Clase Pista ( Track )
	
	public void setName(String name) {
		this.name = name;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	// Metodos auxiliares
	
	public String toString() {
	       return "\nCircuito: " + this.name + "\nEstado: " + this.status + "\nDificultad: " + this.type + "\nKarts maximos: " + this.max;
    }
	
	public List<Kart> checkAvailableKarts() {
		
		List<Kart> availableKarts = new ArrayList<Kart>();
		
		for(int i=0; i<karts.size(); i++) {
			
			if( karts.get(i).getEstado() == Estado.DISPONIBLE ) {
				availableKarts.add(karts.get(i));
			}
		}
		
		return availableKarts;
	}
	
	public boolean addKartToTrack(Kart kart) {
		
		if( this.type == Type.INFANTIL &&  kart.getTipo() == false ) {
			karts.add(kart);
		}
		else if( this.type == Type.ADULTO &&  kart.getTipo() == true ) {
			karts.add(kart);
		}
		else if ( this.type == Type.FAMILIAR ) {
			karts.add(kart);
		}
		else {
			return false;
		}
		return true;
	}

};