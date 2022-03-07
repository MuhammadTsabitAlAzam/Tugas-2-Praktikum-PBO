/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg2.praktikum.pbo;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main {
   
    public static void main(String[] args){
        boolean ulang = false;
        double p,l,t,r, tinggi;
        int pilih = 0;
        int x=0;
        
        Scanner input = new Scanner (System.in);
        do{
        System.out.println("Menu : ");
        System.out.println("1. Balok");
        System.out.println("2. Kerucut");
        System.out.println("3. Keluar");
        System.out.print("Pilih : "); pilih = input.nextInt();
        
        switch (pilih){
            case 1:
            System.out.print("Masukkan panjang : "); p = input.nextDouble();
            System.out.print("Masukkan lebar : "); l = input.nextDouble();
            System.out.print("Masukkan tinggi : "); t = input.nextDouble();
            
            Balok balok = new Balok(p,l,t);

            System.out.println("Keliling persegi panjang : " + balok.keliling());            
            System.out.println("Luas persegi panjang : " + balok.luas());
            
            System.out.println("Luas permukaan balok : " + balok.luasPermukaan());
            System.out.println("Volume Balok : " + balok.volume());
            break;

            
        
            case 2:
            System.out.print("Masukkan jari-jari : "); r = input.nextDouble();
            System.out.print("Masukkan tinggi : "); tinggi = input.nextDouble();
            
            Tabung tabung = new Tabung (r, tinggi);

            System.out.println("Keliling lingkaran : " + tabung.keliling());            
            System.out.println("Luas lingkaran : " + tabung.luas());
            
            System.out.println("Luas permukaan Tabung : " + tabung.luasPermukaan());
            System.out.println("Volume Tabung : " + tabung.volume());
            break;
        
            case 3:
            x=1;
            System.exit(0); 
            break;
            
            default : System.out.println("Input Anda Salah");break;
        
        }
        }while(x==0);
    }  
    }
