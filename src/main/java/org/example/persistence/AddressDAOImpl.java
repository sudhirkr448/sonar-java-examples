/**
 * 
 */
package org.example.persistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.example.model.Address;

/**
 * Stellt die Default implementierung der Datenbankzugriff.
 */
public class AddressDAOImpl implements AddressDAO {

	private static Map<String, Address> database = new HashMap<String, Address>();
	
	public Address save(Address address) {
		database.put(address.getId(), address);
		return address;
	}

	public Address findAddress(String city, String street, String zipCode) {
		for (Entry<String, Address> entry : database.entrySet()) {
			Address address = entry.getValue();
			if(address.getCity().equals(city) && address.getStreet().equals(street) && address.getZipCode().equals(zipCode)) {
				return address;
			}
		}
		
		return null;
	}

}
