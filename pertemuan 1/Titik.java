class Titik {
        //deklarasi atribut
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
