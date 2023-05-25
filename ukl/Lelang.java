/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ukl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javafx.scene.control.Menu;

/**
 *
 * @author MOKLET
 */
public class Lelang {

    static private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    static private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    static private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();

    static Barang brg = new Barang();
    static Masyarakat msy = new Masyarakat();
    static Petugas ptg = new Petugas();

    static boolean umain = true;

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            Menu();
        } while (umain);

    }

    public static void Menu() {

        System.out.println("\n==============  MENU  ==============");
        System.out.println("1. Identitas Petugas");
        System.out.println("2. List pengikut Lelang");
        System.out.println("3. List Barang");
        System.out.println("4. Ikuti Lelang");
        System.out.println("0. Keluar");
        System.out.print("Pilih Menu : ");
        int menu = s.nextInt();

        switch (menu) {
            case 1:
                ptg.print();
                break;
            case 2:
                msy.print();
                break;
            case 3:
                brg.print();
                break;
            case 4:
                lelang();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid!");
                break;

        }
    }

    public static void lelang() {
        System.out.println("\nPilih ID Barang yang ingin di lelang!");
        brg.print();
        System.out.println("\nInput : ");
        int choice = s.nextInt() - 1;
        if (choice >= 6) {
            System.out.println("Invalid coba ulangi!");
            lelang();
        } else if (choice <= 7) {
            if (brg.getStatus(choice) == false) {
                System.out.println("Barang tidak bisa di beli!");
                lelang();
            } else {
                // Menambah harga awal ke Array hargaAwal
                hargaTawar.add(brg.getHarga(choice));
                System.out.println("\nNama Barang : " + brg.getNama(choice) + "\nHarga awal : " + brg.getHarga(choice));
                System.out.println("\n================\nMemulai Proses Pelelangan\n================");
                lelang1(choice);
            }
        }

    }

    public static void lelang1(int choice) {
        System.out.println("Pilih ID : \n");
        int chid = s.nextInt() - 1;
        if (chid >= 5) {
            System.out.println("Invalid silahkan ulangi!");
            lelang1(choice);
        } else if (chid <= 5) {
            System.out.println(
                    "\nName : " + msy.getNama(chid) + "\nMin Penawaran   : " + hargaTawar.get(0)
                            + "\nSilahkan Menawar : ");
            int tawar = s.nextInt();

            if (tawar < hargaTawar.get(0)) {
                System.out.println("Maaf Penawaran tidak mencukupi Minimal Harga!");

                lelang1(choice);

            } else {
                hargaTawar.set(0, tawar);
                idPenawar.add(chid);
                System.out.println("Apakah ada yang ingin menaikan harga? y/n");
                String option = s.next();
                if (option.equals("y")) {
                    lelang1(choice);
                } else {
                    finish(choice, tawar);
                }
            }
        }

    }

    public static void finish(int choice, int tawat) {
        brg.setsN(choice, Integer.toString(tawat));
        brg.sets(choice, false);
        int pemenang = 0;
        for (int i = 0; i < idPenawar.size(); i++) {
            pemenang = idPenawar.get(i);
        }
        System.out.println("Petugas lelang : "+ ptg.getNama(0) +"\nPemenang lelang     : " + msy.getNama(pemenang) + "\nTerjual di harga   : " + tawat
                + "\nStatus barang  :" + brg.getStatus(choice));

        idPenawar.clear();
        hargaTawar.clear();
    }
}
