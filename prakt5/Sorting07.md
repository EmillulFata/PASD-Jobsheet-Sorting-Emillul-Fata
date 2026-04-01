Soal: 
1. Jelaskan fungsi kode program berikut temp = data[j]; data[j] = data[j - 1]; data[j - 1] = temp; 
2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort! 
3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan while (j > 0 && data[j] > temp) 
4. Pada Insertion sort, apakah tujuan dari perintah data[j+1] = data[j];

Jawab:
1. Untuk menukar posisi dua elemen agar urutan menjadi benar (misalnya dari kecil ke besar).
2. int min = i;
for (int j = i + 1; j < JumData; j++) {
    if (data[j] < data[min]) {
        min = j;
    }
}
3. Perulangan akan berjalan selama:
   j > 0 → belum sampai awal array
   data[j] > temp → nilai di kiri lebih besar dari yang mau dimasukkan
4. Menggeser elemen ke kanan
Penjelasan:
Nilai di index j dipindah ke j+1, Digunakan saat menyisipkan (insertion)
Tujuan utama:
Memberi ruang untuk temp, Membentuk urutan yang benar