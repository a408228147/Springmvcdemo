package com.poglite.service;

import com.poglite.idao.IUserRegister;
import com.poglite.iservice.I_Service_UserRegister;
import com.poglite.model.UserModel;

import javax.annotation.Resource;
import java.util.List;

public class Service_UserRegister implements I_Service_UserRegister {
@Resource
    private IUserRegister iUserRegister;

    @Override
    public void userregister(UserModel userModel) {
iUserRegister.userregister(userModel);
    }

    @Override
    public List<UserModel> selectuser() {
        return iUserRegister.selectuser();
    }
}
