/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo3;

/**
 *
 * @author USER
 */
public class Kendaraan {
    
     // 5 atribut
    String platNomor;
    String merk;
    String warna;
    int tahun;
    double harga;

    // Constructor 1
    public Kendaraan() {
        System.out.println("Constructor tanpa parameter");
    }

    // Constructor 2
    public Kendaraan(String merk) {
        this.merk = merk;
        System.out.println("Merk kendaraan : " + merk);
    }

    // Constructor 3
    public Kendaraan(String platNomor, String merk, String warna,
            int tahun, double harga) {

        this.platNomor = platNomor;
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
        this.harga = harga;
    }

    // Method void
    public void tampilData() {
        System.out.println("Plat Nomor : " + platNomor);
        System.out.println("Merk       : " + merk);
        System.out.println("Warna      : " + warna);
        System.out.println("Tahun      : " + tahun);
        System.out.println("Harga      : " + harga);
    }

    // Method return
    public String statusHarga() {
        if (harga > 200000000) {
            return "Kendaraan Mahal";
        } else {
            return "Kendaraan Standar";
        }
    }

    // CREATE
    public void create() {
        System.out.println("INSERT INTO kendaraan VALUES ('"
                + platNomor + "','" + merk + "','" + warna + "',"
                + tahun + "," + harga + ");");
    }

    // READ
    public void read() {
        System.out.println("SELECT * FROM kendaraan;");
    }

    // UPDATE
    public void update() {
        System.out.println("UPDATE kendaraan SET merk='"
                + merk + "' WHERE platNomor='" + platNomor + "';");
    }

    // DELETE
    public void delete() {
        System.out.println("DELETE FROM kendaraan WHERE platNomor='"
                + platNomor + "';");
    }

}
