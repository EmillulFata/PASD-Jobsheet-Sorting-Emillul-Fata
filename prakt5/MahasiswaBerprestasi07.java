package prakt5;

public class MahasiswaBerprestasi07 {
  Mahasiswa07[] listMhs;
  int idx;

  MahasiswaBerprestasi07(int jumlah) {
    listMhs = new Mahasiswa07[jumlah];
  }

  void tambah(Mahasiswa07 m) {
    if (idx < listMhs.length) {
      listMhs[idx] = m;
      idx++;
    } else {
      System.out.println("Data sudah penuh!");
    }
  }

  void tampil() {
    for (int i = 0; i < idx; i++) {
      listMhs[i].tampilInformasi();
      System.out.println("-------------------");
    }
  }

  void bubbleSort() {
    for (int i = 0; i < listMhs.length - 1; i++) {
      for (int j = 1; j < listMhs.length - i; j++) {
        if (listMhs[j].ipk < listMhs[j - 1].ipk) {
          Mahasiswa07 tmp = listMhs[j];
          listMhs[j] = listMhs[j - 1];
          listMhs[j - 1] = tmp;
        }
      }
    }
  }

  void selectionSort() {
    for (int i = 0; i < listMhs.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < listMhs.length; j++) {
        if (listMhs[j].ipk < listMhs[min].ipk) {
          min = j;
        }
      }
      Mahasiswa07 tmp = listMhs[min];
      listMhs[min] = listMhs[i];
      listMhs[i] = tmp;
    }
  }

  void insertionSort() {
    for (int i = 1; i < idx; i++) {
      Mahasiswa07 temp = listMhs[i];
      int j = i;
      while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
        listMhs[j] = listMhs[j - 1];
        j--;
      }
      listMhs[j] = temp;
    }
  }
  //Sequential Search
   int sequentialSearch(double cari) {
    int posisi = -1;

    for (int i = 0; i < idx; i++) {
      if (listMhs[i].ipk == cari) {
        posisi = i;
        break; // berhenti saat ketemu pertama
      }
    }
    return posisi;
  }

  //Binary Search (HARUS data sudah di-sort ASC)
  int binarySearch(double cari, int left, int right) {
    if (right >= left) {
      int mid = (left + right) / 2;

      if (listMhs[mid].ipk == cari) {
        return mid;
      } else if (listMhs[mid].ipk > cari) {
        return binarySearch(cari, left, mid - 1);
      } else {
        return binarySearch(cari, mid + 1, right);
      }
    }
    return -1;
  }

  // ================= OUTPUT =================

  void tampilPosisi(double x, int pos) {
    if (pos != -1) {
      System.out.println("Data dengan IPK " + x + " ditemukan pada index " + pos);
    } else {
      System.out.println("Data dengan IPK " + x + " tidak ditemukan");
    }
  }

  void tampilDataSearch(double x, int pos) {
    if (pos != -1) {
      System.out.println("Data Mahasiswa:");
      listMhs[pos].tampilInformasi();
    } else {
      System.out.println("Data tidak ditemukan");
    }
  }
}
