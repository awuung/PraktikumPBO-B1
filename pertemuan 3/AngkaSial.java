/* File : AngkaSial.java */
/* Deskripsi : eksepsi ketika memasukan angka sial 13 */
/* NIM & Nama : 24060122120039-Awang pratama Putra Mulya */
/* Tanggal :06/03/2024*/

public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

//baris ke 12 tidak di eksekusi karena terjadi eksepsi
//baris ke 21 di eksekusi karena terjadi eksepsi saat memasukan angka 13 