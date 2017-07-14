package com.poglite.dao;

import com.poglite.idao.IUserRegister;
import com.poglite.model.UserModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
//实现类的注解
@Repository
public class UserRegister implements IUserRegister {
    @Resource
    JdbcTemplate jdbc;
    @Override
public  void userregister(UserModel um){
String sql = "insert into userlogin values(ul_id.nextval,?,?)";
Object[] object = {um.getUsername(),um.getPassword()};
 jdbc.update(sql,object);

}

public List<UserModel> selectuser(){
    String sql = "select * from userlogin  ";
    List<UserModel> list = jdbc.query(sql,new selall());
    return list;
}
class selall implements RowMapper{
    @Override
    public Object mapRow(ResultSet resultSet,int arg1) throws SQLException
    {
      UserModel userModel = new UserModel();
      userModel.setUsername(resultSet.getString("user_name"));
      userModel.setPassword(resultSet.getString("password"));
    return userModel;
    }
}

}
