package web.dao;

import web.model.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private  EntityManager entityManager;

    public void save(User user) {
        entityManager.persist(user);
    }

    public List<User> index() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    public User show(int id) {
        return entityManager.find(User.class, id);
    }

    public void update(User user) {
        entityManager.merge(user);
    }

    public void delete(int id) {
        entityManager.remove(show(id));
    }
}