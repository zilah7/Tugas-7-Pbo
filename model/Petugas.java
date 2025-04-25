package model;

public class Petugas extends User {
    private String id;

    public Petugas(String nama, String id) {
        super(nama);
        this.id = id;
    }

    @Override
    public void info() {
        System.out.println("Petugas: " + nama + ", ID: " + id);
    }
}