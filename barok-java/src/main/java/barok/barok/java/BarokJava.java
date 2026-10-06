/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package barok.barok.java;

/**
 *
 * @author user
 */
public class BarokJava {

    public static void main(String[] args) {
       String nama = "A. Shofiyul Mubarok";
        String prodi = "Teknik Informatika";
        biodata(nama,prodi);
        
        int hasil = penjumlahan(80, 39);
        System.out.println("Ini hasil penjumlahan = " + hasil);
        
        hasil = pengurangan(800, 368);
        System.out.println("Ini hasil pengurangan = " + hasil);
        
        hasil = perkalian(197, 63);
        System.out.println("Ini hasil perkalian = " + hasil);
        
        hasil = pembagian(2000, 955);
        System.out.println("Ini hasil pembagian = " + hasil);

        // Pecahan
        double pecahan = pembagianPecahan(2990, 355);
        System.out.println("Ini hasil pecahan = " + pecahan);

        // Sin
        double sin = sinus(90);
        System.out.println("Ini hasil sin 30 = " + sin);

        // Cos
        double cos = cosinus(880);
        System.out.println("Ini hasil cos 60 = " + cos);

        // Tan
        double tan = tangen(35);
        System.out.println("Ini hasil tan 45 = " + tan);

        // Log
        double log = logaritma(200);
        System.out.println("Ini hasil log 100 = " + log);
    }
    
    public static int penjumlahan(int a, int b){
        return a + b;
    }
    
    public static int pengurangan(int a, int b){
        return a - b;
    }
    
    public static int perkalian(int a, int b){
        return a * b;
    }
    
    public static int pembagian(int a, int b){
        return a / b;
    }

    // Pembagian dalam bentuk pecahan/desimal
    public static double pembagianPecahan(double a, double b){
        return a / b;
    }

    // Sinus
    // Math.sin menggunakan radian, jadi derajat harus diubah ke radian
    public static double sinus(double derajat){
        return Math.sin(Math.toRadians(derajat));
    }

    // Cosinus
    public static double cosinus(double derajat){
        return Math.cos(Math.toRadians(derajat));
    }

    // Tangen
    public static double tangen(double derajat){
        return Math.tan(Math.toRadians(derajat));
    }

    // Logaritma basis 10
    public static double logaritma(double angka){
        return Math.log10(angka);
    }
    
    public static void biodata(String nama, String prodi) {
    System.out.println("......");
    System.out.println("Nama : " + nama);
    System.out.println("Prodi : " + prodi);
    System.out.println("......");
    }
}
