package model;

public class produk {
    public String idproduk;
    public String namaproduk;
    public String deskripsi;
    public double harga;
    public int stok;

    public produk(String idProduk, String namaProduk, String deskripsi, double harga, int stok) {
        this.idproduk = idProduk;
        this.namaproduk = namaProduk;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.stok = stok;
    }
}
