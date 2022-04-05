package Kuis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kategori, menu;
        String nama,sekolah;
        System.out.println("=== Lomba Apresiasi Pahlawan Wanita Indonesia ===");
        System.out.println("Kategori Lomba :");
        System.out.println("\t 1. Animasi");
        System.out.println("\t 2. Menulis Surat");
        System.out.print("Pilih Kategotri Lomba : ");
        kategori = input.nextInt();
        if(kategori == 1){
            double NAlur,NKonten, NKreativitas, NSinematografi;
            System.out.println("== Form Pendaftaran ==");
            System.out.print("Input Nama : ");
            nama = input.next();
            System.out.print("Asal Sekolah : ");
            sekolah = input.next();
            System.out.println("");
            System.out.println("== Form Penilaian ==");
            System.out.print("Nilai Alur Cerita :");
            NAlur = input.nextDouble();
            System.out.print("Nilai Konten :");
            NKonten = input.nextDouble();
            System.out.print("Nilai Kreativitas :");
            NKreativitas = input.nextDouble();
            System.out.print("Nilai Sinematografi :");
            NSinematografi = input.nextDouble();
            do{
                String Keterangan;
                System.out.println("");
                System.out.println("== Menu ==");
                System.out.println("\t 1. Tampil");
                System.out.println("\t 2. Edit");
                System.out.println("\t 3. Exit");
                System.out.print("Pilih :");
                menu = input.nextInt();
                System.out.println("");
                if(menu == 1){
                    PesertaLomba peserta = new PesertaLomba(NAlur, NKonten, NKreativitas, NSinematografi);
                    System.out.println("\t Nilai Akhir : " + peserta.HAnimasi);
                    if(peserta.HAnimasi <= 85){
                        Keterangan = "Tim " + nama + " Dari Sekolah " + sekolah + " Tidak Lolos Seleksi Lomba Animasi";
                    }
                    else{
                        Keterangan = "Selamat, Tim " + nama + " Dari Sekolah " + sekolah + " Lolos Seleksi Lomba Animasi";
                    }
                    System.out.println("Keterangan : " + Keterangan);
                }
                else if(menu == 2){
                    System.out.println("== Form Penilaian ==");
                    System.out.print("Nilai Alur Cerita :");
                    NAlur = input.nextDouble();
                    System.out.print("Nilai Konten :");
                    NKonten = input.nextDouble();
                    System.out.print("Nilai Kreativitas :");
                    NKreativitas = input.nextDouble();
                    System.out.print("Nilai Sinematografi :");
                    NSinematografi = input.nextDouble();
                }
                else if(menu == 3){
                    System.exit(1);
                }
                else{
                    System.out.println("Opsi tidak ada.Masukkan opsi dengan benar!");
                }
            }while (menu != 3);
        }
        if(kategori == 2){
            double NStruktur,NIsi, NKreativitas, NKaidah;
            System.out.println("== Form Pendaftaran ==");
            System.out.print("Input Nama : ");
            nama = input.next();
            System.out.print("Asal Sekolah : ");
            sekolah = input.next();
            System.out.println("");
            System.out.println("== Form Penilaian ==");
            System.out.print("Nilai Struktur :");
            NStruktur = input.nextDouble();
            System.out.print("Nilai Isi :");
            NIsi = input.nextDouble();
            System.out.print("Nilai Kreativitas :");
            NKreativitas = input.nextDouble();
            System.out.print("Nilai Kaidah :");
            NKaidah = input.nextDouble();
            do{
                String Keterangan;
                System.out.println("");
                System.out.println("== Menu ==");
                System.out.println("\t 1. Tampil");
                System.out.println("\t 2. Edit");
                System.out.println("\t 3. Exit");
                System.out.print("Pilih :");
                menu = input.nextInt();
                System.out.println("");
                if(menu == 1){
                    PesertaLomba peserta = new PesertaLomba(NStruktur,NIsi, NKreativitas, NKaidah);
                    System.out.println("\t Nilai Akhir : " + peserta.hasilAnimasi());
                    if(peserta.HAnimasi <= 85){
                        Keterangan = "Tim " + nama + " Dari Sekolah " + sekolah + " Tidak Lolos Seleksi Lomba Menulis Surat";
                    }
                    else{
                        Keterangan = "Selamat, Tim " + nama + " Dari Sekolah " + sekolah + " Lolos Seleksi Lomba Menulis Surat";
                    }
                    System.out.println("Keterangan : " + Keterangan);
                }
                else if(menu == 2){
                    System.out.print("Nilai Struktur :");
                    NStruktur = input.nextDouble();
                    System.out.print("Nilai Isi :");
                    NIsi = input.nextDouble();
                    System.out.print("Nilai Kreativitas :");
                    NKreativitas = input.nextDouble();
                    System.out.print("Nilai Kaidah :");
                    NKaidah = input.nextDouble();
                }
                else if(menu == 3){
                    System.exit(1);
                }
                else{
                    System.out.println("Opsi tidak ada.Masukkan opsi dengan benar!");
                }
            }while (menu != 3);
        }

    }
}
