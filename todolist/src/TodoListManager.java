
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
        taskList = new ArrayList<>();
        // TODO Person 2A: Set nextId = 1
        nextId = 1;
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
        Task taskBaru = new Task(nextId, nama);
        // TODO Person 2B: Tambahkan ke taskList
        taskList.add(taskBaru);
        // TODO Person 2B: Print pesan "✓ Task berhasil ditambahkan!"
        Systen.out.println("✓ Task berhasil ditambahkan: " = nama);
        // TODO Person 2B: nextId++
        nextId++;
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
        if (taskList.isEmpty()) {
        // TODO Person 2B: Jika kosong, print pesan dan return
            System.out.println("Belum ada task dalam list!");
        } else {
        // TODO Person 2B: Print header
            System.out.println(=== DAFTAR TASK ===);
        // TODO Person 2B: Loop dan print semua task
            for (Task t : taskList) {
                System.out.println(t.toString());
            }
        }
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
        Task t = cariTaskById(id);
        // TODO Person 2C: Cek if task != null
        if (t != null) {
            t.setNama(namaBaru);
        // TODO Person 2C: Set nama baru dan print sukses
            System.out.println("Task berhasil diupdate!");
        // TODO Person 2C: Else print error
        } else {
            System.out.println("Task dengan ID tersebut tidak ditemukan.");
        }
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
        Task t = cariTaskById(id);
        // TODO Person 2C: Cek if task != null
            if (t != null) {
        // TODO Person 2C: Toggle status dengan !task.isSelesai()
                t.setCompleted(!t.isCompleted());
        // TODO Person 2C: Buat String status (gunakan ternary operator)
        // TODO Person 2C: Print pesan dengan status
                System.out.println("Status task berhasil diubah!");
            } else {
                System.out.println("Task tidak ditemukan.");
            }
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
        // TODO Person 2D: Panggil cariTaskById(id)
        Task t = cariTaskById(id);
        // TODO Person 2D: Cek if task != null
        if (t != null) {
        // TODO Person 2D: Remove task dari taskList
            taskList.remove(t);
        // TODO Person 2D: Print pesan sukses/error
            System.out.println("Task berhasil dihapus!");
        } else {
            System.out.println("Gagal menghapus: Task tidak ditemukan.");
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
        // TODO Person 2D: Loop taskList dengan for-each
        for (Task t : taskList) {
        // TODO Person 2D: Cek if task.getId() == id
            if (t.getId() == id) {
        // TODO Person 2D: Return task jika ketemu
                return t;
            }
        }
        // TODO Person 2D: Return null di akhir method
        return null; // Temporary return
    }
}
