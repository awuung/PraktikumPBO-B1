/* File : MOperasiTitik.java */
/* Deskripsi : memanggil metode refleksi titik */
/* NIM & Nama : 24060122120039-Awang pratama Putra Mulya */
/* Tanggal :05/03/2024*/

public class MOperasiTitik {
    public static void main(String[] args){

        Titik t = new Titik(5,2);

        OperasiTitik o = new OperasiTitik();

        System.out.println("titik("+ t.getAbsis() +","+t.getOrdinat()+")");

        // o.refleksiSumbuX(t);
        // System.out.println("refleksiSumbuX titik("+ t.getAbsis() +","+t.getOrdinat()+")");

        // o.refleksiSumbuY(t);
        // System.out.println("refleksiSumbuY titik("+ t.getAbsis() +","+t.getOrdinat()+")");

        System.out.println("refleksiX titik("+ o.refleksiX(t).getOrdinat() +","+ t.getAbsis()+")");

        System.out.println("refleksiY titik("+ t.getOrdinat() +","+ o.refleksiY(t).getAbsis()+")");
    }
}
