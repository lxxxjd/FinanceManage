package com.company.project.service;
import com.company.project.model.BuyProduct;
import com.company.project.model.UserHold;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/10/26.
 */
public interface UserHoldService extends Service<UserHold> {
<<<<<<< HEAD
    public List<UserHold> findByUid(String uid);
=======

    public UserHold findByUidAndFpid(String uid,String fpid);
    public boolean saveOrder(BuyProduct buyProduct,String type);
    public UserHold addHold(BuyProduct buyProduct);

    public UserHold saleHold(BuyProduct buyProduct);

>>>>>>> 7ed15ec682f522e1aa0324d24d4df33780da5e80
}
