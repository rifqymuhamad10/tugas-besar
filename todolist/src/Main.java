

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
        // TODO Person 3: Buat variabel boolean running
        
        // TODO Person 3: Buat while loop
        
            // TODO Person 3: Panggil tampilkanMenu()
            
            // TODO Person 3: Panggil inputPilihan() dan simpan di variabel
            
            // TODO Person 3: Buat switch statement dengan 5 case
            
            
            // TODO Person 3: Jika masih running, tunggu Enter
        
        
        // TODO Person 3: Close scanner
    }
    
    
    // ========================================
    // SECTION 2: MENU & INPUT UTILITIES
    // Dikerjakan oleh: Person 3
    // ========================================
    
    /**
     * Method untuk menampilkan menu utama
     * 
     * Tampilan:
     * ╔════════════════════════════════╗
     * ║     APLIKASI TODO LIST         ║
     * ╚════════════════════════════════╝
     * 1. Tambah Task
     * 2. Lihat Semua Task
     * 3. Update/Edit Task
     * 4. Hapus Task
     * 5. Keluar
     * 
     * Pilih menu (1-5):
     */
    private static void tampilkanMenu() {
        // TODO Person 3: Print semua menu dengan format di atas
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
        // TODO Person 3: Implementasi dengan try-catch
        return -1; // temporary
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
        // TODO Person 4: Print prompt
        // TODO Person 4: Baca input nama
        // TODO Person 4: Validasi tidak kosong
        // TODO Person 4: Panggil manager.tambahTask() atau print error
    }
    
    
    // ========================================
    // SECTION 4: FEATURE - UPDATE TASK
    // Dikerjakan oleh: Person 5
    // ========================================
    
    /**
     * Method untuk menu update task
     * 
     * Algoritma:
     * 1. Tampilkan daftar task (panggil manager.lihatSemuaTask())
     * 2. Print pilihan aksi:
     *    - 1. Edit nama task
     *    - 2. Toggle status (Selesai/Belum)
     * 3. Input pilihan aksi
     * 4. Input ID task
     * 5. Switch berdasarkan aksi:
     *    - Jika aksi == 1:
     *      a. Input nama baru
     *      b. Panggil manager.updateTask(id, namaBaru)
     *    - Jika aksi == 2:
     *      a. Panggil manager.toggleStatusTask(id)
     *    - Else:
     *      a. Print "✗ Pilihan tidak valid!"
     */
    private static void menuUpdateTask() {
        // TODO Person 5: Tampilkan daftar task
        // TODO Person 5: Print menu pilihan aksi
        // TODO Person 5: Input aksi dan id
        // TODO Person 5: Buat if-else untuk handle aksi
    }
    
    
    // ========================================
    // SECTION 5: FEATURE - DELETE TASK
    // Dikerjakan oleh: Person 5
    // ========================================
    
    /**
     * Method untuk menu hapus task
     * 
     * Algoritma:
     * 1. Tampilkan daftar task (panggil manager.lihatSemuaTask())
     * 2. Print "Masukkan ID task yang akan dihapus: "
     * 3. Input ID task
     * 4. Print "Yakin ingin menghapus? (y/n): "
     * 5. Input konfirmasi
     * 6. Jika konfirmasi == "y" (case insensitive):
     *    - Panggil manager.hapusTask(id)
     * 7. Else:
     *    - Print "Penghapusan dibatalkan."
     */
    private static void menuHapusTask() {
        // TODO Person 5: Tampilkan daftar task
        // TODO Person 5: Input ID
        // TODO Person 5: Minta konfirmasi
        // TODO Person 5: Cek konfirmasi (gunakan .equalsIgnoreCase("y"))
        // TODO Person 5: Panggil hapusTask atau print pembatalan
    }
}