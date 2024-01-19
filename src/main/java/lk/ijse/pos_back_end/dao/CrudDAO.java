package lk.ijse.pos_back_end.dao;

import jakarta.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.util.ArrayList;

public interface CrudDAO<T> {
    String getAll(Connection connection, HttpServletResponse resp);
    void save(T dto , Connection connection);
    void update(T dto ,Connection connection);
    void delete(T dto , Connection connection);
}
