/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author ikhsan
 */
public class SepedaMotor {
    String nama;
    String merk;
    String jenis;
    String istimewa;
    double kecepatan;
    
    void cetakInfo () {
        System.out.println("Nama Sepeda Motor       :"+nama);
        System.out.println("Merk                    :"+merk);
        System.out.println("Jenis                   :"+jenis);
        System.out.println("Keistimewaan            :"+istimewa);
        System.out.println("Kecepatan Maksimum      :"+kecepatan+" KM/Jam");
        System.out.println(" ");
    }
}
