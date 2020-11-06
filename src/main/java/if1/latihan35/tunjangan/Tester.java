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
 * Deskripsi Program : program ini berisi menentukan tunjangan seorang pegawai
 * 
 */

import java.util.Scanner; // import kelas scanner

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gajiPokok;
        String status;
        Tunjangan tunjangan = new Tunjangan();
        System.out.println("Berapa gaji anda perbulan? Rp.");
        gajiPokok = sc.nextDouble();
        System.out.println("Status anda? (Menikah/Belum) : ");
        status = sc.next().toUpperCase();
        tunjangan.hitungTunjangan(gajiPokok, status);
        System.out.println("Developed By : Rachman Aldiansyah");
    }
}
