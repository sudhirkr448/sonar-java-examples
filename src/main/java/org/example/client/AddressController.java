package org.example.client;

import org.example.business.AddressService;
import org.example.business.AddressServiceImpl;
import org.example.model.Address;
import org.example.persistence.AddressDAOImpl;

/**
 * Bietet Funktionen zur Verwaltung von Addressen.
 */
public class AddressController {

	private static final String NAVIGATION_ID = "navigation_id";
	private AddressService service = new AddressServiceImpl();

	String create() {
		Address address = getAddress();
		service.createAddress(address);
		return NAVIGATION_ID;
	}

	/* !! Verletzungen !! */
	String createByAccessingDAO() {
		new AddressDAOImpl().save(getAddress());
		return NAVIGATION_ID;
	}
	
	/*
	 * z.B Zugriff auf einen BackingBean um die Werte aus dem View zu lesen.
	 */
	private Address getAddress() {
		return new Address();
	}
	
	public String getAddressTemplate() {
		return "";
	}
}
