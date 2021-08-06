package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.utl.DbUtl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbCreateDemo {

    public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "Admin2021$";
    public static final String SQL = "create database jdbc_demo_db";

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        try {
            //1. REGISTER driver
            Class.forName(DRIVER_NAME);
            //2. Obtain connector object
            con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            //3 OBTAIN STATEMENT OBJ
            st = con.createStatement();
            // 4. execute query
            st.execute(SQL);
            System.out.println("db created");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                //5. close connection
                con.close();
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public static class DeleteDemo {
        public static final String SQL = "delete from user_tbl where id = 3";

        public static void main(String[] args) {
            try (
                    Statement st = DbUtl.getConnection().createStatement();
            ){
                st.execute(SQL);
                System.out.println("data deleted");
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static class InsertDemo {

        public static final String SQL = "insert into user_tbl(user_name, password)values('Gita', ' cd@433')";

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
}
