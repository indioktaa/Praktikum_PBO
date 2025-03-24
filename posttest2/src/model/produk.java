package model;

public class produk {
    private String idProduk;
    private String namaProduk;
    private String deskripsi;
    private double harga;
    private int stok;

    public produk(String idProduk, String namaProduk, String deskripsi, double harga, int stok) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.stok = stok;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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
