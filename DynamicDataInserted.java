package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.nio.Buffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynamicDataInserted {
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
//
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter name");
            String name=br.readLine();
            System.out.println("enter city");
            String city=br.readLine();
//            set the values to query
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}