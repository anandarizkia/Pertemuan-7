/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Polimorfis_Statis;

/**
 *
 * @author LENOVO
 */
public class PolimorfisStatis {
    //cara menginput penjumlahan kalkulator
    int pertambahan(int a, int b) {
        return a + b;
    }

    double pertambahan(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        PolimorfisStatis kalkulator = new PolimorfisStatis();

        System.out.println("Hasil Penjumlahan: " + kalkulator.pertambahan(5, 10));
        System.out.println("Hasil Penjumlahan (double): " + kalkulator.pertambahan(3.5, 2.5));
    }
}
