import java.util.ArrayList;

/**
 * Class untuk manage semua operasi TodoList
 * 
 * PEMBAGIAN TUGAS:
 * - Constructor & Attributes: Person 2A
 * - Method tambahTask & lihatSemuaTask: Person 2B  
 * - Method updateTask & toggleStatusTask: Person 2C
 * - Method hapusTask & cariTaskById: Person 2D
 */
public class TodoListManager {
    // ========================================
    // SECTION 1: ATTRIBUTES & CONSTRUCTOR
    // Dikerjakan oleh: Person 2A
    // ========================================
    private ArrayList<Task> taskList;
    private int nextId;
    
    /**
     * Constructor TodoListManager
     * Inisialisasi ArrayList untuk menyimpan task
     * Set nextId = 1 sebagai ID awal
     */
    public TodoListManager() {
        // TODO Person 2A: Initialize taskList
        // TODO Person 2A: Set nextId = 1
    }
    
    
    // ========================================
    // SECTION 2: CREATE & READ OPERATIONS
    // Dikerjakan oleh: Person 2B
    // ========================================
    
    /**
     * Method untuk menambahkan task baru
     * @param nama - Nama task yang akan ditambahkan
     * 
     * Algoritma:
     * 1. Buat object Task baru dengan nextId dan nama
     * 2. Tambahkan ke taskList menggunakan .add()
     * 3. Tampilkan pesan sukses
     * 4. Increment nextId untuk task berikutnya
     */
    public void tambahTask(String nama) {
        // TODO Person 2B: Buat object Task baru
        // TODO Person 2B: Tambahkan ke taskList
        // TODO Person 2B: Print pesan "✓ Task berhasil ditambahkan!"
        // TODO Person 2B: nextId++
    }
    
    /**
     * Method untuk menampilkan semua task
     * 
     * Algoritma:
     * 1. Cek apakah taskList kosong (gunakan .isEmpty())
     * 2. Jika kosong, tampilkan pesan "Belum ada task dalam list."
     * 3. Jika tidak kosong:
     *    - Print header "=== DAFTAR TASK ==="
     *    - Loop semua task di taskList
     *    - Print setiap task (otomatis panggil toString())
     */
    public void lihatSemuaTask() {
        // TODO Person 2B: Cek if taskList.isEmpty()
        // TODO Person 2B: Jika kosong, print pesan dan return
        // TODO Person 2B: Print header
        // TODO Person 2B: Loop dan print semua task
    }
    
    
    // ========================================
    // SECTION 3: UPDATE OPERATIONS
    // Dikerjakan oleh: Person 2C
    // ========================================
    
    /**
     * Method untuk mengupdate nama task
     * @param id - ID task yang akan diupdate
     * @param namaBaru - Nama baru untuk task
     * 
     * Algoritma:
     * 1. Cari task berdasarkan id (gunakan cariTaskById)
     * 2. Jika task ditemukan (task != null):
     *    - Set nama baru dengan task.setNama()
     *    - Print pesan sukses
     * 3. Jika tidak ditemukan:
     *    - Print pesan error
     */
    public void updateTask(int id, String namaBaru) {
        // TODO Person 2C: Panggil cariTaskById(id)
        // TODO Person 2C: Cek if task != null
        // TODO Person 2C: Set nama baru dan print sukses
        // TODO Person 2C: Else print error
    }
    
    /**
     * Method untuk toggle status task (selesai/belum selesai)
     * @param id - ID task yang akan diubah statusnya
     * 
     * Algoritma:
     * 1. Cari task berdasarkan id
     * 2. Jika ditemukan:
     *    - Toggle status: task.setSelesai(!task.isSelesai())
     *    - Tentukan status text (Selesai/Belum Selesai)
     *    - Print pesan dengan status baru
     * 3. Jika tidak ditemukan:
     *    - Print pesan error
     */
    public void toggleStatusTask(int id) {
        // TODO Person 2C: Panggil cariTaskById(id)
        // TODO Person 2C: Cek if task != null
        // TODO Person 2C: Toggle status dengan !task.isSelesai()
        // TODO Person 2C: Buat String status (gunakan ternary operator)
        // TODO Person 2C: Print pesan dengan status
    }
    
    
    // ========================================
    // SECTION 4: DELETE & HELPER OPERATIONS
    // Dikerjakan oleh: Person 2D
    // ========================================
    
    /**
     * Method untuk menghapus task
     * @param id - ID task yang akan dihapus
     * 
     * Algoritma:
     * 1. Cari task berdasarkan id
     * 2. Jika ditemukan:
     *    - Hapus dari taskList menggunakan .remove()
     *    - Print pesan sukses
     * 3. Jika tidak ditemukan:
     *    - Print pesan error
     */
    public void hapusTask(int id) {
        Task task = cariTaskById(id);
        
        if (task != null) {
            taskList.remove(task);
            System.out.println("✓ Task berhasil dihapus!");
        } else {
            System.out.println("✗ Task dengan ID " + id + " tidak ditemukan!");
        }
    }
    
    /**
     * Helper method untuk mencari task berdasarkan ID
     * @param id - ID task yang dicari
     * @return Task object jika ditemukan, null jika tidak
     * 
     * Algoritma:
     * 1. Loop semua task di taskList
     * 2. Untuk setiap task, cek apakah task.getId() == id
     * 3. Jika cocok, return task tersebut
     * 4. Jika loop selesai dan tidak ada yang cocok, return null
     */
    private Task cariTaskById(int id) {
        for (Task task : taskList) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }
}