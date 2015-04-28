package services.impl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import domain.EventRoom;
import domain.User;
import services.EventRoomManagerLocal;

/**
 * Session Bean implementation class EventRoomManager
 */
@Stateless
@LocalBean
public class EventRoomManager implements EventRoomManagerLocal {

	@PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public EventRoomManager() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addEventRoom(EventRoom eventRoom) {
		Boolean b = false;
		try {
			entityManager.persist(eventRoom);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public EventRoom findEventRoomById(Integer id) {
		return entityManager.find(EventRoom.class, id);
	}

	@Override
	public Boolean deleteEventRoom(Integer id) {
		Boolean b = false;
		try {
			entityManager.remove(findEventRoomById(id));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean updateEventoom(EventRoom eventRoom) {
		Boolean b = false;
		try {
			entityManager.merge(eventRoom);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public List<EventRoom> findAllEventRooms() {
		List<EventRoom> eventRooms = null;
		try {
			String jpql = "select e from EventRoom e";
			Query query = entityManager.createQuery(jpql);
			eventRooms = query.getResultList();
		} catch (Exception e) {
		}
		return eventRooms;
	}

}
