package domain;

import domain.User;
import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Manager
 *
 */
@Entity

public class Manager extends User implements Serializable {

	
	private Integer telephone;
	private String licence;
	private static final long serialVersionUID = 1L;

	public Manager() {
		super();
	}   
	public Integer getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}   
	public String getLicence() {
		return this.licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}
   
}
