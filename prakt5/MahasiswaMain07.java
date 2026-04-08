package prakt5;

import java.util.Scanner;

public class MahasiswaMain07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int JumMhs = 5;

    System.out.print("Masukkan jumlah mahasiswa: ");
    int jumlah = sc.nextInt();
    sc.nextLine();
    MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07(jumlah);

    for (int i = 0; i < jumlah; i++) {
      System.out.println("Data mahasiswa ke-" + (i + 1));

      System.out.print("NIM   : ");
      String nim = sc.nextLine();

      System.out.print("Nama  : ");
      String nama = sc.nextLine();

      System.out.print("Kelas : ");
      String kelas = sc.nextLine();

      System.out.print("IPK   : ");
      String ipkStr = sc.nextLine().replace(",", ".");
      double ipk = Double.parseDouble(ipkStr);

      Mahasiswa07 m = new Mahasiswa07(nim, nama, kelas, ipk);
      list.tambah(m);
    }

    // ================= TAMPIL AWAL =================
    System.out.println("\nData sebelum sorting:");
    list.tampil();

    // ================= SORTING =================
    System.out.println("\nData setelah Bubble Sort (ASC):");
    list.bubbleSort();
    list.tampil();

    System.out.println("\nData setelah Selection Sort (ASC):");
    list.selectionSort();
    list.tampil();

    System.out.println("\nData setelah Insertion Sort (DESC):");
    list.insertionSort();
    list.tampil();

    // ================= SEARCHING =================
    System.out.print("\nMasukkan IPK yang dicari: ");
    double cari = sc.nextDouble();

    //Sequential Search
    System.out.println("\n=== Sequential Search ===");
    int posSeq = list.sequentialSearch(cari);
    list.tampilPosisi(cari, posSeq);
    list.tampilDataSearch(cari, posSeq);

    //Binary Search (HARUS ASC → pakai bubble sort lagi)
    list.bubbleSort(); // pastikan urut ASC

    System.out.println("\n=== Binary Search ===");
    int posBin = list.binarySearch(cari, 0, list.idx - 1);
    list.tampilPosisi(cari, posBin);
    list.tampilDataSearch(cari, posBin);
  }
}