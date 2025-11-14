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
public class NilaiMahasiswa {
    
    public static void main(String[] args) {
       
        Scanner input =  new Scanner(System.in);
        int nilai;
        String hasil;
        
        System.out.printf("Masukkan Nilai Mahasiswa: ");
        nilai = input.nextInt();
        
        if (nilai >= 85){
            hasil = "A";
        } else if (nilai >= 70){
            hasil = "B";
        } else if (nilai >= 55){
            hasil = "C";
        } else if (nilai >= 40){
            hasil = "D";
        } else {
            hasil = "E";
        } 
         
        System.out.println("Nilai Mahasiswa : " + hasil);
    }
    
}
