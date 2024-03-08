/* File : Segitiga.java */
/* Deskripsi : membuat class segitiga */
/* NIM & Nama : 24060122120039-Awang pratama Putra Mulya */
/* Tanggal :08/03/2024*/

public class Segitiga {
    //Deklaraasi atribut
    private double alas;
    private double tinggi;

    //Deklarasi konstruktor
    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    //Deklarasi metode
    public double getAlas(){
        return alas;
    }

    public double getTinggiSegitiga(){
        return tinggi;
    }

    public double hitungLuas(){
        return (alas * tinggi)/2;
    }
}
