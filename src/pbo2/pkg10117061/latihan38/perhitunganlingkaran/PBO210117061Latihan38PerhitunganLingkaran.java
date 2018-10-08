/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 * Nama     : Fachrian harits Pratama
 * NIM      : 10117061
 * Kelas    : IF-2
 * Deskripsi program: Menampilkan perhitungan lingkaran 
 *                    berdasarkan objek orientasi
 * 
 */
public class PBO210117061Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);
        Lingkaran dua = new Lingkaran();
        
        System.out.println("====Perhitungan Lingkaran===");
        do {
            System.out.print("\nMasukkan Nilai diameter lingkaran\t:");
            dua.nilaiMasukan = masuk.next();
        } while (!dua.nilaiMasukan.matches("[0-9]*"));
    
        System.out.println("\n=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = " + dua.satu() );
        System.out.println("Luas Lingkaran = " + dua.luasLingkaran() );
        System.out.println("Keliling Lingkaran = "  +dua.kelilingLingkaran() );
    
    }
}
