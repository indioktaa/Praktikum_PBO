package service;

import model.jasa;
import java.util.ArrayList;
import java.util.List;

public class JasaService {
    private List<jasa> daftarJasa = new ArrayList<>();

    public void tambahJasa(jasa j) {
        daftarJasa.add(j);
    }

    public void tampilkanJasa() {
        for (jasa j : daftarJasa) {
            System.out.println("ID: " + j.getIdJasa() + ", Nama: " + j.getNamaJasa() + ", Harga: " + j.getHarga() + " Deskripsi: " + j.getDeskripsi() + " Durasi: " + j.getDurasi());
        }
    }

    public void hapusJasa(String idJasa) {
        daftarJasa.removeIf(j -> j.getIdJasa().equals(idJasa));
    }

    public void updateJasa(String idJasa, String nama, String deskripsi, double harga, int stok) {
        for (jasa j : daftarJasa) {
            if (j.getIdJasa().equals(idJasa)) {
                j.setNamaJasa(nama);
                j.setDeskripsi(deskripsi);
                j.setHarga(harga);
                j.setStok(stok);
                System.out.println("Jasa berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Jasa tidak ditemukan!");
    }
}
