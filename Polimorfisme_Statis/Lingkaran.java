/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme_Statis;

/**
 *
 * @author LENOVO
 */
public class Lingkaran {
    float luas(float jarijari){
        return (float) (Math.PI * jarijari * jarijari);
    }

    double luas(double diameter){
        return (double) (Math.PI * diameter * 1/4);
    }
    public static void main(String[] args) {
        Lingkaran L = new Lingkaran();
        
        float jarijari = 10;
        double diameter = 100;
        
        System.out.println("Luas Lingkaran dengan jari-jari = " + L.luas(jarijari));
        System.out.println("Luas Lingkaran dengan diameter = " + L.luas(diameter));
    }
}
