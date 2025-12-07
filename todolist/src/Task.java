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
        this.id = id;
        this.nama = nama;
        this.selesai = false;
    }
    
    
    // ========================================
    // SECTION 3: GETTER METHODS
    // ========================================
    
    /**
     * Getter untuk id
     * @return id task
     */
    public int getId() {
        return id;
    }
    
    /**
     * Getter untuk nama
     * @return nama task
     */
    public String getNama() {
        return nama;
    }
    
    /**
     * Getter untuk status selesai
     * @return true jika selesai, false jika belum
     */
    public boolean isSelesai() {
        return selesai;
    }
    
    
    // ========================================
    // SECTION 4: SETTER METHODS
    // ========================================
    
    /**
     * Setter untuk nama
     * @param nama - Nama baru untuk task
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    /**
     * Setter untuk status selesai
     * @param selesai - Status baru (true/false)
     */
    public void setSelesai(boolean selesai) {
        this.selesai = selesai;
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
        String status = selesai ? "[✓]" : "[ ]";
        return status + " " + id + ". " + nama;
    }
}