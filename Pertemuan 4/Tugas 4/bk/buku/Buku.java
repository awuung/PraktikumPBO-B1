package buku;

public class Buku{
    //atribut
    protected String judul;
    protected String penulis;
    protected String tahunTerbit;

    //konstruktor
    public Buku(String judul, String penulis, String tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    //motode
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String gettahunTerbit() {
        return tahunTerbit;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void view() {
        System.out.println("Judul : " + getJudul());
        System.out.println("Penulis : " + getPenulis());
        System.out.println("TahunTerbit : " + gettahunTerbit());
    }    
}