/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regresipangkatsederhana;
import java.util.Scanner;
/**
 *
 * @author BILL_0058
 */
public class RegresiPangkatSederhana {

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

        double sumLogX = 0, sumLogY = 0, sumLogXLogY = 0, sumLogX2 = 0;

        for (int i = 0; i < n; i++) {
            double logX = Math.log(TB[i]);
            double logY = Math.log(NT[i]);
            sumLogX += logX;
            sumLogY += logY;
            sumLogXLogY += logX * logY;
            sumLogX2 += logX * logX;
        }

        double slope = (n * sumLogXLogY - sumLogX * sumLogY) / (n * sumLogX2 - sumLogX * sumLogX);
        double intercept = (sumLogY - slope * sumLogX) / n;

        System.out.println("Model regresi pangkat: NT = e^(" + intercept + ") * TB^" + slope);
    }
}