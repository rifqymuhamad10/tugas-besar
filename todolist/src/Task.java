
/**
 * Class untuk model Task
 * Dikerjakan oleh: Person 1
 * 
 * Task ini merepresentasikan satu item tugas dalam TodoList
 * dengan atribut id, nama, dan status selesai
 */
public class Task {
    // ========================================
    // SECTION 1: ATTRIBUTES
    // ========================================
    private int id;           // ID unik untuk setiap task
    private String nama;      // Nama/deskripsi task
    private boolean selesai;  // Status task (true = selesai, false = belum)
    
    
    // ========================================
    // SECTION 2: CONSTRUCTOR
    // ========================================
    
    /**
     * Constructor Task
     * @param id - ID task
     * @param nama - Nama task
     * 
     * Inisialisasi:
     * - Set this.id = id
     * - Set this.nama = nama
     * - Set this.selesai = false (default belum selesai)
     */
    public Task(int id, String nama) {
        // TODO Person 1: Initialize semua attributes
    }
    
    
    // ========================================
    // SECTION 3: GETTER METHODS
    // ========================================
    
    /**
     * Getter untuk id
     * @return id task
     */
    public int getId() {
        // TODO Person 1: return id
        return 0; // temporary
    }
    
    /**
     * Getter untuk nama
     * @return nama task
     */
    public String getNama() {
        // TODO Person 1: return nama
        return null; // temporary
    }
    
    /**
     * Getter untuk status selesai
     * @return true jika selesai, false jika belum
     */
    public boolean isSelesai() {
        // TODO Person 1: return selesai
        return false; // temporary
    }
    
    
    // ========================================
    // SECTION 4: SETTER METHODS
    // ========================================
    
    /**
     * Setter untuk nama
     * @param nama - Nama baru untuk task
     */
    public void setNama(String nama) {
        // TODO Person 1: Set this.nama = nama
    }
    
    /**
     * Setter untuk status selesai
     * @param selesai - Status baru (true/false)
     */
    public void setSelesai(boolean selesai) {
        // TODO Person 1: Set this.selesai = selesai
    }
    
    
    // ========================================
    // SECTION 5: toString METHOD
    // ========================================
    
    /**
     * Override toString untuk format tampilan task
     * Format: [✓] 1. Nama Task (jika selesai)
     *         [ ] 1. Nama Task (jika belum selesai)
     * 
     * @return String representasi dari task
     * 
     * Algoritma:
     * 1. Buat variabel status:
     *    - Jika selesai = true, status = "[✓]"
     *    - Jika selesai = false, status = "[ ]"
     * 2. Return: status + " " + id + ". " + nama
     */
    @Override
    public String toString() {
        // TODO Person 1: Buat String status dengan ternary operator
        // TODO Person 1: Return format yang sesuai
        return null; // temporary
    }
}