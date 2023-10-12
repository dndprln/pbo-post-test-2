# pbo-post-test-2
Project untuk Tugas Posttest 2 PBO (Pemrograman Berorientasi Objek) - Sistem Informasi A 2022

SOURCE CODE

1. Package dan Import

Ini adalah bagian deklarasi package dan impor. Ini mengatur paket tempat kelas MainMenu berada dan mengimpor kelas-kelas dan pustaka yang diperlukan untuk program.

2. Deklarasi Variabel dan Objek

Ini adalah deklarasi variabel dan objek yang akan digunakan dalam program. Scanner digunakan untuk menerima input pengguna, keranjangBelanja untuk mengelola keranjang belanja, produkList untuk menampilkan daftar produk, dan kasirList untuk menyimpan data kasir.

3. Menu Utama dan Input Pengguna

loop utama program yang akan berjalan selama variabel exit bernilai false. Program akan menampilkan menu pilihan kepada pengguna dalam loop ini.

4. Pilihan Menu

Program akan meminta pengguna memasukkan nomor pilihan menu, dan pilihan ini disimpan dalam variabel mainMenuChoice.

5. Switch Statement:


Ini adalah pernyataan switch yang akan mengeksekusi kode berdasarkan nilai yang dimasukkan oleh pengguna di mainMenuChoice.

6. Case Statements:
Setiap pilihan dalam menu memiliki blok kode yang sesuai dalam switch. Contoh, "Case 1" digunakan untuk menambahkan produk ke keranjang belanja:


Pada setiap kasus, program akan menjalankan kode yang sesuai dengan pilihan pengguna. Kode ini meliputi pengambilan input, operasi yang sesuai, dan umpan balik kepada pengguna.

7. Loop Exit Condition:

Pilihan 11 adalah untuk keluar dari program. Jika pengguna memilih ini, variabel exit diubah menjadi true, dan program keluar dari loop utama.

8. Default Case:

Ini adalah bagian yang akan dijalankan jika pengguna memasukkan pilihan yang tidak valid. Program akan mencetak pesan "Opsi tidak valid."
