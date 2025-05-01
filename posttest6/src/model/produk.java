package model;

public class produk extends barang implements discountable {
    private String idProduk;
    private String deskripsi;
    public static int totalProduk = 0;  // Variabel static untuk menghitung total produk

    public produk(String idProduk, String nama, String deskripsi, double harga, int stok) {
        super(idProduk, nama, harga, stok); // Gunakan idProduk sebagai id untuk superclass
        this.idProduk = idProduk;
        this.deskripsi = deskripsi;
        totalProduk++;  // Setiap kali objek produk dibuat, jumlah produk bertambah
    }

    // Implementasi method hitungDiskon dari interface Discountable
    @Override
    public double hitungDiskon(double harga, double persen) {
        return harga - (harga * persen / 100);  // Menghitung harga setelah diskon
    }

    // Static method untuk menampilkan total produk
    public static void tampilkanTotalProduk() {
        System.out.println("Total Produk: " + totalProduk);
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
