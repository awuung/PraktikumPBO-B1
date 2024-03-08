/* File : PrismaSegitiga.java */
/* Deskripsi : membuat class PrismaSegitiga dengan hubungan agregasi terhadap class Segitiga*/
/* NIM & Nama : 24060122120039-Awang pratama Putra Mulya */
/* Tanggal :08/03/2024*/

public class PrismaSegitiga {
    //Deklarasi atribut
    private Segitiga alas;
    private double tinggiPrisma;

    //Deklarasi konstruktor
    public PrismaSegitiga(Segitiga alas, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }

    //Deklarasi metode
    public double Volume(){
        double luasAlas = alas.hitungLuas();
        return luasAlas * tinggiPrisma;
    }

    public double hitungLuasPermukaan(){
        double luasAlas = alas.hitungLuas();
        return (2 * luasAlas) + (alas.getAlas() * tinggiPrisma);
    }
}