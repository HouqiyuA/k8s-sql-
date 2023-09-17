package com.example.ebpfweb.UserDao;

import com.example.ebpfweb.Bean.User;
import com.example.ebpfweb.DBUtil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public User find(String id){
        Connection connection= null;
        PreparedStatement statement= null;
        ResultSet resultSet=null;
        List<User> userList=new ArrayList<>();
        User user =new User();
        try {
            System.out.println(id);
//            String sql="select * from users where id = 1 union select 1,2,3;";
//            System.out.println(sql);
            connection = DBUtil.getConnection();
            String sql="SELECT * FROM users where id = "+id;

            statement = connection.prepareStatement(sql);
            resultSet=statement.executeQuery();
            while (resultSet.next()){
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                userList.add(user);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                DBUtil.closeAll(resultSet,statement,connection);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return user;
    }
    public User  login(String username,String password){
        Connection connection= null;
        PreparedStatement statement= null;
        ResultSet resultSet=null;
        User user = new User();
        try {
            connection = DBUtil.getConnection();
            String sql="SELECT * FROM users WHERE username='"+username+"'and password ='"+password+ "'";
            statement = connection.prepareStatement(sql);
            resultSet=statement.executeQuery();
            while (resultSet.next()){
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
            }

        } catch (ClassNotFoundException e) {
                e.printStackTrace();
                } catch (SQLException throwables) {
                throwables.printStackTrace();
                }finally {
                try {
                DBUtil.closeAll(resultSet,statement,connection);
                } catch (SQLException throwables) {
                throwables.printStackTrace();
                }
                }
                return user;
                }
                }
