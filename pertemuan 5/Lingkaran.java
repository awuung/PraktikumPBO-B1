import static java.lang.Math.PI;

class Lingkaran {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
