package com.poglite.iservice;

import com.poglite.model.UserModel;

import java.util.List;

public interface I_Service_UserRegister {
    public void userregister(UserModel UM);
    public List<UserModel> selectuser();
}
