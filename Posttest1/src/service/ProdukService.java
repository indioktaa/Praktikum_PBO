package service;

import model.produk;
import java.util.ArrayList;

public class ProdukService {
    private ArrayList<produk> daftarproduk = new ArrayList<>();

    public void tambahProduk(produk p) {
        daftarproduk.add(p);
    }

    public void tampilkanProduk() {
        for (produk p : daftarproduk) {
            System.out.println("ID: " + p.idproduk + ", Nama: " + p.namaproduk + ", Harga: " + p.harga);
        }
    }

    public void hapusProduk(String idproduk) {
        daftarproduk.removeIf(p -> p.idproduk.equals(idproduk));
    }

    public void updateProduk(produk updatedProduk) {
        for (int i = 0; i < daftarproduk.size(); i++) {
            if (daftarproduk.get(i).idproduk.equals(updatedProduk.idproduk)) {
                daftarproduk.set(i, updatedProduk);
                System.out.println("Produk berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Produk tidak ditemukan!");
    }
}
