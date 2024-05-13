package com.kkp.koneksi;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil konek");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Gagal koneksi"+ex);
        }
        String url = "jdbc:mysql://localhost/db_rainbowkids";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil koneksi database");
        }
        catch (SQLException ex){
            System.out.println("Gagal Koneksi database"+ex);
        }
        return koneksi;
    }
}
