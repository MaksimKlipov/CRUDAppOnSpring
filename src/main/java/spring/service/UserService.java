package spring.service;

import spring.model.User;

import java.util.List;

public interface UserService {
    public User getUser(Long id);
    public void saveUser(User user);
    public List<User> getAllUsers();
    public void updateUser(Long id, User user);
    public void deleteUser(Long id);
}
