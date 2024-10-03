package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDataIntoTable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//    creating a connection
            String url = "jdbc:mysql://localhost:3306/employee";
            String username = "root";
            String password = "Mysql_password@123";
            Connection con = DriverManager.getConnection(url, username, password);
//            create a query
            String q="insert into table1(tName,tCity) values(?,?)";
//            get the preparedStatement object
            PreparedStatement pstmt=con.prepareStatement(q);
//            set the values to query
//            pstmt.setInt(1,101);
            pstmt.setString(1,"john");
            pstmt.setString(2,"up");
            pstmt.executeUpdate();
            System.out.println("data inserted into table successfully...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
