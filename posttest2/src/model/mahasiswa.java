package model;

public class mahasiswa {
    private String nim;
    private String email;
    protected String noHp;
    public String nama;
    private String password;

    public mahasiswa(String nim, String email, String noHp, String nama, String password) {
        this.nim = nim;
        this.email = email;
        this.noHp = noHp;
        this.nama = nama;
        this.password = password;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {  // Ubah dari default ke public
        return email;
    }

    public void setEmail(String email) {  
        this.email = email;
    }

    public String getNoHp() {  // Ubah dari protected ke public
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public boolean autentikasi(String inputPassword) {  
        return this.password.equals(inputPassword);
    }
}
