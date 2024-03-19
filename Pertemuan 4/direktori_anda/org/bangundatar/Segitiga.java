package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas,tinggi;

    //konstruktor
    public Segitiga(double alas, double tinggi,int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    //metode
    public double hitungLuas() {
        return (alas * tinggi)/2;
    }

    public void printInfo() {
        System.out.println("Bangun Segitiga beralas " + this.getJumlahSisi());
    }
}
