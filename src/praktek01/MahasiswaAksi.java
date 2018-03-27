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
public class MahasiswaAksi {
    public static void main(String[] args) {
        
        Mahasiswa ikhsan = new Mahasiswa();
        ikhsan.nama="Khairul Ikhsan";
        ikhsan.NPM="19639988";
        ikhsan.ttl="Banjarbaru, 21 desember 1987";
        ikhsan.alamat="jalan ahmad yani km.21";
        ikhsan.IPK=3.95;
        ikhsan.cetakInfo();

        
        Mahasiswa Ikhsan = new Mahasiswa();
        Ikhsan.nama="Chairul Ikhsan";
        Ikhsan.NPM="18630123";
        Ikhsan.ttl="Banjarmasin, 2 januari 1967";
        Ikhsan.alamat="jalan lurus";
        Ikhsan.IPK=2.98;
        Ikhsan.cetakInfo();
        
        
        Mahasiswa Ayu = new Mahasiswa();
        Ayu.nama="Ayu Ningsih";
        Ayu.NPM="17630523";
        Ayu.ttl="Rantau, 1 juni 1998";
        Ayu.alamat="jalan belok kanan";
        Ayu.IPK=3.5;
        Ayu.cetakInfo();
    }
}
