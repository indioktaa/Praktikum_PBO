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
    static mahasiswa loggedInMahasiswa = null;

    public static void main(String[] args) {
        mahasiswaService.tambahmahasiswa(new mahasiswa("2309106015", "okta@gmail.com", "081234888935", "Oktaria", "1234"));

        while (true) {
            if (loggedInMahasiswa == null) {
                tampilkanMenuAwal();
            } else {
                menuUtama();
            }
        }
    }

    static void tampilkanMenuAwal() {
        System.out.println("\n1. Login");
        System.out.println("2. Registrasi");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1 -> login();
            case 2 -> registrasi();
            case 3 -> {
                System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                System.exit(0);
            }
            default -> System.out.println("Pilihan tidak valid!");
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

        if (mahasiswaService.carimahasiswa(email, password) != null) {
            System.out.println("Email sudah terdaftar! Silakan gunakan email lain.");
            return;
        }

        mahasiswa mhsBaru = new mahasiswa(nim, nama, email, noHp, password);
        mahasiswaService.tambahmahasiswa(mhsBaru);
        System.out.println("Registrasi berhasil! Silakan login.");
    }

    static void login() {
        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();

        loggedInMahasiswa = mahasiswaService.carimahasiswa(email, password);
        if (loggedInMahasiswa == null) {
            System.out.println("Login gagal!");
        } else {
            System.out.println("Login berhasil! Selamat datang, " + loggedInMahasiswa.getNama());
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
            case 3 -> loggedInMahasiswa = null;
            default -> System.out.println("Pilihan tidak valid!");
        }
    }

    static void menuProduk() {
        while (true) {
            System.out.println("\nMenu Produk:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Produk");
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
                    double harga = inputAngkaDouble("Harga: ");
                    int stok = inputAngkaInt("Stok: ");

                    produkService.tambahProduk(new produk(id, nama, deskripsi, harga, stok));
                    System.out.println("Produk berhasil ditambahkan!");
                }
                case 2 -> produkService.tampilkanProduk();
                case 3 -> {
                    System.out.print("Masukkan ID Produk yang akan dihapus: ");
                    String id = scanner.nextLine();
                    produkService.hapusProduk(id);
                }
                case 4 -> {
                    System.out.print("Masukkan ID Produk yang akan diupdate: ");
                    String id = scanner.nextLine();
                    System.out.print("Nama Baru: ");
                    String nama = scanner.nextLine();
                    System.out.print("Deskripsi Baru: ");
                    String deskripsi = scanner.nextLine();
                    double harga = inputAngkaDouble("Harga Baru: ");
                    int stok = inputAngkaInt("Stok Baru: ");

                    produkService.updateProduk(id, nama, deskripsi, harga, stok);
                }
                case 5 -> {
                    return;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void menuJasa() {
        while (true) {
            System.out.println("\nMenu Jasa:");
            System.out.println("1. Tambah Jasa");
            System.out.println("2. Tampilkan Jasa");
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
                    double harga = inputAngkaDouble("Harga: ");
                    int durasi = inputAngkaInt("Durasi Jasa (dalam menit): ");

                    jasaService.tambahJasa(new jasa(id, nama, harga, deskripsi, durasi));
                    System.out.println("Jasa berhasil ditambahkan!");
                }
                case 2 -> jasaService.tampilkanJasa();
                case 3 -> {
                    System.out.print("Masukkan ID Jasa yang akan dihapus: ");
                    String id = scanner.nextLine();
                    jasaService.hapusJasa(id);
                }
                case 4 -> {
                    System.out.print("Masukkan ID Jasa yang akan diupdate: ");
                    String id = scanner.nextLine();
                    System.out.print("Nama Baru: ");
                    String nama = scanner.nextLine();
                    System.out.print("Deskripsi Baru: ");
                    String deskripsi = scanner.nextLine();
                    double harga = inputAngkaDouble("Harga Baru: ");
                    int durasi = inputAngkaInt("Durasi Baru (dalam menit): ");

                    jasaService.updateJasa(id, nama, deskripsi, harga, durasi);
                }
                case 5 -> {
                    return;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static double inputAngkaDouble(String prompt) {
        double input = -1;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                if (input > 0) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Input harus lebih besar dari 0!");
                }
            } else {
                System.out.println("Input tidak valid! Harap masukkan angka.");
                scanner.nextLine();
            }
        }
        return input;
    }

    public static int inputAngkaInt(String prompt) {
        int input = -1;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input > 0) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Input harus lebih besar dari 0!");
                }
            } else {
                System.out.println("Input tidak valid! Harap masukkan angka.");
                scanner.nextLine();
            }
        }
        return input;
    }
}
