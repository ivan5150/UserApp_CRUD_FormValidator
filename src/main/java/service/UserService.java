package service;

import domain.User;

import java.util.List;

public interface UserService {
    User getById(long id);

    List<User> getAll();

    void insert(User user);

    void update(User user);

    void deleteById(long id);
}
