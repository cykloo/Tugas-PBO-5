import java.util.ArrayList;
import java.util.Scanner;

public class NotebookApp {
    private ArrayList<Note> notes = new ArrayList<>();

    public static void main(String[] args) {
        NotebookApp app = new NotebookApp();
        app.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Personal Notebook ===");
            System.out.println("1. Tambah Catatan");
            System.out.println("2. Lihat Semua Catatan");
            System.out.println("3. Cari Catatan");
            System.out.println("4. Hapus Catatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul catatan: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan isi catatan: ");
                    String content = scanner.nextLine();
                    notes.add(new Note(title, content));
                    System.out.println("Catatan berhasil ditambahkan!");
                    break;
                case 2:
                    if (notes.isEmpty()) {
                        System.out.println("Belum ada catatan.");
                    } else {
                        for (Note note : notes) {
                            System.out.println("- " + note.getTitle());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari Notebook. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
