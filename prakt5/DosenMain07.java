package prakt5;

import java.util.Scanner;

public class DosenMain07 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    DataDosen07 list = new DataDosen07();

    int pilih;

    do {
      System.out.println("\n===== MENU =====");
      System.out.println("1. Tambah Data");
      System.out.println("2. Tampil Data");
      System.out.println("3. Sorting ASC (Bubble Sort)");
      System.out.println("4. Sorting DSC (Selection Sort)");
      System.out.println("5. Exit");
      System.out.print("Pilih menu: ");
      pilih = sc.nextInt();
      sc.nextLine();

      switch (pilih) {
        case 1:
          System.out.print("Kode : ");
          String kode = sc.nextLine();

          System.out.print("Nama : ");
          String nama = sc.nextLine();

          // INPUT JENIS KELAMIN
          boolean jk;
          while (true) {
            System.out.print("Jenis Kelamin (Laki-laki/Perempuan): ");
            String jkInput = sc.nextLine();

            if (jkInput.equalsIgnoreCase("laki-laki")) {
              jk = true;
              break;
            } else if (jkInput.equalsIgnoreCase("perempuan")) {
              jk = false;
              break;
          }

          System.out.print("Usia : ");
          int usia = sc.nextInt();
          sc.nextLine();

          Dosen07 d = new Dosen07(kode, nama, jk, usia);
          list.tambah(d);
          break;

        case 2:
          list.tampil();
          break;

        case 3:
          list.SortingASC();
          System.out.println("Data berhasil diurutkan ASC");
          list.tampil();
          break;

        case 4:
          list.sortingDSC();
          System.out.println("Data berhasil diurutkan DSC");
          list.tampil();
          break;

        case 5:
          System.out.println("Terima kasih!");
          break;

        default:
          System.out.println("Pilihan tidak valid!");
      }

    } while (pilih != 5);
  }
}