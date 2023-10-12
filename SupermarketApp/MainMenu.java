/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adinda
 */

package SupermarketApp;

import atribut.Kasir;
import atribut.Produk;
import atribut.KeranjangBelanja;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final KeranjangBelanja keranjangBelanja = new KeranjangBelanja();
        final List<Produk> produkList = keranjangBelanja.tampilkanProduk();
        final List<Kasir> kasirList = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            System.out.println("===== MENU PILIHAN =====");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Produk");
            System.out.println("3. Edit Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("----------------------");
            System.out.println("5. Tambah Data Kasir");
            System.out.println("6. Tampilkan Data Kasir");
            System.out.println("7. Edit Data Kasir");
            System.out.println("8. Hapus Data Kasir");
            System.out.println("----------------------");
            System.out.println("9. Tambah ke Keranjang Belanja");
            System.out.println("10. Tampilkan Keranjang Belanja");
            System.out.println("----------------------");
            System.out.println("11. Keluar Program");
            System.out.println("=====================");

            System.out.print("Masukkan Pilihan Anda: ");
            final int mainMenuChoice = scanner.nextInt();

            switch (mainMenuChoice) {
                case 1 -> {
                    // Tambah Produk
                    System.out.println("\n ----------------------");
                    System.out.print("Nama Produk: ");
                    final String namaProduk = scanner.next();
                    System.out.print("Harga: ");
                    final double harga = scanner.nextDouble();
                    System.out.print("Stok: ");
                    final int stok = scanner.nextInt();

                    final Produk newProduk = new Produk(namaProduk, harga, stok);
                    keranjangBelanja.tambahProduk(newProduk);
                    System.out.println("-- Data Produk berhasil ditambahkan --\n");
                }
                    
                case 2 -> {
                    // Tampilkan Produk
                    for (int i = 0; i < produkList.size(); i++) {
                        final Produk produk = produkList.get(i);
                        System.out.println("\n ----------------------");
                        System.out.println("Index: " + i);
                        System.out.println("Nama: " + produk.getNama());
                        System.out.println("Harga: " + produk.getHarga());
                        System.out.println("Stok: " + produk.getStok());
                        System.out.println("---------------------- \n");
                    }
                }
                    
                case 3 -> {
                    // Edit Produk
                    System.out.println("\n ----------------------");
                    System.out.print("Indeks Produk yang akan diedit: ");
                    final int editIndex = scanner.nextInt();
                    if (editIndex >= 0 && editIndex < produkList.size()) {
                        System.out.print("Nama Produk Baru: ");
                        final String editedNamaProduk = scanner.next();
                        System.out.print("Harga Produk Baru: ");
                        final double editedHarga = scanner.nextDouble();
                        System.out.print("Stok Produk Baru: ");
                        final int editedStok = scanner.nextInt();

                        final Produk editedProduk = new Produk(editedNamaProduk, editedHarga, editedStok);
                        keranjangBelanja.editProduk(editIndex, editedProduk);
                        System.out.println("-- Data Produk berhasil di edit --");
                        System.out.println("\n");

                    } else {
                        System.out.println("!! Indeks tidak ditemukan !!");
                    }
                }

                case 4 -> {
                    // Hapus Produk
                    System.out.println("\n ----------------------");
                    System.out.print("Indeks Produk yang akan dihapus: ");
                    final int deleteIndex = scanner.nextInt();
                    if (deleteIndex >= 0 && deleteIndex < produkList.size()) {
                        keranjangBelanja.hapusProduk(deleteIndex);
                    } else {
                        System.out.println("Indeks tidak valid.");
                    }
                }
                    
                case 5 -> {
                    // Tambah Data Kasir
                    System.out.print("Nama Kasir: ");
                    final String namaKasir = scanner.next();
                    System.out.print("ID Kasir: ");
                    final int idKasir = scanner.nextInt();

                    final Kasir newKasir = new Kasir(namaKasir, idKasir);
                    kasirList.add(newKasir);
                    System.out.println("-- Data Kasir berhasil ditambahkan --");
                }
                    
                case 6 -> {
                    // Tampilkan Data Kasir
                    for (int i = 0; i < kasirList.size(); i++) {
                        final Kasir kasir = kasirList.get(i);
                        System.out.println("Index: " + i);
                        System.out.println("Nama Kasir: " + kasir.getNama());
                        System.out.println("ID Kasir: " + kasir.getId());
                        System.out.println("----------------------");
                    }
                }
                    
                case 7 -> {
                    // Edit Data Kasir
                    System.out.print("Indeks Kasir yang akan diedit: ");
                    final int editKasirIndex = scanner.nextInt();
                    if (editKasirIndex >= 0 && editKasirIndex < kasirList.size()) {
                        System.out.print("Nama Kasir Baru: ");
                        final String editedKasirNama = scanner.next();
                        System.out.print("ID Kasir Baru: ");
                        final int editedKasirID = scanner.nextInt();

                        final Kasir editedKasir = new Kasir(editedKasirNama, editedKasirID);
                        kasirList.set(editKasirIndex, editedKasir);
                        System.out.println("-- Data Kasir berhasil di edit --");
                    } else {
                        System.out.println("!! Indeks tidak valid !!");
                    }
                }
                    
                case 8 -> {
                    // Hapus Data Kasir
                    System.out.println("\n ----------------------");
                    System.out.print("Indeks Kasir yang akan dihapus: ");
                    final int deleteKasirIndex = scanner.nextInt();
                    if (deleteKasirIndex >= 0 && deleteKasirIndex < kasirList.size()) {
                        kasirList.remove(deleteKasirIndex);
                        System.out.println("-- Data Kasir berhasil dihapus --");
                    } else {
                        System.out.println("!! Indeks tidak valid !!");
                    }
                }
                    
                case 9 -> {
                    // Tambah ke Keranjang Belanja
                    System.out.print("Indeks Produk yang akan ditambahkan ke keranjang: ");
                    final int produkIndex = scanner.nextInt();
                    if (produkIndex >= 0 && produkIndex < produkList.size()) {
                        final Produk selectedProduk = produkList.get(produkIndex);
                        keranjangBelanja.tambahProduk(selectedProduk);
                    } else {
                        System.out.println("Indeks produk tidak valid.");
                    }
                }
                case 10 -> {
                    // Tampilkan Keranjang Belanja
                    final List<Produk> shoppingCart = keranjangBelanja.tampilkanProduk();
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        final Produk product = shoppingCart.get(i);
                        System.out.println("Index: " + i);
                        System.out.println("Nama: " + product.getNama());
                        System.out.println("Harga: " + product.getHarga());
                        System.out.println("Stok: " + product.getStok());
                        System.out.println("----------------------");
                    }
                }
                    
                case 11 -> exit = true;
                default -> System.out.println("Opsi tidak valid.");
            }
        }
    }
}