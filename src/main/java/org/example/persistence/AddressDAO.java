/**
 * 
 */
package org.example.persistence;

import org.example.model.Address;

/**
 * Bietet Datenbankzugriff für die Verwaltung von Addressen.
 */
public interface AddressDAO {

	Address save(Address address);
	
	Address findAddress(String city, String street, String zipCode);
}
