package model;

public class mahasiswa {
    public String nim;
    public String nama;
    public String email;
    public String noHp;
    public String password;

    public mahasiswa(String nim, String nama, String email, String noHp, String password) {
        this.nim = nim;
        this.nama = nama;
        this.email = email;
        this.noHp = noHp;
        this.password = password;
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }
}