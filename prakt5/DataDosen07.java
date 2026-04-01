package prakt5;

public class DataDosen07 {
  Dosen07[] dataDosen = new Dosen07[10];
  int idx;

  void tambah(Dosen07 dsn) {
    if (idx < dataDosen.length) {
      dataDosen[idx] = dsn;
      idx++;
    } else {
      System.out.println("Data penuh!");
    }
  }

  void tampil() {
    for (int i = 0; i < idx; i++) {
      dataDosen[i].tampil();
    }
  }

  // Sorting ASC (termuda → tertua) - Bubble Sort
  void SortingASC() {
    for (int i = 0; i < idx - 1; i++) {
      for (int j = 0; j < idx - i - 1; j++) {
        if (dataDosen[j].usia > dataDosen[j + 1].usia) {
          Dosen07 tmp = dataDosen[j];
          dataDosen[j] = dataDosen[j + 1];
          dataDosen[j + 1] = tmp;
        }
      }
    }
  }

  // Sorting DSC (tertua → termuda) - Selection Sort
  void sortingDSC() {
    for (int i = 0; i < idx - 1; i++) {
      int max = i;
      for (int j = i + 1; j < idx; j++) {
        if (dataDosen[j].usia > dataDosen[max].usia) {
          max = j;
        }
      }
      Dosen07 tmp = dataDosen[max];
      dataDosen[max] = dataDosen[i];
      dataDosen[i] = tmp;
    }
  }

  // Insertion Sort (ASC)
  void insertionSort() {
    for (int i = 1; i < idx; i++) {
      Dosen07 temp = dataDosen[i];
      int j = i;
      while (j > 0 && dataDosen[j - 1].usia > temp.usia) {
        dataDosen[j] = dataDosen[j - 1];
        j--;
      }
      dataDosen[j] = temp;
    }
  }
}
