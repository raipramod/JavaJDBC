package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.utl.DbUtl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

    public static final String SQL = "select * from user_tbl ";

    public static void main(String[] args) {
        try (
                Statement st = DbUtl.getConnection().createStatement();
        ){
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()){
                System.out.println("=================");
                //int columnLable;
                System.out.println("ID is:" + rs.getInt( "id"));
                System.out.println("User Name is:" + rs.getString( "user_name"));
                System.out.println("Password is:" + rs.getString( "password"));
                System.out.println("=================");
            }
            System.out.println("================================");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
