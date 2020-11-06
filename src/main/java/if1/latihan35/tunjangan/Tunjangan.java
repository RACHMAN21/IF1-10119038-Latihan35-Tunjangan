/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan35.tunjangan;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi class tunjangan
 * 
 */

public class Tunjangan {
    private double gajiPokok, gajiTotal;
    private String status;
    
    private double cekStatus() {
        return status.equals("MENIKAH")? gajiPokok * 0.35 : 0;
    }
    
    public void hitungTunjangan(double gajiAwal, String statusNikah) {
        gajiPokok = gajiAwal;
        status = statusNikah;
        double hasil = cekStatus();
        gajiTotal = gajiPokok + hasil;
        tampil(hasil);
    }
    
    private void tampil(double hasil) {
        System.out.println("====Hasil Perhitungan Gaji Anda====");
        System.out.println("Gaji Pokok : "+gajiPokok);
        System.out.println("Tunjangan  : "+hasil);
        System.out.println("Gaji Total : "+gajiTotal);
    }
}