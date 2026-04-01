package prakt5;

import java.util.Scanner;

public class MahasiswaMain07 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
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

    System.out.println("Data sebelum sorting:");
    list.tampil();

    System.out.println("Data setelah sorting Bubble Sort:");
    list.bubbleSort();
    list.tampil();

    System.out.println("Data setelah sorting Selection Sort:");
    list.selectionSort();
    list.tampil();

    System.out.println("Data setelah sorting Insertion Sort:");
    list.insertionSort();
    list.tampil();
  }
}
