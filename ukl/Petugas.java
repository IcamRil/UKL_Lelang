/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ukl;

import java.util.ArrayList;

/**
 *
 * @author MOKLET
 */
public class Petugas implements Admin{

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<Integer> id = new ArrayList<Integer>();
    private ArrayList<Integer> telepon = new ArrayList<Integer>();

    public Petugas() {

        addP(0, "Ubay", 83823, "Tokyo");
    }
    
    public void addP(int id, String n, int h, String a) {
        setId(id);
        setNama(n);
        setTelepon(h);
        setAlamat(a);
    }

    @Override
    public void setNama(String nama) {
        namaPetugas.add(nama);
    }
    
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    
    @Override
    public void setTelepon(int telepon) {
        this.telepon.add(telepon);
    }
    
    public void setId(int i)
    {
        this.id.add(i);
    }
    @Override
    public String getNama(int id) {
        return namaPetugas.get(id);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return alamat.get(idPetugas);
    }

    @Override
    public Integer getTelepon(int idPetugas) {
        return telepon.get(idPetugas);
    }
    
    public void print() {
        System.out.println("\n");
        for (int i = 0; i < namaPetugas.size(); i++) {
            System.out.println("=====================================");
            System.out.println("ID Petugas : " + id.get(i));
            System.out.println("Nama Petugas : " + namaPetugas.get(i));
            System.out.println("No. Telepon Petugas : " + telepon.get(i));
            System.out.println("Alamat Petugas : " + alamat.get(i));

        }
    }

    // public void PilP(int i) {

    //     System.out.println("ID Petugas : " + id.get(i));
    //     System.out.println("Nama Petugas : " + namaPetugas.get(i));
    //     System.out.println("No. Telepon Petugas : " + telepon.get(i));
    //     System.out.println("Alamat Petugas : " + alamat.get(i));
    // }

}
