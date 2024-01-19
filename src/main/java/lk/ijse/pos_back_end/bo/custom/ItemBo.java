package lk.ijse.pos_back_end.bo.custom;

import jakarta.servlet.http.HttpServletResponse;
import lk.ijse.pos_back_end.dto.CustomerDTO;
import lk.ijse.pos_back_end.dto.ItemDTO;

import java.sql.Connection;

public interface ItemBo {
    String getAllItemData(Connection connection , HttpServletResponse resp);
    void saveItem(ItemDTO itemDTO , Connection connection);
    void updateItem(ItemDTO itemDTO , Connection connection);
    void deleteItem(ItemDTO itemDTO , Connection connection);
}
