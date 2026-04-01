package prakt5;

public class SortingMain07 {
  public static void main(String[] args) {
    int a[] = { 20, 10, 2, 7, 12 };
    int b[] = { 30, 20, 2, 8, 14 };
    int c[] = { 40, 10, 4, 9, 3 };

    Sorting07 dataurut1 = new Sorting07(a, a.length);
    Sorting07 dataurut2 = new Sorting07(b, b.length);
    Sorting07 dataurut3 = new Sorting07(c, c.length);

    System.out.println("Data Awal A:");
    dataurut1.tampil();
    dataurut1.bubbleSort();
    System.out.println("Setelah Bubble Sort:");
    dataurut1.tampil();
    System.out.println();

    System.out.println("Data Awal B:");
    dataurut2.tampil();
    dataurut2.selectionSort();
    System.out.println("Setelah Selection Sort:");
    dataurut2.tampil();
    System.out.println();
    
    System.out.println("Data Awal C:");
    dataurut3.tampil();
    dataurut3.insertionSort();
    System.out.println("Setelah Insertion Sort:");
    dataurut3.tampil();
    System.out.println();
  }
}