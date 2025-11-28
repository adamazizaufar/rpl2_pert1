/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasarjava1;

/**
 *
 * @author User
 */
import java.util.Scanner;


public class DasarJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new  Scanner(System.in);
            
            String nama;
            double uts;
            double uas;
            double hasil;
            
            System.out.println("---Program Hitung Nilai Ujian");
            System.out.print("Masukkan Nama: ");
            nama = input.nextLine();
            
            System.out.print("Massukan Nilai Uts (bobot 60%): ");
            uts = input.nextDouble();
            
            System.out.print("Massukan nilai Uas (bobot 40%): ");
            uas = input.nextDouble();
            
            hasil = (uts * 0.6) + (uas * 0.4);
            
            System.out.println("\n---Hasil Perhitunngan");
            System.out.println("Nama mahasiswa: " + nama);
            System.out.println("Nilai Uts: " + uts);
            System.out.println("Nilai Uas: " + uas);
            System.out.println("Nilai Hasil: " + hasil);
            
            
    }
    
}
