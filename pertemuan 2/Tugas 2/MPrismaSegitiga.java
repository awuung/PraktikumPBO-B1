/* File : MPrismaSegitiga.java */
/* Deskripsi : main untuk menampikan metode prismasegitiga */
/* NIM & Nama : 24060122120039-Awang pratama Putra Mulya */
/* Tanggal :08/03/2024*/

public class MPrismaSegitiga {

    public static void main(String[] args) {
        //deklarasi objek segitiga dan prismasegitiga
        Segitiga segitiga = new Segitiga(3, 4);

        PrismaSegitiga prisma = new PrismaSegitiga(segitiga, 5);

        //print metode pada class Segitiga dan PrismaSegitiga

        //alas dan tinggi segitiga
        System.out.println("Alas segitiga: " + segitiga.getAlas());
        System.out.println("tinggi segitiga: " + segitiga.getTinggiSegitiga());

        //menghitung volume prisma segitiga
        System.out.println("Volume Prisma Segitiga: " + prisma.Volume());

        // Menghitung dan menampilkan luas permukaan prisma segitiga
        System.out.println("Luas Permukaan Prisma Segitiga: " + prisma.hitungLuasPermukaan());


    }   
}