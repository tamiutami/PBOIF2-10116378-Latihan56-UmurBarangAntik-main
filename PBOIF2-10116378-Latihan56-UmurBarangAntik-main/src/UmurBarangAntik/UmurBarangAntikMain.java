/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UmurBarangAntik;

/**
 *
 * @author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripsi : program ini berisi program yang menampilkan umur suatu barang antik
 */

public class UmurBarangAntikMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Radio radio = new Radio(234);
        radio.setNama("Radio AM");
        System.out.println("Nama barang antik : "+radio.getNama());
        radio.tampilUmur();
    }
    
}
