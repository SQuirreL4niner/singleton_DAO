package net.eprojex.DAO.app;

import javax.swing.SwingUtilities;



import net.eprojex.DAO.controller.Controller;
import net.eprojex.DAO.model.Model;
import net.eprojex.DAO.view.View;



public class App {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				runApp();
			}
			
		});
	}
	
	public static void runApp() {
		Model model = new Model();
		View view = new View(model);

		Controller controller = new Controller(view, model);	//set controller as a listener to view and model
																////////////the observer!!!!!!!!!
		
		view.setLoginListener(controller);
	}

}
