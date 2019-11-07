/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan54.koordinat;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi program : program ini berisi tentang warna koordinat
 */
public class IF110118030Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat wkrdnt = new WarnaKoordinat (10,4,"Jingga");
        System.out.println("Warna Koordinat : "+wkrdnt.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+wkrdnt.getX()+", y : "+wkrdnt.getY());
    }
    
}
