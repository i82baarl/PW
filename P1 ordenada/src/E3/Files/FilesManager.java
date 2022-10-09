package E3.Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import E3.Manager.Espectador;

public class FilesManager {
public static void cargar_fichero(){
        
		String idUser;
		String idBonus;
		String bonusType;
		String numberOfSesion;
		
		
		try {
			FileReader bonos = new FileReader("bonos.txt");
			BufferedReader br = new BufferedReader(bonos);
	
			while((ID_String = br.readLine())!=null){
				idUser=br.readLine();
				apellido=br.readLine();
				nick=br.readLine();
				correo=br.readLine();
				pass=br.readLine();
				ID=Integer.valueOf(ID_String);
	
				Espectador p = new Espectador();
				p.setUserId(ID);
				p.setName(nombre);
				p.setSurname(apellido);
				p.setNick(nick);
				p.setEmail(correo);
				p.setPass(pass);
	           espectadores.add(p);
	           mostrarEspectador();
	
	       }
	   }catch(Exception ex) {
	       ex.printStackTrace();}
	       }
public static void actualizar_fichero() {
       try {
           FileWriter fichero = new FileWriter("bonos.txt");
           for(int i=0;i<espectadores.size();i++) {
               fichero.write(espectadores.get(i).getUserId()+"\n");
               fichero.write(espectadores.get(i).getName()+"\n");
               fichero.write(espectadores.get(i).getSurname()+"\n");
               fichero.write(espectadores.get(i).getNick()+"\n");
               fichero.write(espectadores.get(i).getEmail()+"\n");
               fichero.write(espectadores.get(i).getPass()+"\n");
           }

           fichero.close();
       }catch(Exception ex) {ex.printStackTrace();}
}
}
