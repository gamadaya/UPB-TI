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
public class KasirSederhana {
    
    public static void main(String[] args) {
        System.out.println("==Program Kasir Sederhana==");
        
        // persiapan input
       Scanner input = new Scanner(System.in);
       
       // deklarasi variable
       String namaBarang;
       double hargaSatuan;
       int jumlahBeli;
       double subTotal;
       double potongan;
       double totalBayar;
       String keteranganPotongan;
       
       // input data
        System.out.printf("Masukan Nama Barang: ");
        namaBarang = input.nextLine();
        
        System.out.printf("Masukan Harga Satuan: ");
        hargaSatuan = input.nextDouble();
        
        System.out.printf("Masukan Jumlah beli : ");
        jumlahBeli = input.nextInt();
        
        // proses perhitungan
        
        subTotal = hargaSatuan * jumlahBeli;
        
        // cek diskon
        
        if ( subTotal > 100000){
        potongan = subTotal * 0.10;
        keteranganPotongan = "Dapat diskon 10%";
        } else {
            potongan = 0;
            keteranganPotongan = "Tidak Dapat Diskon";
        }
        
        // hitung total bayar
        
        totalBayar = subTotal - potongan;
        
        // output hasil
        
        System.out.println("===============================");
        System.out.println("       STRUK PEMBAYARAN        ");
        System.out.println("===============================");
        
        System.out.println("----------------------------");
        System.out.println("Barang : " + namaBarang);
        System.out.println("Harga : " + hargaSatuan);
        System.out.println("Jumlah Beli : " + jumlahBeli);
        System.out.println("----------------------------");
        
        System.out.printf("Subtotal    : %.0f\n", subTotal); // Output tanpa desimal
        System.out.printf("Potongan    : %.0f\n", potongan);
        System.out.println("-------------------------------");
        
        System.out.printf("TOTAL BAYAR : %.0f\n", totalBayar);
        System.out.println("===============================");
        
        System.out.println("Keterangan : " + keteranganPotongan);
        System.out.println("-----------------------------");
    }

}
