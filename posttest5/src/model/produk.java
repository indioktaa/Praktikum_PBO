package model;

public class produk extends barang {
    private String idProduk;
    private String deskripsi;

    public produk(String idProduk, String nama, String deskripsi, double harga, int stok) {
        super(idProduk, nama, harga, stok); // Gunakan idProduk sebagai id untuk superclass
        this.idProduk = idProduk;
        this.deskripsi = deskripsi;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public String getNamaProduk() {
        return getNama(); // Delegasi ke method dari superclass
    }

    public void setNamaProduk(String nama) {
        setNama(nama); // Delegasi ke method dari superclass
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public void tampilInfo() {
        System.out.println("=== Informasi Produk ===");
        System.out.println("ID Produk   : " + idProduk);
        System.out.println("Nama Produk : " + getNamaProduk());
        System.out.println("Harga       : Rp" + getHarga());
        System.out.println("Stok        : " + getStok());
        System.out.println("Deskripsi   : " + deskripsi);
        System.out.println("========================");
    }
}
