package contactManagementSystem;

import java.util.ArrayList;

public class ContactManagementSystem {

	public static void main(String[] args) {
		
		ArrayList<Contact>contacts = new ArrayList<>();
		for(int i=1; i<100; i++) {
			Contact c = new Contact();
			c.setID(i-1);
			c.setFirstName("First Name");
			c.setLastName("Last Name");
			c.setPhoneNumber("Phone Number");
			c.setEmail("Email");
			contacts.add(c);
		}
		new ContactList(contacts);
	}
	
	
}