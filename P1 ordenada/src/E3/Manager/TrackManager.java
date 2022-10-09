package E3.Manager;

import java.util.*;

import E1.Kart.*;
import E1.Track.*;

public class TrackManager {

	// Variables
	
	private static TrackManager instance = null;
	
	private ArrayList<Track> tracks = new ArrayList<Track>();
	private ArrayList<Kart> karts = new ArrayList<Kart>();
	
	
	// Constructores
	
	public TrackManager() {
		
	}
	
	// Observadores
	
	public static TrackManager getInstance() {
		if (instance == null) {
			instance = new TrackManager();
		}
		return instance;
	}
	public ArrayList<Track> getTracks() {
		return tracks;
	}
	public ArrayList<Kart> getKarts() {
		return karts;
	}
	
	// Metodos Auxiliares
	
	public void addKartList(Kart kart) {
		karts.add(kart);
	}
	public void addTrackList(Track track) {
		tracks.add(track);
	}
	public void addKart(int identificador, boolean tipo) {
		for (int i = 0; i < karts.size(); i++) {
			karts.get(i).setIdentificador(identificador);
			karts.get(i).setTipo(tipo);
			karts.get(i).setEstado(Estado.DISPONIBLE);
		}
	}
	public void addTrack(String name, Type type, int max, int id) {
		for (int i = 0; i < karts.size(); i++) {
			tracks.get(i).setName(name);
			tracks.get(i).setStatus(true);
			tracks.get(i).setType(type);
			tracks.get(i).setMax(max);
			tracks.get(i).setId(id);
		}
	}
	public void addKartToTrack(int trackId, int kartId) {
		int cont = 0;
		
		for (int i = 0; i < karts.size(); i++) {
			if (karts.get(i).getTrackId() == trackId) {
				cont++;
			}
		}
		for (int i = 0; i < karts.size(); i++) {
			if (karts.get(i).getIdentificador() == kartId && karts.get(i).getEstado() == Estado.DISPONIBLE && tracks.get(i).getMax() > cont) {
				karts.get(i).setTrackId(trackId);
				cont++;
			}
		}
	}
	// No hay forma de diferenciar mantenimiento y reservadas segun el pdf, asi que las listamos todas
	public Track listMaintenanceTracks() {
		for (int i = 0; i < tracks.size(); i++) {
	    	if (tracks.get(i).getStatus() == false) {
	    		Track trck = tracks.get(i);
	    		return trck;
	    	}
	    }
		return null;
	}
	public Track findTracks(int nKarts, Type pista) {
	    for (int i = 0; i < tracks.size(); i++) {
	    	if (tracks.get(i).getMax() >= nKarts && tracks.get(i).getType() == pista && tracks.get(i).getStatus() == true) {
	    		Track trck = tracks.get(i);
	    		return trck;
	    	}
	    }
	    return null;
	}
}
