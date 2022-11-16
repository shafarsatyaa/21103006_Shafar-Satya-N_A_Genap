/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanyject.quis1_a_genap;

/**
 *
 * @author lenovo
 */
public class Nelayan_21103006 extends Penduduk_21103006{
    int jmlBeratIkan;
    int jmlSolar;
    double totalPendapatNelayan;
    String nik;
    String nama;
    int umur;
    String alamat;

    public double totalPendapatNelayan() {
        return totalPendapatNelayan = (jmlBeratIkan * 8.000) + (jmlSolar + 10.000);
    }
    
    public void DataNelayan(){
        System.out.println("Jumlah Berat Ikan : " + jmlBeratIkan);
        System.out.println("Jumlah Pakai Solar : " + jmlSolar);
    }

    void tampilDataPenduduk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


