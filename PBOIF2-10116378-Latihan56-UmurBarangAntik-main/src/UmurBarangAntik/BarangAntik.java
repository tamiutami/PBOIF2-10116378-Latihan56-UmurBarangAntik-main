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
class BarangAntik {
    int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }

    public void tampilUmur() {
        Radio radio = new Radio(234);
        System.out.println("Umur barang antik ini adalah : " + umur +
                " tahun.");
    }
}
