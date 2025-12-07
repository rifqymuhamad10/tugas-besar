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
        taskList = new ArrayList<>();
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
        Task taskBaru = new Task(nextId, nama);
        taskList.add(taskBaru);
        System.out.println("✓ Task berhasil ditambahkan: " + nama);
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
        if (taskList.isEmpty()) {
            System.out.println("Belum ada task dalam list!");
            return;
        }
        
        System.out.println("=== DAFTAR TASK ===");
        for (Task t : taskList) {
            System.out.println(t.toString());
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
        Task t = cariTaskById(id);
        if (t != null) {
            t.setNama(namaBaru);
            System.out.println("✓ Task berhasil diupdate!");
        } else {
            System.out.println("✗ Task dengan ID tersebut tidak ditemukan.");
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
        Task t = cariTaskById(id);
        if (t != null) {
            t.setSelesai(!t.isSelesai());
            String status = t.isSelesai() ? "Selesai" : "Belum Selesai";
            System.out.println("✓ Status task berhasil diubah menjadi: " + status);
        } else {
            System.out.println("✗ Task tidak ditemukan.");
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
        Task t = cariTaskById(id);
        if (t != null) {
            taskList.remove(t);
            System.out.println("✓ Task berhasil dihapus!");
        } else {
            System.out.println("✗ Gagal menghapus: Task tidak ditemukan.");
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
        for (Task t : taskList) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
}