package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> index();
    User show(int id);
    void update(User user);
    void delete(int id);
}
