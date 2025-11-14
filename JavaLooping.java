/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Java;
/**
 *
 * @author gamad
 */
import java.util.Scanner; //ini unruk import scanner
public class JavaLooping { //menentukan class file
        
    public static void main(String[] args) { //menset public 
        int n = 6;// menentukan jumlah tinggi baris, disini saya tidak memasukan fungsi scanner
              
        for (int i = 0; i < n; i++){// loop luar
            int nilai = 1; //nilai pertama selalu 1
            for (int j = 0; j <= i; j++){//loop dala
                if (j == 0 || j == i){
                    nilai= 1;//Jika j adalah posisi pertama atau terakhir dalam baris, maka nilai selalu 1
                    } else {
                    nilai = nilai * (i - j + 1)/ j;
                }// jika bukan baris pertama atau terakhir hitung dalam rumus kombinasi pascal
                System.out.print(nilai + "");// saya buat print agar tidak membuat baris baru
            }
            System.out.println();
        }
        // disini saya menggunakan versi scanner, jadi kita bisa memasukkan jumlah angka(baris) pada variabel
        System.out.println("\n"); //ini untuk print spasi
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah baris: ");  //ini untuk menampilkan jumlah baris
        int x = input.nextInt(); // disini saya menggunakan variabel x menggantikan variabel n
        for (int i = 0; i < x; i++){// loop luar
            int nilai = 1; //nilai pertama selalu 1
            for (int j = 0; j <= i; j++){//loop dala
                if (j == 0 || j == i){
                    nilai= 1;//Jika j adalah posisi pertama atau terakhir dalam baris, maka nilai selalu 1
                    } else {
                    nilai = nilai * (i - j + 1)/ j;
                }// jika bukan baris pertama atau terakhir hitung dalam rumus kombinasi pascal
                System.out.print(nilai + "");// saya buat print agar tidak membuat baris baru
            }
            System.out.println();
        }
    }
}
