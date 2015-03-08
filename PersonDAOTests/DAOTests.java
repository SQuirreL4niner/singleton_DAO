import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.sql.SQLException;







import java.util.List;

import net.eprojex.DAO.model.DAOFactory;
import net.eprojex.DAO.model.Database;
import net.eprojex.DAO.model.Person;
import net.eprojex.DAO.model.PersonDAO;


public class DAOTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("set up before class..connect to database");
		Database.getInstance().connect();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		System.out.println("tear down after class..disconnect to database");
		Database.getInstance().disconnect();
	}



	@Before
	public void setUp() throws Exception {
		
		System.out.println("set up what to test from database");
		
		PersonDAO dao = DAOFactory.getPersonDAO();
		
		dao.deleteAll();
		
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("tear down");
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
		//assertEquals("This string is one way you can overload a constructor in Java", 19, int y = 19);
	}*/
	
	@Test
	public void testCreate() throws SQLException {
		
		PersonDAO = DAOFactory.getPersonDAO();
		
		Person person1 = new Person("Dude", "work");
		//Person person2 = new Person("Yippie", "Yo");
		
		dao.addPerson(person1);
		//dao.addPerson(person2);
		
		List<Person> people = dao.getPeople();
		
		//assertEquals("Should be two people in database", 2, people.size());
		
		assertEquals("These two people should be the same", person1, people.get(3));
		//assertEquals("These two people should be the same", person2, people.get(1));
	}

}

