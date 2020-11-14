/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan41.massajenis;
import data.Kubus;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENGHITUNG MASSA JENIS KUBUS
 */

public class PBOIF210119047Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kubus kubus = new Kubus();
        
        System.out.println("=====Massa Jenis Kubus=====");
        kubus.setSisi(5); // input nilai sisi
        System.out.println("Sisi  : " + kubus.getSisi());
        kubus.setMassa(250); //input nilai massa
        System.out.println("Massa : " + kubus.getMassa());


        System.out.println("\n=====Hasil Perhitungan=====");
        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(kubus.getMassa(), kubus.hitungVolume(kubus.getSisi())));
    }
}
    
