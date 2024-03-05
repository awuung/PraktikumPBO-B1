/* File : Mtitik.java */
/* Deskripsi : membuat titik dengan konstruktor dan overload */
/* NIM & Nama : 24060122120039-Awang pratama Putra Mulya */
/* Tanggal :20/02/2024*/

class Mtitik {
    public static void main(String[] args) {

            //deklarasi Objek t1 dan t2 dari kelas Titik
            Titik t1 = new Titik();
            t1.setAbsis(1.0);
            t1.setOrdinat(2.0);

            Titik t2 = new Titik();
            t2.setAbsis(3.0);
            t2.setOrdinat(4.0);

            Titik t3 = new Titik(5,6);

            //Print hasil
            System.out.println("Jumlah objek titik : "+ t1.getCounterTitik());

            System.out.println("t1 ("+ t1.getAbsis() + ", " + t1.getOrdinat() + ")");

            System.out.println("t2 ("+ t2.getAbsis() + ", " + t2.getOrdinat() + ")");  

            System.out.println("t3 ("+ t3.getAbsis() + ", " + t3.getOrdinat() + ")");  
    }
}
