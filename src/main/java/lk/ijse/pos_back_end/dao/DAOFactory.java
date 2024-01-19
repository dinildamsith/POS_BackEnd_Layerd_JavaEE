package lk.ijse.pos_back_end.dao;

import lk.ijse.pos_back_end.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.pos_back_end.dao.custom.impl.ItemDAOImpl;
import lk.ijse.pos_back_end.dao.custom.impl.OrderDAOImpl;
import lk.ijse.pos_back_end.dao.custom.impl.UserDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory(){}

    public static DAOFactory getDaoFactory(){
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DAOTypes {
        CUSTOMER,ITEM,ORDER,USER
    }

    public Object getDAO(DAOTypes daoType){
        switch (daoType){
            case CUSTOMER:
                return new CustomerDAOImpl();
            case ITEM:
                return new ItemDAOImpl();
            case ORDER:
                return new OrderDAOImpl();
            case USER:
                return new UserDAOImpl();
            default:
                return null;
        }
    }
}
