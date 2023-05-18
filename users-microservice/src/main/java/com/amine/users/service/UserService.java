package com.amine.users.service;

import java.util.List;

import com.amine.users.entities.Role;
import com.amine.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User updateUser(User user);
	void deleteUserbyId(Long id);
	User findUserByUsername (String username);
	Role addRole(Role role);
	Role updateRole(Role role);
	void deleteRolebyId(Long id);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
	List<Role> findAllRoles();
	User getUserbyId(Long id);
	Role getRolebyId(Long id);
}