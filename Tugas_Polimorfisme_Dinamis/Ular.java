/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Polimorfisme_Dinamis;

/**
 *
 * @author LENOVO
 */
public class Ular extends Hewan{
    String jenis;
    String habitat;
    
    public Ular (String jenis, String habitat){
        this.jenis = jenis;
        this.habitat = habitat;
    }
    
    @Override
    void jenis(){
        System.out.println("Jenis Ular : " + jenis);
    }
    @Override
    void habitat(){
        System.out.println("Habitat Ular : " + habitat);
    }
}

