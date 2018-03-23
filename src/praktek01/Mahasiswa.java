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
public class Mahasiswa {
    String nama;
    String NPM;
    String ttl;
    String alamat;
    double IPK;
    
    void cetakInfo () {
        System.out.println("Nama                    :"+nama);
        System.out.println("NPM                     :"+NPM);
        System.out.println("Tempat Tanggal Lahir    :"+ttl);
        System.out.println("Alamat                  :"+alamat);
        System.out.println("IPK  :"+IPK);
    }
}
