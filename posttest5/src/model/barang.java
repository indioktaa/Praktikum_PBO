package model;

public abstract class barang {  //kelas abstrak
    protected String nama;
    protected double harga;
    protected int stok;

    public final String id;  // Atribut final

    public barang(String id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public abstract void tampilInfo();  // Abstract method

    public final void updateData(double harga) {  // Method final
        this.harga = harga;
    }

    public void updateData(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void updateData(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
