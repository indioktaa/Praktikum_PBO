package model;

public class jasa extends barang implements discountable {
    private String idJasa;
    private int durasi;
    private String deskripsi;
    public static int totalJasa = 0;  // Variabel static untuk menghitung total jasa

    public jasa(String idJasa, String nama, double harga, String deskripsi, int durasi) {
        super(idJasa, nama, harga, 0); // Stok = 0 karena jasa tidak memerlukan stok
        this.idJasa = idJasa;
        this.deskripsi = deskripsi;
        this.durasi = durasi;
        totalJasa++;  // Setiap kali objek jasa dibuat, jumlah jasa bertambah
    }

    // Implementasi method hitungDiskon dari interface Discountable
    @Override
    public double hitungDiskon(double harga, double persen) {
        return harga - (harga * persen / 100);  // Menghitung harga setelah diskon
    }

    // Static method untuk menampilkan total jasa
    public static void tampilkanTotalJasa() {
        System.out.println("Total Jasa: " + totalJasa);
    }

    public String getIdJasa() {
        return idJasa;
    }

    public void setIdJasa(String idJasa) {
        this.idJasa = idJasa;
    }

    public String getNamaJasa() {
        return getNama(); // Ambil nama dari superclass
    }

    public void setNamaJasa(String nama) {
        setNama(nama); // Ubah nama di superclass
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public void tampilInfo() {
        System.out.println("=== Informasi Jasa ===");
        System.out.println("ID Jasa     : " + idJasa);
        System.out.println("Nama Jasa   : " + getNamaJasa());
        System.out.println("Harga       : Rp" + getHarga());
        System.out.println("Durasi      : " + durasi + " menit");
        System.out.println("Deskripsi   : " + deskripsi);
        System.out.println("======================");
    }
}
