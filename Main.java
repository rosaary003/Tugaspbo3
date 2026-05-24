/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo3;

/**
 *
 * @author USER
 */
public class Main {
   public static void main(String[] args) {

        // Object constructor 1
        Kendaraan k1 = new Kendaraan();

        System.out.println("================");

        // Object constructor 2
        Kendaraan k2 = new Kendaraan("Yamaha");

        System.out.println("================");

        // Object constructor 3
        Kendaraan k3 = new Kendaraan(
                "DA1234AA",
                "Honda",
                "Hitam",
                2022,
                250000000
        );

        // Menjalankan semua method
        k3.tampilData();

        System.out.println("================");

        System.out.println(k3.statusHarga());

        System.out.println("================");

        k3.create();

        System.out.println("================");

        k3.read();

        System.out.println("================");

        k3.update();

        System.out.println("================");

        k3.delete();

        System.out.println("================");

        // Inheritance
        Mobil m1 = new Mobil(
                "DA5678BB",
                "BYD",
                "Putih",
                2023,
                300000000,
                4,
                "Bensin"
        );

        m1.tampilData();

        System.out.println("================");

        m1.infoMobil();

        System.out.println("================");

        System.out.println(m1.jenisMobil());
    } 
}
