package web.Dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    User getUserById(int id);
    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUsers(int id);

    void updateUser(User user);


}
