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

public class Faktorial {
     
    public static void main(String[] args) {
        
        System.out.println("==============================================");
        System.out.println("Program Sederhana Faktorial Dengan While Loop");
        System.out.println("==============================================");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Bilangan (N): ");
        int N = input.nextInt();
        
        if (N < 0) {
            System.out.println("Faktorial bilangan negatif tidak terdefinisi.");
            return; // 
        }
        
        long faktorial = 1; 
        int i = N;
        
        System.out.print(N + "! = ");
        
        while (i >= 1){ 
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
            
            faktorial *= i; 
            
            i--; 
        }
        
        // Output Hasil
        System.out.println("\n----------------------------------------------");
        System.out.println("Hasil faktorial dari " + N + " adalah: " + faktorial);
        System.out.println("==============================================");
    }
}