package model;

public class jasa {
        public String idjasa;
        public String namajasa;
        public String deskripsi;
        public double harga;
        public int stok;
    
        public jasa(String idJasa, String namaJasa, String deskripsi, double harga, int stok) {
            this.idjasa = idJasa;
            this.namajasa = namaJasa;
            this.deskripsi = deskripsi;
            this.harga = harga;
            this.stok = stok;
        }
}
