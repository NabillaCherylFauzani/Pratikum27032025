/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum207032025;
import java.util.Scanner;
import java.util.Random;


import java.util.Scanner;
import java.util.Random;

public class Array2DRandom {

    public static void main(String[] args) {
        int M[][];
        int O[][];
        int Z[][];
        int i, j, b, k;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // Input ukuran matriks pertama
        System.out.print("Masukkan jumlah baris matriks pertama: ");
        b = in.nextInt();
        System.out.print("Masukkan jumlah kolom matriks pertama: ");
        k = in.nextInt();

        M = new int[b][k];

        // Mengisi matriks M secara random dan tampilkan
        System.out.println("== Isi Matriks Pertama ==");
        for (i = 0; i < b; i++) {
            for (j = 0; j < k; j++) {
                M[i][j] = rand.nextInt(100) + 1;
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }

        // Input ukuran matriks kedua (harus sama dengan matriks pertama untuk penjumlahan)
        System.out.print("Masukkan jumlah baris matriks kedua: ");
        int b2 = in.nextInt();
        System.out.print("Masukkan jumlah kolom matriks kedua: ");
        int k2 = in.nextInt();

        // Cek ukuran matriks agar sesuai
        if (b2 != b || k2 != k) {
            System.out.println("Error: Ukuran matriks kedua harus sama dengan matriks pertama untuk penjumlahan.");
            in.close();
            return;
        }

        O = new int[b][k];
        Z = new int[b][k];  // Inisialisasi matriks hasil penjumlahan

        // Mengisi matriks O secara random dan tampilkan
        System.out.println("== Isi Matriks Kedua ==");
        for (i = 0; i < b; i++) {
            for (j = 0; j < k; j++) {
                O[i][j] = rand.nextInt(100) + 1;
                System.out.print(O[i][j] + "\t");
            }
            System.out.println();
        }

        // Penjumlahan matriks M dan O ke dalam Z
        System.out.println("== Hasil Penjumlahan Matriks ==");
        for (i = 0; i < b; i++) {
            for (j = 0; j < k; j++) {
                Z[i][j] = M[i][j] + O[i][j];
                System.out.print(Z[i][j] + "\t");
            }
            System.out.println();
        }

        in.close();
    }
}
