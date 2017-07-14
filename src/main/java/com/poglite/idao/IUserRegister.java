package com.poglite.idao;

import com.poglite.model.UserModel;

import java.util.List;
import java.util.ListResourceBundle;

/**
 * Created by Administrator on 2017/7/11.
 */
public interface IUserRegister {
public void userregister(UserModel um);
public List<UserModel> selectuser();
}
