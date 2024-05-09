package latihanVeryEasy;
public class Senjata {
    protected String bunyi;
    protected int peluru; 

    Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
    } 

    public String getBunyi() {
        return this.bunyi;
    }

    public int getPeluru(){
        return this.peluru;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void menembak(){
        this.peluru--;

        System.out.println(this.bunyi);
        System.out.println("Sisa Peluru: " + this.peluru);
    }
}