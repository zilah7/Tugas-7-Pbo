package Array;
import java.util.ArrayList;
import java.util.ArrayDeque;

public class ContohArray {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> buah = new ArrayList<>();
        buah.add("Apel");
        buah.add("Jeruk");
        buah.add("Mangga");

        System.out.println("Isi ArrayList:");
        for (String b : buah) {
            System.out.println(b);
        }

        // ArrayDeque
        ArrayDeque<String> antrian = new ArrayDeque<>();
        antrian.add("Andi");
        antrian.add("Budi");
        antrian.add("Citra");

        System.out.println("\nIsi Antrian:");
        while (!antrian.isEmpty()) {
            System.out.println("Diproses: " + antrian.poll());
        }
    }
}