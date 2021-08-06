package com.vastika.jdbcdemo.basic.ps;

import com.vastika.jdbcdemo.basic.utl.DbUtl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {
    public static final String SQL = "delete from user_tbl where id = ?";

    public static void main(String[] args) {
        try (
                PreparedStatement ps = DbUtl.getConnection().prepareStatement(SQL);
        ) {
            ps.setInt(1, 14);
            ps.executeUpdate();
            System.out.println("data deleted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
