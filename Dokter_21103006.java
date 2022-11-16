/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanyject.quis1_a_genap;

/**
 *
 * @author lenovo
 */
public class Dokter_21103006 extends Penduduk_21103006 {
     int jmlPasien;
    int jmlObat;
    double totalPendapatanDokter;
    String nik;
    String nama;
    int umur;
    String alamat;
    
    public void DataDokter(){
        System.out.println("Jumlah Pasien : " + jmlPasien);
        System.out.println("Jumlah Obat : " + jmlObat);
    }
    
    public double totalPendapatanDokter (){
        return totalPendapatanDokter = (jmlPasien * 50.000) + (jmlObat * 10.000);
    }

    void tampilDataPenduduk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


