package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.utl.DbUtl;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    public static final String SQL = "insert into user_tbl(user_name, password)values('hari', 'bb@11')";

    public static void main(String[] args) {
        try (
                Statement st = DbUtl.getConnection().createStatement();
        ) {

            st.execute(SQL);
            System.out.println("data inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
