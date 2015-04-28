package domain;

import domain.User;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity

public class Customer extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Customer() {
		super();
	}
   
}
