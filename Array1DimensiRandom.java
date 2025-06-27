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

public class Array1DimensiRandom {
    public static void main(String[] args) {
        int A[], n, i;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Masukkan banyak data : ");
        n = in.nextInt();              // perbaikan: nextInt() tanpa parameter

        A = new int[n];                // perbaikan: new int[n], bukan new int(n)

        System.out.println("==Data Anda==");
        for(i = 0; i < n; i++) {
            A[i] = rand.nextInt(100) + 1;
            System.out.print(A[i] + "\t");
        }

        int jumlah = 0;
        int banyak = 0;
        System.out.println("\n==Data Genap==");
        for(i = 0; i < n; i++) {       // perbaikan: i < n, bukan i <= n
            if(A[i] % 2 == 0){
                System.out.print(A[i] + "\t");
                banyak++;
                jumlah += A[i];
            }
        }
        System.out.println("\nJumlah data genap: " + banyak);
        System.out.println("Jumlah nilai genap: " + jumlah);

        in.close();
    }
}

