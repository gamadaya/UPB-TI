/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Java;

/**
 *
 * @author gamad
 */
import java.util.Scanner;
public class HitungRataRata {
    
    public static void main(String[] args) {
        System.out.println("===Menjumlah Dan Menghitung Rata Rata Nilai Mahasiswa===");
        Scanner input = new Scanner(System.in);
        
        int JumlahNilai = 5;
        double total  = 0;
       
        
        for (int i = 1; i <= JumlahNilai; i++){
            System.out.printf("Masukan Nilai Tugas ke-" + i + ": ");
            double nilai = input.nextDouble();
            total = total + nilai;
        }
        double Ratarata= total / JumlahNilai;
        System.out.println("Jumlah Nilai Tugas Keseluruhan = " + total);
        System.out.println("Rata Rata Nilai Tugas = "+ Ratarata);
    }
    
}
