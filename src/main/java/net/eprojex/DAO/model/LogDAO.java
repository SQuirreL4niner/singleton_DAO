package net.eprojex.DAO.model;

import java.util.List;

public class LogDAO {
	
	public void addEntry(String message) {
		//not implemented
		//get current time and add log message to database
	}
	
	public List<Log> getEntries(int number) {
		//not implemented..gets the latest number in message log
		
		return null;
	}
	
	//Maybe no need for update or delete CRUD functions in this case
}
