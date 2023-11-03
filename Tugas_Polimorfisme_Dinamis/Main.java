/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Polimorfisme_Dinamis;

/**
 *
 * @author LENOVO
 */
public class Main {
        public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Singa singa = new Singa("Mamalia","Savana dan Padang Rumput");
        Elang elang = new Elang("Unggas","Gunung dan Langit");
        Ular ular = new Ular("reptil","Gunung, Persawahan, Gurun, dan,Perkebunan");
        
        singa.jenis();
        singa.habitat();
        elang.jenis();
        elang.habitat();
        ular.jenis();
        ular.habitat();
    }
}
