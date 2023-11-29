/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspert11_Latihan54_Koordinat;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi: Teknik Informatika
 * Deskripsi : program ini berisi warna koordinat dari x dan y
 */
public class WarnaKoordinat extends Koordinat {
    public String namaWarna;
    
    public WarnaKoordinat(int x, int y, String namaWarna){
        super(x, y);
        this.namaWarna = namaWarna;
    }
    public String getNamaWarna(){
        return namaWarna;
    }
    public void setNamaWarna(String namaWarna){
        this.namaWarna = namaWarna;
    }
    
}
