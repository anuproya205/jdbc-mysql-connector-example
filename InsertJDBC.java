package com.example;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//    creating a connection
            String url="jdbc:mysql://localhost:3306/employee";
            String username="root";
            String password="Mysql_password@123";
            Connection con= DriverManager.getConnection(url, username, password);
            //create query
            String q = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
//            create a statement:
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created in database...");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

