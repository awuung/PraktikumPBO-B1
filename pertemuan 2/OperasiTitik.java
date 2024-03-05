/* File : OperasiTitik.java */
/* Deskripsi : membuat metode refleksi titik */
/* NIM & Nama : 24060122120039-Awang pratama Putra Mulya */
/* Tanggal :05/03/2024*/

public class OperasiTitik {
    
    private void refleksiSumbuX(Titik titik){
        titik.setOrdinat(-titik.getOrdinat());
    }
    private void refleksiSumbuY(Titik titik){
        titik.setAbsis(-titik.getAbsis());
    }

    // public void refleksiX(Titik titik){
    //     refleksiSumbuX(titik);
    // }
    // public void refleksiY(Titik titik){
    //     refleksiSumbuY(titik);
    // }

    public Titik refleksiX(Titik titik){
        this.refleksiSumbuX(titik);
        return titik;
    }
    public Titik refleksiY(Titik titik){
        this.refleksiSumbuY(titik);
        return titik;
    }
}