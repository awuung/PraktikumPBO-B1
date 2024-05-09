package latihanMedium;

public class Senjata {
    private String bunyi;
    private int peluru; 
    private boolean menusuk;

    Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
        this.menusuk = false;
    } 

    public String getBunyi() {
        return this.bunyi;
    }

    public int getPeluru(){
        return this.peluru;
    }

    public boolean isMenusuk(){
        return this.menusuk;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk){
        this.menusuk = false;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}
