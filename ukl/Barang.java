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
public class Barang extends Lelang {
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Integer> id = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Barang() {
        addBarang(1, "Ideapad Gaming", 14500000);
        addBarang(2, "ASUS ROG Zephyrus G14", 17000000);
        addBarang(3, "Acer Predator Helios 300", 15500000);
        addBarang(4, "MSI GS66 Stealth", 21000000);
        addBarang(5, "Razer Blade 15", 16000000);
        addBarang(6, "Alienware m15 R4", 24500000);

    }

    public void addBarang(int id, String n, int h) {
        setid(id);
        setNama(n);
        setHarga(h);
        setStatus(true);
    }

    public void setsN(int i, String n)
    {
        this.namaBarang.set(i, n);
    }

    public String getNama(int i) {
        return this.namaBarang.get(i);
    }

    public int getid(int i) {
        return this.id.get(i);
    }

    public int getHarga(int i) {
        return this.hargaAwal.get(i);
    }

    public boolean getStatus(int i) {
        return this.status.get(i);
    }

    public void setNama(String i) {
        this.namaBarang.add(i);
    }

    public void setid(int i) {
        this.id.add(i);
    }

    public void setHarga(int i) {
        this.hargaAwal.add(i);
    }
    //Menambah kan Status baru
    public void setStatus(boolean i) {
        this.status.add(i);
    }

    public void PB(int i) {

        System.out.println("ID Barang : " + id.get(i));
        System.out.println("Nama Barang : " + namaBarang.get(i));
        System.out.println("Harga Awal Barang : " + hargaAwal.get(i));
        System.out.println("Status Barang : " + status.get(i));

    }
    // merubah/menimpa isi Array dengan boolean baru
    public void sets(int i,boolean Status){
        this.status.set(i, Status);
    }

    public void print() {
        System.out.println("\n");
        for (int i = 0; i < namaBarang.size(); i++) {
            System.out.println("=====================================");
            System.out.println("ID Barang : " + id.get(i));
            System.out.println("Nama Barang : " + namaBarang.get(i));
            System.out.println("Harga Awal Barang : " + hargaAwal.get(i));
            System.out.println("Status Barang : " + status.get(i));

        }
    }

}
