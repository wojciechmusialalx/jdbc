package main;

import config.Database;
import dao.UserDao;
import domain.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Database db = new Database();
        UserDao userDao = new UserDao(db);

        User user = new User("Tomek", "Kowalski", "kowalski@email.com");

        userDao.save(user);
    }
}
