import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
        scan.close();
    }
}

//karena metode abstrak pada BangunDatar untuk memfasilitasi metode yang ada pada bangun datar yang berbeda".jika Kelas BujurSangkar tidak membuat implementassi maka tidak dapat memangil hitungLuas pada kelas BujurSangkar 