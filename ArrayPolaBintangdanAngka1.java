/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum207032025;

/**
 *
 * @author muhad
 */
import java.util.Scanner;
import java.util.Random;
public class ArrayPolaBintangdanAngka1 {
    public static void main(String[] args) {
       int i,j,n,b,k;
       int A[] [];
       int B[] [];
       int C[] [];
       int D[] [];
       Scanner in=new Scanner(System.in);
       
       System.out.println("Cetak bintang segitiga siku-siku");
       System.out.print("Masukkan jumlah: ");
       n=in.nextInt();
       //for bintang segitiga siku-siku
       for(i=0;i<=n;i++){
           for(j=0;j<=i;j++){
               System.out.print(" * ");
           }
           System.out.println();
       }
           System.out.println();
       
       for(i=0;i<=n;i++){
           for(j=0;j<=i;j++){
               System.out.print(" * ");
           }
           System.out.println();
       }
    }
}
       
    
    
