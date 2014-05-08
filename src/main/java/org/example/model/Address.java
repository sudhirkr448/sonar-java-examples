/**
 * 
 */
package org.example.model;

import java.util.UUID;

/**
 * Beschreibt eine Addresse.
 */
public final class Address {
	private String id;
	private String city;
	private String street;
	private String zipCode;

	public Address(String city, String street, String zipCode) {
		super();
		this.city = city;
		this.street = street;
		this.zipCode = zipCode;
		this.id = UUID.randomUUID().toString();
	}

	public Address() {
		this(null, null, null);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getId() {
		return id;
	}

}
