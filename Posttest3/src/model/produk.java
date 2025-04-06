package model;

public class produk extends barang {
    private String idProduk;
    private String deskripsi;

    public produk(String idProduk, String nama, String deskripsi, double harga, int stok) {
        super(nama, harga, stok);
        this.idProduk = idProduk;
        this.deskripsi = deskripsi;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getNamaProduk() {
        return getNama();
    }

    public void setNamaProduk(String namaProduk) {
        setNama(namaProduk);
    }

    @Override
    public void tampilInfo() {
        System.out.println("ID Produk: " + idProduk);
        super.tampilInfo();
        System.out.println("Deskripsi: " + deskripsi);
    }
}
