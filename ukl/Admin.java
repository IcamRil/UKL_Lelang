/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ukl;

/**
 *
 * @author MOKLET
 */
public interface Admin {
    
    public void setNama(String nama);

    public void setAlamat(String alamat);

    public void setTelepon(int telepon);

    public String getNama(int id);

    public String getAlamat(int id);

    public Integer getTelepon(int id);
}
