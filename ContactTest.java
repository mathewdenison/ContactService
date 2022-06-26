import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test public void createValidTaskData() {
		//Test to set up with default data
	    Contact contact = new Contact("0000000001", "Reading", "Read Novel Book", null);
	    System.out.println(contact);
	 }

}
