# Awang Pratama Putra Mulya - 24060122120039

/* File : Titik.java */
/* Deskripsi : membuat titik dengan konstruktor dan overload */
/* NIM & Nama : 24060122120039-Awang pratama Putra Mulya */
/* Tanggal :20/02/2024*/

class Titik {
        //dekl/arasi atribut
        double absis;
        double ordinat;
        static int counterTitik;

        //deklarasi konstruktor
        Titik(){
            absis = 0;
            ordinat = 0;
            counterTitik++;
        }

        Titik(double a, double o){
            absis = a;
            ordinat = o;
            counterTitik++;
        }

        //deklarasi metode
        void setAbsis(double A){
            absis = A;
        }

        void setOrdinat(double O){
            ordinat = O;
        }

        double getAbsis(){
            return absis;
        }

        double getOrdinat(){
            return ordinat;
        }

        int getCounterTitik() {
            return counterTitik;
        }
}
