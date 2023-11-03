/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Interface;

/**
 *
 * @author LENOVO
 */
public class KartuKredit implements MetodePembayaran {
    private String nomorKartuKredit;

    public KartuKredit(String nomorKartuKredit) {
        this.nomorKartuKredit = nomorKartuKredit;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran sebesar " + jumlah + " dengan kartu kredit " + nomorKartuKredit + " berhasil diproses.");
    }
}
