package service;

import dao.ConnectionFactory;
import dao.UserDao;
import dao.UserDaoJdbcImpl;
import domain.User;

import java.util.List;

public class UserServiceImpl implements UserService {


    @Override
    public User getById(long id) {
        UserDao userDao = new UserDaoJdbcImpl(ConnectionFactory.getInstance());
        return userDao.getById(id);
    }

    @Override
    public List<User> getAll() {
        UserDao userDao = new UserDaoJdbcImpl(ConnectionFactory.getInstance());
        return userDao.getAll();
    }

    @Override
    public void insert(User user) {
        UserDao userDao = new UserDaoJdbcImpl(ConnectionFactory.getInstance());
        userDao.insert(user);
    }

    @Override
    public void update(User user) {
        UserDao userDao = new UserDaoJdbcImpl(ConnectionFactory.getInstance());
        userDao.update(user);
    }

    @Override
    public void deleteById(long id) {
        UserDao userDao = new UserDaoJdbcImpl(ConnectionFactory.getInstance());
        userDao.deleteById(id);
    }
}
