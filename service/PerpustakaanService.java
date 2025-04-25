package service;

import model.Buku;
import java.util.ArrayList;

public class PerpustakaanService {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanBuku() {
        System.out.println("Daftar Buku:");
        for (Buku b : daftarBuku) {
            System.out.println("- " + b);
        }
    }
}