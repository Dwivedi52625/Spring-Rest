package com.zipcode.details;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="zip")
public class Zipcode {
    @Id
	private Integer zipcode;
	private String city;
	private String state;
	private String country;
	public Zipcode(Integer zipcode, String city, String state, String country) {
		super();
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Zipcode [zipcode=" + zipcode + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
}
