/* File : Asersi2.java */
/* Deskripsi : program untuk demo asersi,yangakan menolak input jari jari bernilai nol dan negatif*/
/* NIM & Nama : 24060122120039-Awang pratama Putra Mulya */
/* Tanggal :06/03/2024*/

class Lingkaran {
    private double jarijari;
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    public double hitungkeliling(){
        double keliling = 2*Math.PI*jarijari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] agrs){
        double jarijari = -1;
        assert(jarijari > 0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jarijari);
        double kelilingLingkaran = l.hitungkeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
    
}

//Jawaban
//salah pada asersi "jari jari tidak boleh nol!!!" karena jari jari lingkaran juga tidak boleh negatif