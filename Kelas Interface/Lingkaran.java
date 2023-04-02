/*
 * File : Lingkaran.java 
 * Penulis : Ahmad Alvin  Griffin (24060121140106)
 * Deskripsi : Kelas Implementasi IArea berupa cara menghitung luas lingkaran
 */

//Mengambil konstanta yang ada di kelas java.lang.Math
import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}