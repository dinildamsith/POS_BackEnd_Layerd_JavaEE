package lk.ijse.pos_back_end.bo.custom.impl;

import jakarta.servlet.http.HttpServletResponse;
import lk.ijse.pos_back_end.bo.custom.CustomerBO;
import lk.ijse.pos_back_end.dao.DAOFactory;
import lk.ijse.pos_back_end.dao.custom.CustomerDAO;
import lk.ijse.pos_back_end.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.pos_back_end.dto.CustomerDTO;

import java.sql.Connection;

public class CustomerBOImpl implements CustomerBO {

    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    @Override
    public String getAllCustomerData(Connection connection, HttpServletResponse resp) {
        String all = customerDAO.getAll(connection, resp);

        return all;
    }

    @Override
    public void saveCustomer(CustomerDTO customerDTO, Connection connection) {
        customerDAO.save(customerDTO,connection);
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO, Connection connection) {
        customerDAO.update(customerDTO,connection);
    }

    @Override
    public void deleteCustomer(CustomerDTO customerDTO, Connection connection) {
        customerDAO.delete(customerDTO,connection);
    }
}
