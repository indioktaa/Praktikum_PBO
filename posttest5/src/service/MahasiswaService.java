package service;

import model.mahasiswa;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaService {
    private List<mahasiswa> daftarmahasiswa = new ArrayList<>();
    
    public void tambahmahasiswa(mahasiswa mhs) {
        daftarmahasiswa.add(mhs);
    }
    
    public mahasiswa carimahasiswa(String email, String password) {
        for (mahasiswa mhs : daftarmahasiswa) {
            if (mhs.getEmail().equals(email) && mhs.autentikasi(password)) {
                return mhs;
            }
        }
        return null;
    }
    
    public void hapusmahasiswa(String nim) {
        daftarmahasiswa.removeIf(mhs -> mhs.getNim().equals(nim));
    }
    
    public void updatemahasiswa(String nim, String nama, String email, String noHp) {
        for (mahasiswa mhs : daftarmahasiswa) {
            if (mhs.getNim().equals(nim)) {
                mhs.setNama(nama);
                mhs.setEmail(email);
                mhs.setNoHp(noHp);
            }
        }
    }
    
    public void tampilkanmahasiswa() {
        for (mahasiswa mhs : daftarmahasiswa) {
            System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama() + ", Email: " + mhs.getEmail() + ", No HP: " + mhs.getNoHp());
        }
    }
}
