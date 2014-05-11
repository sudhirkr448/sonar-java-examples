package org.example.client;

import org.example.model.Address;
import org.example.persistence.AddressDAOImpl;

/**
 * Bietet Funktionen zur Verwaltung von Addressen.
 */
public class AddressController {

	private static final String NAVIGATION_ID = "navigation_id";

	
	String create() {
		/*!! Verletzung !!*/
		new AddressDAOImpl().save(getAddress());
		return NAVIGATION_ID;
	}

	/*
	 * z.B Zugriff auf einen BackingBean um die Werte aus dem View zu lesen.
	 */
	private Address getAddress() {
		return new Address();
	}
	
	public Address getAddressTemplate() {
		return new Address("Wolfsburg", "Alexandro-volta-strasse 9", "38000");
	}
}
