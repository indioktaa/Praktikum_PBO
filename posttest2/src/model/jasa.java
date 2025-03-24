package model;

public class jasa {
    public String idJasa;
    String namaJasa;
    String deskripsi;
    protected double harga;
    public int stok;

    public jasa(String idJasa, String namaJasa, String deskripsi, double harga, int stok) {
        this.idJasa = idJasa;
        this.namaJasa = namaJasa;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.stok = stok;
    }

    public String getIdJasa() {
        return idJasa;
    }

    void setIdJasa(String idJasa) {
        this.idJasa = idJasa;
    }

    public String getNamaJasa() {  
        return namaJasa;
    }

    public void setNamaJasa(String namaJasa) {
        this.namaJasa = namaJasa;
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
