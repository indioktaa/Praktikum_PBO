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

    // ✅ Diubah agar mengembalikan boolean
    public boolean hapusProduk(String idProduk) {
        produk p = cariProduk(idProduk);
        if (p != null) {
            daftarproduk.remove(p);
            return true;
        }
        return false;
    }

    // ✅ Tambahkan ini
    public produk cariProduk(String idProduk) {
        for (produk p : daftarproduk) {
            if (p.getIdProduk().equals(idProduk)) {
                return p;
            }
        }
        return null;
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
