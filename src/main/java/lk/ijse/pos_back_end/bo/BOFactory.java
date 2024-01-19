package lk.ijse.pos_back_end.bo;

import lk.ijse.pos_back_end.bo.custom.impl.CustomerBOImpl;
import lk.ijse.pos_back_end.bo.custom.impl.ItemBOImpl;
import lk.ijse.pos_back_end.bo.custom.impl.OrderBoImpl;
import lk.ijse.pos_back_end.bo.custom.impl.UserBoImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){}

    public static BOFactory getBoFactory(){
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOTypes {
        CUSTOMER,ITEM,ORDER,USER
    }

    public Object getBO(BOTypes boType){
        switch (boType){
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case ORDER:
                return new OrderBoImpl();
            case USER:
                return new UserBoImpl();
            default:
                return null;
        }
    }
}
