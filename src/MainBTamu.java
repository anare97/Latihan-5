package Latihan;
import java.util.*;
public class MainBTamu {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        //BukuTamu z = new BukuTamu();
        System.out.println("==================Buku Tamu Hotel ABC==================");
        System.out.println("Ruangan total = 5\nMenu:");
        boolean status = true;
        while(status){
        System.out.print("1.Daftar\n2.Lihat Data\n3.Keluar\nPilihan Anda: ");
        int a = in.nextInt();
        System.out.println("=======================================================");
        switch (a){
            case 1  : System.out.print("Nama Anda: ");
                      String b = in.nextLine(); b = in.nextLine();
                      System.out.print("Asal Kota: ");
                      String c = in.next();
                      System.out.print("Nomor Kamar: ");
                      int d = in.nextInt();
                      BukuTamu.tambahTamu(c, b, d);
                      System.out.println("=======================================================");
                      break;
            case 2  : System.out.println("Ingin lihat data tamu kamar nomor berapa?");
                      System.out.print("Kamar No: ");
                      int g = in.nextInt();
                      BukuTamu.tampilData(g);
                      System.out.println("=======================================================");
                      break;
            case 3  : status = false; break;
            default : System.out.println("Maaf pilihan anda tidak ditemukan.");
                      System.out.println("=======================================================");
            }
        }
    }
}
