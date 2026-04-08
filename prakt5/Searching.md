Soal Sequential
1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!
2. Jelaskan fungsi break pada kode program di bawah ini!
    if (listMhs[j].ipk == cari){
      posisi = j;
      break;
  }
3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan
   menampilkan data ke berapa? Jelaskan.
5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?

Jawab :
1. tampilPosisi
   Berfungsi untuk menampilkan posisi/index dari data yang ditemukan dalam array.
   tampilDataSearch
  Berfungsi untuk menampilkan isi data mahasiswa yang ditemukan (NIM, nama, kelas, IPK).
2. Fungsi break adalah:
   Menghentikan perulangan (loop) saat data sudah ditemukan
   Program tidak melanjutkan pencarian ke data berikutnya
3. Variabel pos digunakan untuk:
   Menyimpan index lokasi data yang ditemukan
   Menjadi acuan untuk:
   Menampilkan posisi (tampilPosisi)
   Mengambil data (listMhs[pos])
4. Jika ada lebih dari satu data yang sama, yang ditampilkan adalah data pertama yang ditemukan
5. Jika break dihapus
   a. Loop tetap berjalan sampai akhir
   b. posisi akan terus diperbarui
  Akibatnya yang tersimpan adalah data terakhir yang sama

Soal Binary Searching
1. Tunjukkan pada kode program yang mana proses divide dijalankan!
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
3. Apa fungsi left, right, dan mid?
4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?
5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2.
    Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai
6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array.
7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.

Jawab :
1. Proses divide (membagi data) terjadi saat menentukan nilai tengah:
    int mid = (left + right) / 2;
2. Proses conquer (menentukan arah pencarian) terjadi di bagian ini:
    if (listMhs[mid].ipk == cari) {
        return mid;
    } else if (listMhs[mid].ipk > cari) {
        return binarySearch(cari, left, mid - 1);   // ke kiri
    } else {
        return binarySearch(cari, mid + 1, right);  // ke kanan
    }
3. Fungsi left, right, dan mid
   Variabel	Fungsi
   left	batas kiri pencarian
   right	batas kanan pencarian
   mid	index tengah (pembagi array)
4. Program tetap berjalan, tapi hasilnya SALAH
    Binary Search wajib data terurut (ascending)
    Kalau tidak urut → pembagian kiri/kanan jadi tidak valid
5. Jika data urut dari besar ke kecil (DESC) Binary search tidak sesuai (bisa gagal menemukan) karena Algoritma default
   menganggap data ASC, modif done
6. Terjadi saat:
    if (right < left) {
        return -1;
    }
7. modif done 