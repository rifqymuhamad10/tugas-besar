import java.util.Scanner;

/**
 * Class Main untuk menjalankan aplikasi TodoList
 * 
 * PEMBAGIAN TUGAS:
 * - Main method & Menu: Person 3
 * - menuTambahTask: Person 4
 * - menuUpdateTask & menuHapusTask: Person 5
 */
public class Main {
    // ========================================
    // ATTRIBUTES (Static)
    // ========================================
    private static Scanner scanner = new Scanner(System.in);
    private static TodoListManager manager = new TodoListManager();
    
    
    // ========================================
    // SECTION 1: MAIN METHOD & CONTROL FLOW
    // Dikerjakan oleh: Person 3
    // ========================================
    
    /**
     * Main method - Entry point aplikasi
     * 
     * Algoritma:
     * 1. Buat variabel boolean running = true
     * 2. Loop selama running == true:
     *    a. Tampilkan menu (panggil tampilkanMenu())
     *    b. Input pilihan user (panggil inputPilihan())
     *    c. Switch case berdasarkan pilihan:
     *       - case 1: panggil menuTambahTask()
     *       - case 2: panggil manager.lihatSemuaTask()
     *       - case 3: panggil menuUpdateTask()
     *       - case 4: panggil menuHapusTask()
     *       - case 5: set running = false, print "Terima kasih!"
     *       - default: print "Pilihan tidak valid!"
     *    d. Jika masih running, print "Tekan Enter..." dan tunggu input
     * 3. Close scanner
     */
    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            tampilkanMenu();
            int pilihan = inputPilihan();
            
            switch (pilihan) {
                case 1:
                    menuTambahTask();
                    break;
                case 2:
                    manager.lihatSemuaTask();
                    break;
                case 3:
                    menuUpdateTask();
                    break;
                case 4:
                    menuHapusTask();
                    break;
                case 5:
                    running = false;
                    System.out.println("\nTerima kasih telah menggunakan aplikasi TodoList!");
                    break;
                default:
                    System.out.println("✗ Pilihan tidak valid!");
                    break;
            }
            
            if (running) {
                System.out.println("\nTekan Enter untuk melanjutkan...");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
    
    
    // ========================================
    // SECTION 2: MENU & INPUT UTILITIES
    // Dikerjakan oleh: Person 3
    // ========================================
    
    /**
     * Method untuk menampilkan menu utama
     * Pilih menu (1-5):
     */
    private static void tampilkanMenu() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║     APLIKASI TO DO LIST         ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("1. Tambah Task");
        System.out.println("2. Lihat Semua Task");
        System.out.println("3. Update/Edit Task");
        System.out.println("4. Hapus Task");
        System.out.println("5. Keluar");
        System.out.println();
        System.out.print("Pilih menu (1-5): ");
    }
    
    /**
     * Method untuk input pilihan dari user
     * @return int pilihan menu (1-5), atau -1 jika input invalid
     * 
     * Algoritma:
     * 1. Gunakan try-catch
     * 2. Di dalam try:
     *    - Baca integer dari scanner
     *    - Consume newline dengan scanner.nextLine()
     *    - Return integer
     * 3. Di catch:
     *    - Clear buffer dengan scanner.nextLine()
     *    - Return -1 (tanda input invalid)
     */
    private static int inputPilihan() {
        try {
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            return pilihan;
        } catch (Exception e) {
            scanner.nextLine(); // Clear buffer
            return -1;
        }
    }
    
    
    // ========================================
    // SECTION 3: FEATURE - ADD TASK
    // Dikerjakan oleh: Person 4
    // ========================================
    
    /**
     * Method untuk menu tambah task
     * 
     * Algoritma:
     * 1. Print "Masukkan nama task: "
     * 2. Baca input nama dari scanner (gunakan nextLine())
     * 3. Cek apakah nama tidak kosong (gunakan .trim().isEmpty())
     * 4. Jika tidak kosong:
     *    - Panggil manager.tambahTask(nama)
     * 5. Jika kosong:
     *    - Print "✗ Nama task tidak boleh kosong!"
     */
    private static void menuTambahTask() {
        System.out.print("\nMasukkan nama task: ");
        String nama = scanner.nextLine();
        
        if (!nama.trim().isEmpty()) {
            manager.tambahTask(nama);
        } else {
            System.out.println("✗ Nama task tidak boleh kosong!");
        }
    }
    
    
    // ========================================
    // SECTION 4: FEATURE - UPDATE TASK
    // Dikerjakan oleh: Person 5
    // ========================================
    
    /**
     * Method untuk menu update task
     */
    private static void menuUpdateTask() {
        System.out.println("\n--- UPDATE / EDIT TASK ---");
        manager.lihatSemuaTask();
        
        System.out.print("\nMasukkan ID task yang akan diedit (0 untuk batal): ");
        int id = inputPilihan(); // Pakai method aman ini

        if (id == 0) {
            System.out.println("Update dibatalkan.");
            return;
        } else if (id < 0) {
            System.out.println("✗ ID tidak valid!");
            return;
        }

        System.out.println("\nPilih aksi:");
        System.out.println("1. Edit nama task");
        System.out.println("2. Toggle status (Selesai/Belum)");
        System.out.print("Pilihan: ");
        
        int aksi = inputPilihan();

        if (aksi == 1) {
            System.out.print("Masukkan nama baru: ");
            String namaBaru = scanner.nextLine();
            if (!namaBaru.trim().isEmpty()) {
                manager.updateTask(id, namaBaru);
            } else {
                System.out.println("✗ Nama tidak boleh kosong!");
            }
        } else if (aksi == 2) {
            manager.toggleStatusTask(id);
        } else {
            System.out.println("✗ Pilihan aksi tidak valid!");
        }
    }
    
    
    // ========================================
    // SECTION 5: FEATURE - DELETE TASK
    // Dikerjakan oleh: Person 5
    // ========================================
    
    /**
     * Method untuk menu hapus task
     */
    private static void menuHapusTask() {
        System.out.println("\n--- HAPUS TASK ---");
        manager.lihatSemuaTask();
        
        System.out.print("\nMasukkan ID task yang akan dihapus (0 untuk batal): ");
        int id = inputPilihan();

        if (id == 0) {
            System.out.println("Penghapusan dibatalkan.");
            return;
        } else if (id < 0) {
            System.out.println("✗ ID tidak valid!");
            return;
        }
        
        // Konfirmasi keamanan
        System.out.print("Apakah Anda yakin ingin menghapus task ID " + id + "? (y/n): ");
        String konfirmasi = scanner.nextLine();
        
        if (konfirmasi.equalsIgnoreCase("y")) {
            manager.hapusTask(id);
        } else {
            System.out.println("Penghapusan dibatalkan.");
        }
    }
}