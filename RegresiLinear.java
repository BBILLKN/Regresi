/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regresilinear;
import java.util.Scanner;
/**
 *
 * @author BILL_0058
 */
public class RegresiLinear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah data:");
        int n = scanner.nextInt();

        double[] TB = new double[n];
        double[] NT = new double[n];

        System.out.println("Masukkan data Durasi Waktu Belajar (TB) dan Nilai Ujian (NT):");
        for (int i = 0; i < n; i++) {
            System.out.print("TB[" + (i+1) + "]: ");
            TB[i] = scanner.nextDouble();
            System.out.print("NT[" + (i+1) + "]: ");
            NT[i] = scanner.nextDouble();
        }

        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += TB[i];
            sumY += NT[i];
            sumXY += TB[i] * NT[i];
            sumX2 += TB[i] * TB[i];
        }

        double slope = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double intercept = (sumY - slope * sumX) / n;

        System.out.println("Model regresi linear: NT = " + intercept + " + " + slope + " * TB");
    }
}