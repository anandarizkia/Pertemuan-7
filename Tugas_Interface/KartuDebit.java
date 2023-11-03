/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Interface;

/**
 *
 * @author LENOVO
 */
public class KartuDebit implements MetodePembayaran {
    private String nomorKartuDebit;

    public KartuDebit(String nomorKartuDebit) {
        this.nomorKartuDebit = nomorKartuDebit;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran sebesar " + jumlah + " dengan kartu debit " + nomorKartuDebit + " berhasil diproses.");
    }
}
