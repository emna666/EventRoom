package services;

import java.util.List;

import javax.ejb.Local;

import domain.User;

@Local
public interface AccountManagerLocal {
	
	Boolean addUser(User user);

	User findUserById(Integer id);

	Boolean deleteUser(Integer id);

	Boolean updateUser(User user);

	List<User> findAllUsers();

	User login(String login, String password);

}
