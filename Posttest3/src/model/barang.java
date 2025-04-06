package model;

public class barang {
    protected String nama;
    protected double harga;
    protected int stok;
    protected String deskripsi

    public barang(String nama, double harga, int stok, String deskripsi) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok);
        System.out.println("Deskripsi Produk: " + deskripsi);
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
