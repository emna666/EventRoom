package services;

import java.util.List;

import javax.ejb.Local;

import domain.EventRoom;;

@Local
public interface EventRoomManagerLocal {

	Boolean addEventRoom(EventRoom eventRoom);

	EventRoom findEventRoomById(Integer id);

	Boolean deleteEventRoom(Integer id);

	Boolean updateEventoom(EventRoom eventRoom);

	List<EventRoom> findAllEventRooms();
}
