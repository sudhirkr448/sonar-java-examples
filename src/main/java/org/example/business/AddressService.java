/**
 * 
 */
package org.example.business;

import org.example.model.Address;

/**
 * Dienste für die Verwaltung von {@link Address addressen}
 */
public interface AddressService {

	String createAddress(Address address);
	
	Address findAddress( String city, String street, String zipCode);
}
