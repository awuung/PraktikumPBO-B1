package bukuFiksi;

import buku.Buku;

public class bukuFiksi extends Buku{
    //atribut
    protected String genre;
    protected int jumlahHalaman;
    protected double harga;

    //konstruktor
    public bukuFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    //metode
    public String getGenre() {
        return genre;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public double getHarga() {
        return harga;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public void view() {
        super.view();
        System.out.println("Genre : " + getGenre());
        System.out.println("Jumlah Halaman : " + getJumlahHalaman());
        System.out.println("Harga : Rp." + getHarga());
    }
}
