package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.utl.DbUtl;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static final String SQL = "update user_tbl set user_name = 'Krishna', password = 'tt@123' where id = 3";

    public static void main(String[] args) {
        try (
                Statement st = DbUtl.getConnection().createStatement();
        ){
            st.execute(SQL);
            System.out.println("data updated");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
