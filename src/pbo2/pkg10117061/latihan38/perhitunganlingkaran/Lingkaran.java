/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan38.perhitunganlingkaran;

/**
 * Nama     : Fachrian harits Pratama
 * NIM      : 10117061
 * Kelas    : IF-2
 * Deskripsi program: Menampilkan perhitungan lingkaran 
 *                    berdasarkan objek orientasi
 * 
 */
public class Lingkaran {

    public String nilaiMasukan;
    public double nilai;
    public double jariJari;

    double satu() {

        nilai = Double.parseDouble(nilaiMasukan);

        jariJari = nilai / 2;
        return jariJari;
    }

    double luasLingkaran() {

        nilai = Math.PI * jariJari * jariJari;

        return nilai;
    }

    double kelilingLingkaran() {

        nilai = 2 * Math.PI * jariJari;

        return nilai;
    }

}
