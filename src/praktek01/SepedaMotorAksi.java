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
public class SepedaMotorAksi {
    public static void main(String[] args) {
        
        SepedaMotor spin = new SepedaMotor();
        spin.nama="Spin";
        spin.merk="Suzuki";
        spin.jenis="Motor Matic";
        spin.istimewa="Motor Matic tercepat";
        spin.kecepatan=85.5;
        spin.cetakInfo();
        
        SepedaMotor Mio01 = new SepedaMotor();
        Mio01.nama="Mio Soul";
        Mio01.merk="Yamaha";
        Mio01.jenis="Motor Matic";
        Mio01.istimewa="Mesin dilengkapi pendingin sehingga tidak cepat panas";
        Mio01.kecepatan=80;
        Mio01.cetakInfo();

        SepedaMotor SupraX = new SepedaMotor();
        SupraX.nama="Supra X";
        SupraX.merk="Honda";
        SupraX.jenis="Motor Bebek";
        SupraX.istimewa="Mesin tidak cepat panas, kuat melewati medan berat";
        SupraX.kecepatan=100;
        SupraX.cetakInfo();        
        
    }
}
