package user.xrkmed.sbBankApi.utils;

import java.io.Serializable;
import java.util.Objects;

import jakarta.annotation.Resource;

@Resource
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long zipCode;
	private String city;
	private String state;
	private String country;
	private String complement;
	
	public Address() {
		
	}
	
	public Address(String country, String state, String city, String complement, long zipCode) {
		this.country = country;
		this.state = state;
		this.zipCode = zipCode;
		this.city = city;
		this.complement = complement;
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

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return country + ", " + city + ", " + state + " - CEP: " + zipCode + ", " + complement;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && zipCode == other.zipCode;
	}
	
	
	
}
