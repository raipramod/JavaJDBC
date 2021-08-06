package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.utl.DbUtl;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {

    public static final String SQL = "delete from user_tbl where id = 3 ";

    public static void main(String[] args) {
        try (
                Statement st = DbUtl.getConnection().createStatement();
        ) {

            st.execute(SQL);
            System.out.println("data deleted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
