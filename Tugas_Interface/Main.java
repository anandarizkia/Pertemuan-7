/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Interface;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        MetodePembayaran kredit = new KartuKredit("0123-4567-89");
        MetodePembayaran debit = new KartuDebit("123-456-789");
        
        Scanner input = new Scanner(System.in);
        String tombol;
        
        while(true){
            System.out.println("\n\t Pilihan Pembayaran");
            System.out.println(" 1. Kartu Debit");
            System.out.println(" 2. Kartu Ktedit");
            System.out.println(" 0. Keluar");
            System.out.println("\n Pilihan Anda :");
            tombol= input.nextLine();
            
            switch (tombol){
                case "1":
                    debit.prosesPembayaran(100000);
                    break;
                case "2":
                    kredit.prosesPembayaran(100000);
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Angka yang Anda tekan salah");
                    break;
            }
        }
    }
}