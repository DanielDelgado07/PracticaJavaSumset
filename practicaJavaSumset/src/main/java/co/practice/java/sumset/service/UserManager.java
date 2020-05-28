package co.practice.java.sumset.service;

import java.util.ArrayList;
import java.util.List;

import co.java.practice.sumset.model.UserDTO;

public class UserManager {
	private static List<co.java.practice.sumset.model.UserDTO> userList;

	public UserManager() {
		userList = new ArrayList<UserDTO>();
		userList.add(new UserDTO("1", "Daniel", "Delgado", 27, "daniel07", "12345"));
		userList.add(new UserDTO("2", "Ana", "Mendez", 27, "ana", "12345"));
		userList.add(new UserDTO("3", "Dave", "Lopez", 22, "Dalo", "1234"));
	}

	public List<UserDTO> getUserList() {
		return userList;
	}
}
