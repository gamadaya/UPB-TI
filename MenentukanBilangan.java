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
public class MenentukanBilangan {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       int bilangan;
       
        System.out.printf("Masukkan Angka: ");
        bilangan = input.nextInt();
        
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan : " + bilangan + " Adalah Bilangan GENAP");
        } else {
            System.out.println("Bilangan : "+ bilangan +" Adalah Bilangan GANJIL");
        }
        
                
        
        
        
    }
}
