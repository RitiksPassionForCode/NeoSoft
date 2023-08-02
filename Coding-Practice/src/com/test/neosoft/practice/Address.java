package com.test.neosoft.practice;

//Make the class Final so that it cannot be extended.
public final class Address implements Cloneable{

	    private String street;
	    private String city;

	    public Address(String street, String city) {
	        this.street = street;
	        this.city = city;
	    }

	    public String getStreet() {
	        return street;
	    }
	    
	    public void setStreet(String street) {
	        this.street = street;
	    }

	    public String getCity() {
	        return city;
	    }
	    
	    public void setCity(String city) {
	        this.city = city;
	    }
	    
	    //In a situation like this, we have to implement clone inside custom object: Address.
	    //Then Java will make sure that it is always giving a clone of the already declared object of address.
	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

	    @Override
	    public String toString() {
	        return "{Street: " + street + ", City: " + city + "}";
	    }

	}
