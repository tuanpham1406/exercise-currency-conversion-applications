package dao;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("John");
        u1.setAccount("john");
        u1.setEmail("john@codegym.vn");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u1.setAge(14);
        u1.setName("Duy");
        u1.setAccount("duy");
        u1.setEmail("duy@codegym.vn");
        u1.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u1.setAge(19);
        u1.setName("Duc");
        u1.setAccount("duc");
        u1.setEmail("duc@codegym.vn");
        u1.setPassword("123456");
        users.add(u3);
    }

    public static User checkLogin(Login login){
        for (User u: users) {
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
