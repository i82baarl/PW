package E1.Kart;

import java.util.*;

public class Kart {
	
	// Variables

	private int identificador;
	
	private boolean tipo; // 0 si es para ninos, 1 si es para adultos
	
	private Estado estado;
	
	// Constructores
	
	public Kart()
	 {
		 this.identificador = 0;
		 this.tipo = true;
		 this.estado = Estado.DISPONIBLE; 
	 }
	
	public Kart(int identificador, boolean tipo, Estado estado)
	{
		this.identificador = identificador;
		this.tipo = tipo;
		this.estado = estado; 
	}
	
	// Observadores 
	
	public int getIdentificador()
	{
		return this.identificador;
	}
	
	public boolean getTipo()
	{
		return this.tipo;
	}
	
	public Estado getEstado()
	{
		return this.estado;
	}
	
	// Modificadores
	
	public void setIdentificador(int identificador)
	{
		this.identificador = identificador;
	}
	
	public void setTipo(boolean tipo)
	{
		this.tipo = tipo;
	}
	
	public void setEstado(Estado estado)
	{
		this.estado = estado;
	}
	
	// Metodos auxiliares
	
	public String toString () 
	{
       return "Kart: " + this.identificador + "\nTipo: " + this.tipo + "\nEstado: " + this.estado;
    }
	
	
}
