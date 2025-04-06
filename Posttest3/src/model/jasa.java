package model;

public class jasa extends barang {
    private String idJasa;
    private int durasi;
    private String deskripsi; 

    public jasa(String idJasa, String nama, double harga, String deskripsi, int durasi) {
        super(nama, harga, 0);
        this.idJasa = idJasa;
        this.durasi = durasi;
    }

    public String getIdJasa() {
        return idJasa;
    }

    public void setIdJasa(String idJasa) {
        this.idJasa = idJasa;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    

    public String getNamaJasa() {
        return getNama();
    }

    public void setNamaJasa(String namaJasa) {
        setNama(namaJasa);
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public void tampilInfo() {
        System.out.println("ID Jasa: " + idJasa);
        super.tampilInfo();
        System.out.println("Durasi: " + durasi + " menit");
    }
}
