package service;
import model.mahasiswa;
import java.util.ArrayList;

public class MahasiswaService {
    private ArrayList<mahasiswa> daftarmahasiswa = new ArrayList<>();

    public void tambahMahasiswa(mahasiswa m) {
        daftarmahasiswa.add(m);
    }

    public void tampilkanMahasiswa() {
        for (mahasiswa m : daftarmahasiswa) {
            System.out.println("NIM: " + m.nim + ", Nama: " + m.nama);
        }
    }

    public mahasiswa cariMahasiswa(String email, String password) {
        for (mahasiswa m : daftarmahasiswa) {
            if (m.login(email, password)) {
                return m;
            }
        }
        return null;
    }

    public void hapusmahasiswa(String nim) {
        daftarmahasiswa.removeIf(m -> m.nim.equals(nim));
    }
}
