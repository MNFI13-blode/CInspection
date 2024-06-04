/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tp.tplm;

import java.util.Scanner;

/**
 *
 * @author A S U S
 */
public class TPLM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.println("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        int operasi = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("Masukkan operasi \n1. penjumlahan \n2. pengurangan \n3. perkalian \n4. pembagian: \n0.Close");
            operasi = scanner.nextInt();

            switch (operasi) {
                case 1:
                    int hasilPenjumlahan = SimpleClass.penjumlahan(angka1, angka2);
                    System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
                    valid = true;
                    break;
                case 2:
                    int hasilPengurangan = SimpleClass.pengurangan(angka1, angka2);
                    System.out.println("Hasil pengurangan: " + hasilPengurangan);
                    valid = true;
                    break;
                case 3:
                    int hasilPerkalian = SimpleClass.perkalian(angka1, angka2);
                    System.out.println("Hasil perkalian: " + hasilPerkalian);
                    valid = true;
                    break;
                case 4:
                    double hasilPembagian = SimpleClass.pembagian(angka1, angka2);
                    System.out.println("Hasil pembagian: " + hasilPembagian);
                    valid = true;
                    break;
                case 0:
                    valid = true;
                    break;
                default:
                    System.out.println("Operasi tidak valid. Silakan masukkan operasi yang valid.");
                    break;
            }
        }
    }
}
