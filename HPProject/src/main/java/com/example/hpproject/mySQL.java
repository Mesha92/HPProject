package com.example.hpproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mySQL {
    public static void main(String[] args)
            throws SQLException, ClassNotFoundException {

        //Create driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Successful");
        //Connection established
        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/power system", "root", "Jamesha@1");
        System.out.println("Connected!");

        //Create statement
        Statement statement = connection.createStatement();

        connection.close();
    }
}


