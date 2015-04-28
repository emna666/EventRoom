package domain;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Booking
 *
 */
@Entity

public class Booking implements Serializable {

	
	private BookingId bookingId;
	private User user;
	private EventRoom eventRoom;
	
	private static final long serialVersionUID = 1L;

	public Booking() {
		super();
	}

	@EmbeddedId
	public BookingId getBookingId() {
		return bookingId;
	}

	public void setBookingId(BookingId bookingId) {
		this.bookingId = bookingId;
	}

	@ManyToOne
	@JoinColumn(name = "idUser", referencedColumnName = "id", insertable = false, updatable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name = "idEventRoom", referencedColumnName = "id", insertable = false, updatable = false)
	public EventRoom getEventRoom() {
		return eventRoom;
	}

	public void setEventRoom(EventRoom eventRoom) {
		this.eventRoom = eventRoom;
	}
   
}
