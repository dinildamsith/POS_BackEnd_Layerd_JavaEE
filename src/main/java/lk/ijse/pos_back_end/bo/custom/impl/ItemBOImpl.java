package lk.ijse.pos_back_end.bo.custom.impl;

import jakarta.servlet.http.HttpServletResponse;
import lk.ijse.pos_back_end.bo.custom.ItemBo;
import lk.ijse.pos_back_end.dao.DAOFactory;
import lk.ijse.pos_back_end.dao.custom.ItemDAO;
import lk.ijse.pos_back_end.dao.custom.impl.ItemDAOImpl;
import lk.ijse.pos_back_end.dto.CustomerDTO;
import lk.ijse.pos_back_end.dto.ItemDTO;

import java.sql.Connection;

public class ItemBOImpl implements ItemBo {

    ItemDAO itemDAO = (ItemDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ITEM);

    @Override
    public String getAllItemData(Connection connection, HttpServletResponse resp) {
        String all = itemDAO.getAll(connection, resp);

        return all;
    }

    @Override
    public void saveItem(ItemDTO itemDTO, Connection connection) {
        itemDAO.save(itemDTO,connection);
    }

    @Override
    public void updateItem(ItemDTO itemDTO, Connection connection) {
        itemDAO.update(itemDTO, connection);
    }

    @Override
    public void deleteItem(ItemDTO itemDTO, Connection connection) {
        itemDAO.delete(itemDTO, connection);
    }
}
