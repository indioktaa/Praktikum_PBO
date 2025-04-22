package service;

import model.produk;
import java.util.ArrayList;
import java.util.List;

public class ProdukService {
    private List<produk> daftarproduk = new ArrayList<>();

    public void tambahProduk(produk p) {
        daftarproduk.add(p);
    }

    public void tampilkanProduk() {
        for (produk p : daftarproduk) {
            System.out.println("ID: " + p.getIdProduk() + " Nama: " + p.getNamaProduk() + " Harga: " + p.getHarga() + " Deskripsi: " + p.getDeskripsi() + " Stok: " + p.getStok());
        }
    }

    public void hapusProduk(String idProduk) {
        daftarproduk.removeIf(p -> p.getIdProduk().equals(idProduk));
    }

    public void updateProduk(String idProduk, String nama, String deskripsi, double harga, int stok) {
        for (produk p : daftarproduk) {
            if (p.getIdProduk().equals(idProduk)) {
                p.setNamaProduk(nama);
                p.setDeskripsi(deskripsi);
                p.setHarga(harga);
                p.setStok(stok);
                System.out.println("Produk berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Produk tidak ditemukan!");
    }
}
