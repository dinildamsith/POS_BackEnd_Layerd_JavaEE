package lk.ijse.pos_back_end.bo.custom;

import jakarta.servlet.http.HttpServletResponse;
import lk.ijse.pos_back_end.dto.CustomerDTO;

import java.sql.Connection;

public interface CustomerBO {
    String getAllCustomerData(Connection connection , HttpServletResponse resp);
    void saveCustomer(CustomerDTO customerDTO , Connection connection);
    void updateCustomer(CustomerDTO customerDTO , Connection connection);
    void deleteCustomer(CustomerDTO customerDTO , Connection connection);
}
