package lk.ijse.pos_back_end.bo.custom;

import jakarta.servlet.http.HttpServletResponse;
import lk.ijse.pos_back_end.dto.OrderDTO;

import java.sql.Connection;

public interface OrderBO {
    String getAllOrders(Connection connection, HttpServletResponse resp);
    void placeOrder(OrderDTO orderDTO,Connection connection);
    void  deleteOrder(OrderDTO orderDTO,Connection connection);
}
