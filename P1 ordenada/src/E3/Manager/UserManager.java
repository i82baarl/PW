package E3.Manager;

import java.util.*;
import E1.User.*;

public class UserManager {
	
	// Variables
	
	private static UserManager instance = null;

	private ArrayList<User> users = new ArrayList<User>();

	private User activeUser;

	private int userId;
	
	// Constructores
	
	private UserManager() {
		
	}
	
	// Observadores
	
	public static UserManager getInstance() {
		if (instance == null) {
			
	    	instance = new UserManager();
	    }
	    return instance;
	}
	public ArrayList<User> getUsers() {
		return users;
	}
	public User getActiveUser() {
	    return activeUser;
	}
	public int getUserId() {
	    return userId;
	}
	
	
	// Modificadores
	
	public void setUsers(ArrayList<User> users) {
	    this.users = users;
	}
	public void setActiveUser(User activeUser) {
	    this.activeUser = activeUser;
	}
	public void setUserId(int userId) {
	    this.userId = userId;
	}
	
	// Metodos auxiliares
	
	public User findUser(int userId) {
	    for (int i = 0; i < users.size(); i++) {
	    	if (users.get(i).getUserId() == userId) {
	    		User user = users.get(i);
	    		return user;
	    	}
	    }
	    return null;
	}
	public boolean addUser(User user) {
	    users.add(user);
	    return true;
	}
	public boolean modifyUser(User user) {
	    for (int i = 0; i < users.size(); i++) {
	    	if (users.get(i).getUserId() == user.getUserId()) {
	    		users.get(i).setFirstName(user.getFirstName());
	    		users.get(i).setSecondName(user.getSecondName());
		        users.get(i).setBirthDate(user.getBirthDate());
		        users.get(i).setRegisterDate(user.getRegisterDate());
		        users.get(i).setMail(user.getMail());
		        if (activeUser.getUserId() == user.getUserId()) {
		        	activeUser = users.get(i);
		        }
		        return true;
	    	}
	    }
	    return false;
	}
	public boolean deleteUser(int deleteUserId) {
	    return users.removeIf( n -> ( n.getUserId() == deleteUserId && n.getUserId() != activeUser.getUserId() ));
	}
	public boolean registerUser(User user) {
	    users.add(user);
	    userId += 1;
	    return true;
	}
}
