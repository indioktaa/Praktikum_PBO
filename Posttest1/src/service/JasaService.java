package service;

import model.jasa;
import java.util.ArrayList;

public class JasaService {
    private ArrayList<jasa> daftarjasa = new ArrayList<>();

    public void tambahJasa(jasa j) {
        daftarjasa.add(j);
    }

    public void tampilkanJasa() {
        for (jasa j : daftarjasa) {
            System.out.println("ID: " + j.idjasa + ", Nama: " + j.namajasa + ", Harga: " + j.harga);
        }
    }

    public void hapusJasa(String idJasa) {
        daftarjasa.removeIf(j -> j.idjasa.equals(idJasa));
    }

    public void updateJasa(jasa updatedJasa) {
        for (int i = 0; i < daftarjasa.size(); i++) {
            if (daftarjasa.get(i).idjasa.equals(updatedJasa.idjasa)) {
                daftarjasa.set(i, updatedJasa);
                System.out.println("Jasa berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Jasa tidak ditemukan!");
    }
}
