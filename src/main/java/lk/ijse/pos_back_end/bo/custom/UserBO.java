package lk.ijse.pos_back_end.bo.custom;

import jakarta.servlet.http.HttpServletResponse;

import java.sql.Connection;

public interface UserBO {
    String getAllUserData(Connection connection , HttpServletResponse resp);
}
