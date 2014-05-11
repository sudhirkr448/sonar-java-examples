package org.example.business;

import org.example.client.AddressController;
import org.example.model.Address;
import org.example.persistence.AddressDAO;
import org.example.persistence.AddressDAOImpl;

/**
 * Stellt die Dienste für die Verwaltung von Addressen.
 */
public class AddressServiceImpl implements AddressService {

	private AddressDAO addressDAO = new AddressDAOImpl();
	
	public String createAddress(Address address) {
		// prüfung auf nicht null object
		// exception wird geworfen bei nicht erfüllung der PRE Condition
		Address save = addressDAO.save(address);
		return save.getId();
	}

	public Address findAddress(String city, String street, String zipCode) {
		// prüfung auf die eingebebenen Parameter
		return addressDAO.findAddress(city, street, zipCode);
	}

	public Address getAddressTemplate() {
		/*!! Verletzung !!*/
		return new AddressController().getAddressTemplate();
	}
	
}
