/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo3;

/**
 *
 * @author USER
 */
public class Mobil extends Kendaraan {
     // tambahan 2 atribut
    int jumlahPintu;
    String bahanBakar;

    // Constructor
    public Mobil(String platNomor, String merk, String warna,
            int tahun, double harga,
            int jumlahPintu, String bahanBakar) {

        super(platNomor, merk, warna, tahun, harga);

        this.jumlahPintu = jumlahPintu;
        this.bahanBakar = bahanBakar;
    }

    // tambahan method 1
    public void infoMobil() {
        System.out.println("Jumlah pintu : " + jumlahPintu);
        System.out.println("Bahan bakar  : " + bahanBakar);
    }

    // tambahan method 2
    public String jenisMobil() {
        return "Ini adalah class turunan Mobil";
    }
}
