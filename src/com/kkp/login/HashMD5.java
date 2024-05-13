/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kkp.login;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author user
 */
public class HashMD5 {
    // Fungsi untuk mengubah string menjadi format hash MD5
    public static String hash(String input) {
        try {
            // Buat objek MessageDigest dengan algoritma MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Update MessageDigest dengan input string
            md.update(input.getBytes());

            // Menghasilkan hash dari input
            byte[] byteData = md.digest();

            // Ubah byteData menjadi format hex
            StringBuilder sb = new StringBuilder();
            for (byte b : byteData) {
                sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
