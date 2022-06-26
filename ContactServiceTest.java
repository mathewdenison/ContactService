import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class ContactServiceTest {

	   //Testing the method to add item to contact list when valid data
	   @Test
	   public void testMethodAddPass() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("D101", "Mat", "Denison", "1820 Joshua Tree BLVD");
	       Contact c2 = new Contact("D102", "Mathew", "Denison", "1820 Joshua Tree BLVD");
	       Contact c3 = new Contact("D103", "Matt", "Denison", "1820 Joshua Tree BLVD");
	   }

	   //Testing the method to add item when called data is invalid
	   @Test
	   public void testMethodAddFail() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("D101", "Mat", "Denison", "1820 Joshua Tree BLVD");
	       Contact c2 = new Contact("D102", "Mathew", "Denison", "1820 Joshua Tree BLVD");
	       Contact c3 = new Contact("D103", "Matt", "Denison", "1820 Joshua Tree BLVD");
	   }

	   //Testing the delete method for valid data
	   @Test
	   public void testMethodDeletePass() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("D101", "Mat", "Denison", "1820 Joshua Tree BLVD");
	       Contact c2 = new Contact("D102", "Mathew", "Denison", "1820 Joshua Tree BLVD");
	       Contact c3 = new Contact("D103", "Matt", "Denison", "1820 Joshua Tree BLVD");

	   }

	   //Testing the delete method for invalid data
	   @Test
	   public void testMethodDeleteFail() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("D101", "Mat", "Denison", "1820 Joshua Tree BLVD");
	       Contact c2 = new Contact("D102", "Mathew", "Denison", "1820 Joshua Tree BLVD");
	       Contact c3 = new Contact("D103", "Matt", "Denison", "1820 Joshua Tree BLVD");

	   }

	   //Testing the update method for valid data
	   @Test
	   public void testUpdatePass() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("D101", "Mat", "Denison", "1820 Joshua Tree BLVD");
	       Contact c2 = new Contact("D102", "Mathew", "Denison", "1820 Joshua Tree BLVD");
	       Contact c3 = new Contact("D103", "Matt", "Denison", "1820 Joshua Tree BLVD");

	   }

	   //Testing the update method for invalid data
	   @Test
	   public void testUpdateFail() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("D101", "Mat", "Denison", "1820 Joshua Tree BLVD");
	       Contact c2 = new Contact("D102", "Mathew", "Denison", "1820 Joshua Tree BLVD");
	       Contact c3 = new Contact("D103", "Matt", "Denison", "1820 Joshua Tree BLVD");

	   }

	}