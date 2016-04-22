package Latihan;
public class BukuTamu {
    private String nama;
    private String alamat;
    private static Object[][] data = {{"","","","",""}, {"","","","",""},{0,0,0,0,0}};
    private static int id = 1;
    private static final String tag = "TAMU00ABC";
    
    public BukuTamu(){
        
    }
    public static void tambahTamu(String a, String b, int c){
        int i = c-1;
        data[0][i] = a;
        data[1][i] = b;
        data[2][i] = id++;
    }
    public static void tampilData(int a){
        int i = a-1;
        System.out.println("Nama: "+data[0][i]);
        System.out.println("Alamat: "+data[1][i]);
        System.out.println("ID Tamu: "+tag+data[2][i]);
    }
}
