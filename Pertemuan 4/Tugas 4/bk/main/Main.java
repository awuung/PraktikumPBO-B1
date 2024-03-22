package main;

import bukuFiksi.*;
import bukunonFiksi.*;
import buku.Buku;

public class Main {
    public static void main(String[] args) {
        //Deklarasi Objek
        Buku buku = new Buku("Zero to One", "Peter Thiel", "2014");

        bukuFiksi bukuFiksi = new bukuFiksi("Filosofi Teras", "Henry Manampiring", "2018", "philosophy", 346, 110000.0);

        bukuNovel bukuNovel = new bukuNovel("Bumi", "Tere Liye", "2014", "Fantasy", 440, 103000.0);

        bukuNonFiksi bukuNonFiksi = new bukuNonFiksi("Rich Dad Poor Dad: What the Rich Teach Their Kids About Money That the Poor and Middle Class Do Not", "Robert T. Kiyosaki", "1997", "Personal Finance", 336, 126000.0);

        bukuAkademik bukuAkademik = new bukuAkademik("Introduction to Algorithms", "Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein", "2009", "Computer Science", 1312, 230000.0);
        
        //Hasil
        buku.view();
        System.out.println('\n');

        bukuFiksi.view();
        System.out.println('\n');

        bukuNovel.view();
        System.out.println('\n');

        bukuNonFiksi.view();
        System.out.println('\n');

        bukuAkademik.view();
    }
}
