package domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class BookingId  implements Serializable{
	
	private Integer idUser;
	private Integer idEventRoom;
	private Date dateBooking;
	private static final long serialVersionUID = 1L;
	
	public BookingId() {
		super();
	}
	public BookingId(Integer idUser, Integer idEventRoom, Date dateBooking) {
		super();
		this.idUser = idUser;
		this.idEventRoom = idEventRoom;
		this.dateBooking = dateBooking;
	}

	public BookingId(Integer idUser, Integer idEventRoom) {
		super();
		this.idUser = idUser;
		this.idEventRoom = idEventRoom;
		this.dateBooking = new Date();
	}
	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public Integer getIdEventRoom() {
		return idEventRoom;
	}

	public void setIdEventRoom(Integer idEventRoom) {
		this.idEventRoom = idEventRoom;
	}

	public Date getDateBooking() {
		return dateBooking;
	}

	public void setDateBooking(Date dateBooking) {
		this.dateBooking = dateBooking;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
		result = prime * result
				+ ((idEventRoom == null) ? 0 : idEventRoom.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingId other = (BookingId) obj;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		if (idEventRoom == null) {
			if (other.idEventRoom != null)
				return false;
		} else if (!idEventRoom.equals(other.idEventRoom))
			return false;
		return true;
	}

}
