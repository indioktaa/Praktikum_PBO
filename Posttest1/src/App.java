import model.mahasiswa;
import model.produk;
import model.jasa;
import service.MahasiswaService;
import service.ProdukService;
import service.JasaService;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static MahasiswaService mahasiswaService = new MahasiswaService();
    static ProdukService produkService = new ProdukService();
    static JasaService jasaService = new JasaService();
    static mahasiswa LoggedInMahasiswa = null;

    public static void main(String[] args) {
        // Contoh data awal
        mahasiswaService.tambahMahasiswa(new mahasiswa("2309106015", "Oktaria", "okta@gmail.com", "081234888935", "1234"));

        while (true) {
            if (LoggedInMahasiswa == null) {
                System.out.println("\n1. Login");
                System.out.println("2. Registrasi");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine(); // konsumsi newline

                switch (pilihan) {
                    case 1 -> login();
                    case 2 -> registrasi();
                    case 3 -> {
                        System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                        System.exit(0);
                    }
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } else {
                menuUtama();
            }
        }
    }

    static void registrasi() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan No. HP: ");
        String noHp = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();

        if (mahasiswaService.cariMahasiswa(email, password) != null) {
            System.out.println("Email sudah terdaftar! Silakan gunakan email lain.");
            return;
        }

        mahasiswa mhsBaru = new mahasiswa(nim, nama, email, noHp, password);
        mahasiswaService.tambahMahasiswa(mhsBaru);
        System.out.println("Registrasi berhasil! Silakan login.");
    }

    static void login() {
        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();

        LoggedInMahasiswa = mahasiswaService.cariMahasiswa(email, password);
        if (LoggedInMahasiswa == null) {
            System.out.println("Login gagal!");
        } else {
            System.out.println("Login berhasil! Selamat datang, " + LoggedInMahasiswa.nama);
        }
    }

    static void menuUtama() {
        System.out.println("\nMenu Utama:");
        System.out.println("1. Kelola Produk");
        System.out.println("2. Kelola Jasa");
        System.out.println("3. Logout");
        System.out.print("Pilih menu: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1 -> menuProduk();
            case 2 -> menuJasa();
            case 3 -> LoggedInMahasiswa = null;
            default -> System.out.println("Pilihan tidak valid!");
        }
    }

    static void menuProduk() {
        System.out.println("\nMenu Produk:");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Lihat Produk");
        System.out.println("3. Hapus Produk");
        System.out.println("4. Update Produk");
        System.out.println("5. Kembali");
        System.out.print("Pilih menu: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1 -> {
                System.out.print("ID Produk: ");
                String id = scanner.nextLine();
                System.out.print("Nama Produk: ");
                String nama = scanner.nextLine();
                System.out.print("Deskripsi: ");
                String deskripsi = scanner.nextLine();
                System.out.print("Harga: ");
                double harga = scanner.nextDouble();
                System.out.print("Stok: ");
                int stok = scanner.nextInt();
                scanner.nextLine();

                produkService.tambahProduk(new produk(id, nama, deskripsi, harga, stok));
            }
            case 2 -> produkService.tampilkanProduk();
            case 3 -> {
                System.out.print("Masukkan ID Produk yang ingin dihapus: ");
                String id = scanner.nextLine();
                produkService.hapusProduk(id);
            }
            case 4 -> {
                System.out.print("Masukkan ID Produk yang ingin diupdate: ");
                String id = scanner.nextLine();
                System.out.print("Nama Produk baru: ");
                String nama = scanner.nextLine();
                System.out.print("Deskripsi baru: ");
                String deskripsi = scanner.nextLine();
                System.out.print("Harga baru: ");
                double harga = scanner.nextDouble();
                System.out.print("Stok baru: ");
                int stok = scanner.nextInt();
                scanner.nextLine();
                
                produkService.updateProduk(new produk(id, nama, deskripsi, harga, stok));
            }
            case 5 -> menuUtama();
            default -> System.out.println("Pilihan tidak valid!");
        }
    }

    static void menuJasa() {
        System.out.println("\nMenu Jasa:");
        System.out.println("1. Tambah Jasa");
        System.out.println("2. Lihat Jasa");
        System.out.println("3. Hapus Jasa");
        System.out.println("4. Update Jasa");
        System.out.println("5. Kembali");
        System.out.print("Pilih menu: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1 -> {
                System.out.print("ID Jasa: ");
                String id = scanner.nextLine();
                System.out.print("Nama Jasa: ");
                String nama = scanner.nextLine();
                System.out.print("Deskripsi: ");
                String deskripsi = scanner.nextLine();
                System.out.print("Harga: ");
                double harga = scanner.nextDouble();
                System.out.print("Stok: ");
                int stok = scanner.nextInt();
                scanner.nextLine();

                jasaService.tambahJasa(new jasa(id, nama, deskripsi, harga, stok));
            }
            case 2 -> jasaService.tampilkanJasa();
            case 3 -> {
                System.out.print("Masukkan ID Jasa yang ingin dihapus: ");
                String id = scanner.nextLine();
                jasaService.hapusJasa(id);
            }
            case 4 -> {
                System.out.print("Masukkan ID Jasa yang ingin diupdate: ");
                String id = scanner.nextLine();
                System.out.print("Nama Jasa baru: ");
                String nama = scanner.nextLine();
                System.out.print("Deskripsi baru: ");
                String deskripsi = scanner.nextLine();
                System.out.print("Harga baru: ");
                double harga = scanner.nextDouble();
                System.out.print("Stok baru: ");
                int stok = scanner.nextInt();
                scanner.nextLine();
                
                jasaService.updateJasa(new jasa(id, nama, deskripsi, harga, stok));
            }
            case 5 -> menuUtama();
            default -> System.out.println("Pilihan tidak valid!");
        }
    }
}
