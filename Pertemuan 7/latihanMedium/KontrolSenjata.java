package latihanMedium;

public class KontrolSenjata {
    protected Senjata senjata;

    KontrolSenjata(Senjata s){
        this.senjata = s;
    }

    public boolean isAdaPeluru(){
        return this.senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru){
        this.senjata.setPeluru(jumPeluru);
        System.out.println("Peluru berhasil ditambah: "+this.senjata.getPeluru());
    }

    public void menembak(int jumlah){
        System.out.println("Siap menembak " + jumlah + " kali");

        if(this.isAdaPeluru()){
            for (int i = 1; i <= jumlah; i++) {
                if (this.senjata.getPeluru() <= 0) {
                    System.out.println("Gagal tembak, Peluru Habis");
                }else{
                    this.senjata.setPeluru(this.senjata.getPeluru() - 1);
                    System.out.println(this.senjata.getBunyi());
                }
            }
            System.out.println("Peluru sisa: " + this.senjata.getPeluru());
        } else {
            System.out.println("Peluru Habis"); 
        }
    }

    public void menusuk(){
        if(this.senjata.isMenusuk()){
            System.out.println("Senjata sudah menusuk");
        } else {
            this.senjata.setMenusuk(true);
            System.out.println("Senjata menusuk");
        }
    }

    public void pasangBayonet(){
        if(this.senjata.isMenusuk()){
            System.out.println("Senjata sudah terpasang bayonet");
        } else {
            this.senjata.setMenusuk(true);
            System.out.println("Senjata terpasang bayonet");
        }
    }
}
