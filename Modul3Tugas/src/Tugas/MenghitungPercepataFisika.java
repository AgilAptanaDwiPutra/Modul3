package Tugas1Modul3;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Kelas menghitung percepatan
 */
public class MenghitungPercepatan {


    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        // Meminta pengguna memasukkan kecepatan awal, kecepatan akhir, dan waktu
        out.print("Masukkan kecepatan awal (m/s): ");
        double vi = input.nextDouble();

        out.print("Masukkan kecepatan akhir (m/s): ");
        double vf = input.nextDouble();

        out.print("Masukkan waktu (s): ");
        double t = input.nextDouble();

        // Menghitung percepatan
        double a = (vf - vi) / t;

        // Menampilkan hasil
        out.println("Percepatan adalah: " + a + " m/s^2");
/**
 * menutup inputan untuk menjalankan program
 */
        input.close();
    }
}


