/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Java;

/**
 *
 * @author gamad
 */
public class lab_3_Array {
    
    public static void main(String[] args) {
        
        char[] kalimat = {
            'k','a','k','i','k','a','k','a','k','k','e','n','a','k','a','y','u','t','a','k','b','e','r','p','a','k','u','k','a','k','u','k','a','k','u'        
        };
        System.out.print("Isi Object Array Kalimat :");
        for (int i = 0; i < kalimat.length; i++){
            System.out.print(kalimat[i]+ "");
        }     
        System.out.println();
        
        int jumlahHuruf = kalimat.length;
        System.out.println("Jumlah huruf pada Array : "+ jumlahHuruf);
        
        int jumlahK = 0;
        for (int i = 0; i < kalimat.length; i++){
            if (kalimat[i] == 'k'){
                jumlahK++;
            }
    }
   
       System.out.println("Jumlah huruf 'k' pada object array adalah :" + jumlahK);
    }
}
