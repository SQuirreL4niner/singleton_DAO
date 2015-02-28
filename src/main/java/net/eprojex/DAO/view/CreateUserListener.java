package net.eprojex.DAO.view;

import java.sql.SQLException;



public interface CreateUserListener {					//created not as a class, but as an interface...duh
	public void userCreated(CreateUserEvent event) throws SQLException;		//loginPerfomed is a method..duh
}
