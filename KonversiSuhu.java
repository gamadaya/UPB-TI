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
public class KonversiSuhu {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double Celcius;
        double fahrenheit;
        
       
        System.out.printf("Masukkan Nilai Celcius: ");
        Celcius = input.nextDouble();
        
        fahrenheit =(Celcius * (9 / 5)) + 32;  
        
        System.out.println("Nilai Celcius: "+ Celcius);
        System.out.println("Nilai Fahrenheit : "+ fahrenheit);
        
    }
    
}
