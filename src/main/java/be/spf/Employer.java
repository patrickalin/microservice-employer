package be.spf;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String registrationnumber;
	private String name;

	public String getRegistrationNumber() {
		return registrationnumber;
	}

	public void setRegistrationNumber(String rn) {
		this.registrationnumber = rn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
