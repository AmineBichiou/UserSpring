package com.amine.users.restControllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amine.users.entities.Role;
import com.amine.users.entities.User;
import com.amine.users.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserRestControllers {
	@Autowired
	UserService userService;
	@RequestMapping(path = "all", method = RequestMethod.GET)
	public List<User> getAllUsers() {
	return userService.findAllUsers();
	}
	@RequestMapping(path = "allRole", method = RequestMethod.GET)
	public List<Role> getAllRoles() {
	return userService.findAllRoles();
	}
	@RequestMapping(path = "/adduser", method = RequestMethod.POST)
	public User createuser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	@RequestMapping(path = "/addrole", method = RequestMethod.POST)
	public Role createrole(@RequestBody Role role) {
		return userService.addRole(role);
	}
	@RequestMapping(path = "/updateuser", method = RequestMethod.PUT)
	public User modifieruser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	@RequestMapping(path = "/updaterole", method = RequestMethod.PUT)
	public Role modifierrole(@RequestBody Role role) {
		return userService.updateRole(role);
	}
	@RequestMapping(path = "/getbyid/{id}", method = RequestMethod.GET)
	public User getUserById(@PathVariable("id") Long id) {
		return userService.getUserbyId(id);
	}
	@RequestMapping(path = "/getrolebyid/{id}", method = RequestMethod.GET)
	public Role getRoleById(@PathVariable("id") Long id) {
		return userService.getRolebyId(id);
	}
	@RequestMapping(path = "/deluser/{id}", method = RequestMethod.DELETE)
	public void supprimeruser(@PathVariable("id") Long id) {
		userService.deleteUserbyId(id);
	}
	@RequestMapping(path = "/delrole/{id}", method = RequestMethod.DELETE)
	public void supprimerrole(@PathVariable("id") Long id) {
		userService.deleteRolebyId(id);
	}
}