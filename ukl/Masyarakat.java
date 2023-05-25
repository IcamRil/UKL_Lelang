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
public class Masyarakat implements Admin{

    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> Alamat = new ArrayList<String>();
    private ArrayList<Integer> Telepon = new ArrayList<Integer>();

    public Masyarakat() {
        addMasyarakat("Afham", "Malang", 83921);
        addMasyarakat("Iqbal big boy", "Malang", 834521);
        addMasyarakat("Kayla", "Malang", 839463);
        addMasyarakat("Radit", "Malang", 8432661);
        addMasyarakat("Doni", "Malang", 8393221);
    }

    public void addMasyarakat(String n, String a, int t)
    {
        setNama(n);
        setAlamat(a);
        setTelepon(t);
    }
    @Override
    public void setNama(String Nama) {
        this.namaMasyarakat.add(Nama);
    }

    @Override
    public void setAlamat(String Alamat) {
        this.Alamat.add(Alamat);
    }

    @Override
    public void setTelepon(int Telepon) {
        this.Telepon.add(Telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaMasyarakat.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.Alamat.get(id);
    }

    @Override
    public Integer getTelepon(int id) {
        return this.Telepon.get(id);
    }
    
    public void print(){
        System.out.println("\n");
        int n = namaMasyarakat.size();
        for(int i = 0; i < n; i++){
            System.out.println("========================");
            System.out.println("Nama\t : " + getNama(i));
            System.out.println("Alamat\t : " +getAlamat(i));
            System.out.println("Telepon\t : " +getTelepon(i));
        }
    }
}
