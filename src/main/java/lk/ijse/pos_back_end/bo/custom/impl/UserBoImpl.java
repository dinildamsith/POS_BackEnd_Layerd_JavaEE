package lk.ijse.pos_back_end.bo.custom.impl;

import jakarta.servlet.http.HttpServletResponse;
import lk.ijse.pos_back_end.bo.custom.UserBO;
import lk.ijse.pos_back_end.dao.custom.impl.UserDAOImpl;

import java.sql.Connection;

public class UserBoImpl implements UserBO {
    UserDAOImpl userDAO = new UserDAOImpl();
    @Override
    public String getAllUserData(Connection connection, HttpServletResponse resp) {
        String all = userDAO.getAll(connection, resp);
        return all;
    }
}
