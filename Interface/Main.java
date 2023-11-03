/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Phone Redmi3Pro = new Xiaomi();
        
        Phoneuser Nanda = new Phoneuser(Redmi3Pro);
        
        Nanda.turnOnThePhone();
        
        Scanner input = new Scanner(System.in);
        String aksi;
        
        while(true){
            System.out.println("\t Aplikasi Interface");
            System.out.println(" 1. Nyalakan HP");
            System.out.println(" 2. Matikan HP");
            System.out.println(" 3. Perbesar Volume");
            System.out.println(" 4. Kecilkan Volume");
            System.out.println(" 0. Keluar");
            System.out.println("Pilih Aksi");
            aksi= input.nextLine();
            
            switch (aksi){
                case "1":
                    Nanda.turnOnThePhone();
                    break;
                case "2":
                    Nanda.turnOffThePhone();
                    break;
                case "3":
                    Nanda.makePhoneLouder();
                    break;
                case "4":
                    Nanda.makePhoneSilent();
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
