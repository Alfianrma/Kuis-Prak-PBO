package Kuis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kategori, menu;
        String nama, sekolah;
        System.out.println("=== Lomba Apresiasi Pahlawan Wanita Indonesia ===");
        System.out.println("Kategori Lomba :");
        System.out.println("\t 1. Animasi");
        System.out.println("\t 2. Menulis Surat");
        System.out.print("Pilih Kategotri Lomba : ");
        kategori = input.nextInt();
        if (kategori == 1) {
            double Alur, Konten, KreativitasAnimasi, Sinematografi;
            System.out.println("== Form Pendaftaran ==");
            System.out.print("Input Nama : ");
            nama = input.next();
            System.out.print("Asal Sekolah : ");
            sekolah = input.next();
            System.out.println("");
            System.out.println("== Form Penilaian ==");
            System.out.print("Nilai Alur Cerita :");
            Alur = input.nextDouble();
            System.out.print("Nilai Konten :");
            Konten = input.nextDouble();
            System.out.print("Nilai Kreativitas :");
            KreativitasAnimasi = input.nextDouble();
            System.out.print("Nilai Sinematografi :");
            Sinematografi = input.nextDouble();
            do {
                String Keterangan;
                System.out.println("");
                System.out.println("== Menu ==");
                System.out.println("\t 1. Tampil");
                System.out.println("\t 2. Edit");
                System.out.println("\t 3. Exit");
                System.out.print("Pilih :");
                menu = input.nextInt();
                System.out.println("");
                if (menu == 1) {
                    PesertaAnimasi peserta = new PesertaAnimasi(Alur, Konten, KreativitasAnimasi, Sinematografi);
                    System.out.println("\t Nilai Akhir : " + peserta.hasil());
                    if (peserta.hasil() <= 85) {
                        Keterangan = "Tim " + nama + " Dari Sekolah " + sekolah + " Tidak Lolos Seleksi Lomba Animasi";
                    } else {
                        Keterangan = "Selamat, Tim " + nama + " Dari Sekolah " + sekolah + " Lolos Seleksi Lomba Animasi";
                    }
                    System.out.println("\t Keterangan : " + Keterangan);
                } else if (menu == 2) {
                    System.out.println("== Form Penilaian ==");
                    System.out.print("Nilai Alur Cerita :");
                    Alur = input.nextDouble();
                    System.out.print("Nilai Konten :");
                    Konten = input.nextDouble();
                    System.out.print("Nilai Kreativitas :");
                    KreativitasAnimasi = input.nextDouble();
                    System.out.print("Nilai Sinematografi :");
                    Sinematografi = input.nextDouble();
                } else if (menu == 3) {
                    System.exit(1);
                } else {
                    System.out.println("Opsi tidak ada.Masukkan opsi dengan benar!");
                }
            } while (menu != 3);
        }
        if (kategori == 2) {
            double Struktur, Isi, KreativitasSurat, KaidahBahasa;
            System.out.println("== Form Pendaftaran ==");
            System.out.print("Input Nama : ");
            nama = input.next();
            System.out.print("Asal Sekolah : ");
            sekolah = input.next();
            System.out.println("");
            System.out.println("== Form Penilaian ==");
            System.out.print("Nilai Alur Cerita :");
            Struktur = input.nextDouble();
            System.out.print("Nilai Konten :");
            Isi = input.nextDouble();
            System.out.print("Nilai Kreativitas :");
            KreativitasSurat = input.nextDouble();
            System.out.print("Nilai Sinematografi :");
            KaidahBahasa = input.nextDouble();
            do {
                String Keterangan;
                System.out.println("");
                System.out.println("== Menu ==");
                System.out.println("\t 1. Tampil");
                System.out.println("\t 2. Edit");
                System.out.println("\t 3. Exit");
                System.out.print("Pilih :");
                menu = input.nextInt();
                System.out.println("");
                if (menu == 1) {
                    PesertaSurat peserta = new PesertaSurat(Struktur, Isi, KreativitasSurat, KaidahBahasa);
                    System.out.println("\t Nilai Akhir : " + peserta.hasil());
                    if (peserta.hasil() <= 85) {
                        Keterangan = "Tim " + nama + " Dari Sekolah " + sekolah + " Tidak Lolos Seleksi Lomba Menulis Surat";
                    } else {
                        Keterangan = "Selamat, Tim " + nama + " Dari Sekolah " + sekolah + " Lolos Seleksi Lomba Menulis Surat";
                    }
                    System.out.println("\t Keterangan : " + Keterangan);
                } else if (menu == 2) {
                    System.out.println("== Form Penilaian ==");
                    System.out.print("Nilai Struktur Surat:");
                    Struktur = input.nextDouble();
                    System.out.print("Nilai Isi Surat :");
                    Isi = input.nextDouble();
                    System.out.print("Nilai Kreativitas Surat:");
                    KreativitasSurat = input.nextDouble();
                    System.out.print("Nilai Kaidah Bahasa:");
                    KaidahBahasa = input.nextDouble();
                } else if (menu == 3) {
                    System.exit(1);
                } else {
                    System.out.println("Opsi tidak ada.Masukkan opsi dengan benar!");
                }
            } while (menu != 3);
        }
    }
}
