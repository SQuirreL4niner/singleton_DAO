package net.eprojex.DAO.controller;

import java.sql.SQLException;

import net.eprojex.DAO.model.DAOFactory;
import net.eprojex.DAO.model.Model;
import net.eprojex.DAO.model.Person;
import net.eprojex.DAO.model.PersonDAO;
import net.eprojex.DAO.view.CreateUserEvent;
import net.eprojex.DAO.view.CreateUserListener;
import net.eprojex.DAO.view.View;



	public class Controller implements CreateUserListener {			//controller is the implementing class
		//of the main method "application"
		private View view;
		private Model model;
		
		private PersonDAO personDAO = DAOFactory.getPersonDAO();
		
		public Controller(View view, Model model) {		//the controller is listening to the 
		//events in the view and model classes
		//when the "ok" button is clicked
			this.view = view;
			this.model = model;
		}
		
		public void userCreated(CreateUserEvent event) throws SQLException {			//loginPerformed method**
			
			System.out.println("Login event received: " + event.getName() + " ------ " + event.getPassword());

			try {
				personDAO.addPerson(new Person(event.getName(), event.getPassword()));
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
			
			
}

		/*public void loginPerformed(CreateUserEvent event) {
			// TODO Auto-generated method stub
			
		}*/

		

}

