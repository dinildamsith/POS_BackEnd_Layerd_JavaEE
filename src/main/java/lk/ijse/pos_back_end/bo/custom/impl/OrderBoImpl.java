package lk.ijse.pos_back_end.bo.custom.impl;

import jakarta.servlet.http.HttpServletResponse;
import lk.ijse.pos_back_end.bo.custom.OrderBO;
import lk.ijse.pos_back_end.dao.DAOFactory;
import lk.ijse.pos_back_end.dao.custom.OrderDAO;
import lk.ijse.pos_back_end.dao.custom.impl.OrderDAOImpl;
import lk.ijse.pos_back_end.dto.OrderDTO;

import java.sql.Connection;

public class OrderBoImpl implements OrderBO {

    OrderDAO orderDAO = (OrderDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ORDER);
    @Override
    public String getAllOrders(Connection connection, HttpServletResponse resp) {
        String all = orderDAO.getAll(connection, resp);

        return all;
    }

    @Override
    public void placeOrder(OrderDTO orderDTO, Connection connection) {
        orderDAO.save(orderDTO, connection);
    }

    @Override
    public void deleteOrder(OrderDTO orderDTO, Connection connection) {
        orderDAO.delete(orderDTO, connection);
    }
}
