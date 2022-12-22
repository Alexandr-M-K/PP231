package web.service;

import web.dao.UserDao;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional(readOnly = true)
    public List<User> index() {
        return userDao.index();
    }

    @Transactional(readOnly = true)
    public User show(int id) {
        return userDao.show(id);
    }

    @Transactional
    public void update(User user) {
        userDao.update(user);
    }

    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}
