/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atribut;

/**
 *
 * @author adinda
 */

import java.util.ArrayList;
import java.util.List;

public final class KeranjangBelanja {
    private final List<Produk> produkList;

    public KeranjangBelanja() {
        produkList = new ArrayList<>();
    }

    public void tambahProduk(final Produk produk) {
        produkList.add(produk);
    }

    public void editProduk(final int index, final Produk produk) {
        if (index >= 0 && index < produkList.size()) {
            produkList.set(index, produk);
        }
    }

    public void hapusProduk(final int index) {
        if (index >= 0 && index < produkList.size()) {
            produkList.remove(index);
        }
    }

    public List<Produk> tampilkanProduk() {
        return produkList;
    }
}

