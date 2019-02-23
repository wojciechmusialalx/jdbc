package main;

import config.Database;
import dao.UserDao;
import domain.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Database db = new Database();
        UserDao userDao = new UserDao(db);

//        User user = new User(6, "Tome1111", "Kowalski", "kowalski@email.com");

//        userDao.update(user);
//        userDao.delete(6);

//        List<User> users = userDao.findAll();
        System.out.println(userDao.findById(1));
    }
}
