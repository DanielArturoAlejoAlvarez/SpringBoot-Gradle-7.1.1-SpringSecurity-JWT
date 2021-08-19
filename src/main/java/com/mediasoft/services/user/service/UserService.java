package com.mediasoft.services.user.service;

import com.mediasoft.services.user.domain.Role;
import com.mediasoft.services.user.domain.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public Role saveRole(Role role);
    public void addRoleToUser(String username, String roleName);
    public User getUser(String username);
    public List<User> getUsers();
}
