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
public class PersegiPanjang {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        double panjang;
        double lebar;
        double luas;
        
        System.out.printf("Masukan Nilai Panjang:");
        panjang = input.nextDouble();
        
        System.out.printf("Masukan Nilai Lebar:");
        lebar = input.nextDouble();

luas = panjang * lebar;

        System.out.println("/n Hasil Perhitungan");
        System.out.println("Nilai Panjang:" + panjang);
        System.out.println("Nilai Lebar:" + lebar);
        System.out.println("Hasil Luas Persegi Panjang" + luas);
        
    }
    
}
