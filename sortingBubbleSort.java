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
public class sortingBubbleSort {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                
        System.out.printf("Masukkan Jumlah Elemen Array : ");
        int n = input.nextInt();
        
        int[] data = new int[n];
        
        System.out.println("Masukan Elemen-Elemen Array");
        for (int i = 0; i < n; i++){
            System.out.printf("Elemen Ke-" +(i + 1)+ " : ");
            data[i] = input.nextInt();
        }
        
        System.out.println("\nData Sebelum diurutkan : ");
        tampilkanArray(data);
        
        bubbleSort(data);
        
        System.out.println("\nData Setelah Diurutkan (Ascending) : ");
        tampilkanArray(data);
       }
        
       public static void bubbleSort(int[]arr){
         int n = arr.length;
         boolean swapped;
         
         //proses Bubble Sort
         for (int i = 0; i < n - 1; i++){
             swapped = false;
         
         for(int j = 0; j < n - 1 -i; j++){
             if(arr[j] > arr[j +1]){
                 //tukar elemen
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
                 swapped = true;    
             }
         }
             
        // jika tidak ada petukaran, array sudah urut
        if(!swapped) break;
     }
}
        
    public static void tampilkanArray(int[] arr){
     for (int i: arr){
         System.out.printf(i+" ");
     }
     System.out.println();
        
    }
}
