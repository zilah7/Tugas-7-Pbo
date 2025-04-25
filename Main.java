import model.*;
import service.*;
import util.DataWrapper;

public class Main {
    public static void main(String[] args) {
        // Buat buku dan mahasiswa
        Buku buku1 = new Buku("Pemrograman Java", "Budi");
        Buku buku2 = new Buku("Struktur Data", "Andi");

        Mahasiswa mhs = new Mahasiswa("Sari", "2020456");
        Petugas petugas = new Petugas("Pak Dedi", "P001");

        // Service perpustakaan
        PerpustakaanService service = new PerpustakaanService();
        service.tambahBuku(buku1);
        service.tambahBuku(buku2);
        service.tampilkanBuku();

        // Antrian peminjam
        AntrianPeminjam antrian = new AntrianPeminjam();
        antrian.tambah(mhs);
        antrian.tambah(petugas);

        System.out.println("\nMemproses antrian peminjam:");
        antrian.prosesAntrian();

        // Generic Wrapper
        DataWrapper<Buku> data = new DataWrapper<>(buku1);
        System.out.println("\nData dalam wrapper: " + data.get());
    }
}