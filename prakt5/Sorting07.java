package prakt5;

public class Sorting07 {
  int[] data;
  int JumData;

  // konstruktor
  public Sorting07(int dt[], int n) {
    data = dt;
    JumData = n;
  }

  // Bubble Sort
  void bubbleSort() {
    for (int i = 0; i < JumData - 1; i++) {
      for (int j = 0; j < JumData - i - 1; j++) {
        if (data[j] > data[j + 1]) {
          int temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
        }
      }
    }
  }

  // Selection Sort
  void selectionSort() {
    for (int i = 0; i < JumData - 1; i++) {
      int min = i;
      for (int j = i + 1; j < JumData; j++) {
        if (data[j] < data[min]) {
          min = j;
        }
      }
      int temp = data[min];
      data[min] = data[i];
      data[i] = temp;
    }
  }

  // Insertion Sort
  void insertionSort() {
    for (int i = 1; i < JumData; i++) {
      int temp = data[i];
      int j = i;
      while (j > 0 && data[j - 1] > temp) {
        data[j] = data[j - 1];
        j--;
      }
      data[j] = temp;
    }
  }

  // tampil data
  void tampil() {
    for (int i = 0; i < JumData; i++) {
      System.out.print(data[i] + " ");
    }
    System.out.println();
  }
}