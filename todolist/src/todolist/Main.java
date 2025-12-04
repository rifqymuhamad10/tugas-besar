package todolist;

import java.util.ArrayList;
import java.util.Scanner;

// Class untuk model Task
class Task {
    private int id;
    private String nama;
    private boolean selesai;
    
    public Task(int id, String nama) {
        this.id = id;
        this.nama = nama;
        this.selesai = false;
    }
    
    // Getter dan Setter
    public int getId() {
        return id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public boolean isSelesai() {
        return selesai;
    }
    
    public void setSelesai(boolean selesai) {
        this.selesai = selesai;
    }
    
    @Override
    public String toString() {
        String status = selesai ? "[✓]" : "[ ]";
        return status + " " + id + ". " + nama;
    }
}

// Class untuk manage semua operasi TodoList
class TodoListManager {
    private ArrayList<Task> taskList;
    private int nextId;
    
    public TodoListManager() {
        this.taskList = new ArrayList<>();
        this.nextId = 1;
    }
    
    // Method untuk tambah task
    public void tambahTask(String nama) {
        Task taskBaru = new Task(nextId, nama);
        taskList.add(taskBaru);
        System.out.println("✓ Task berhasil ditambahkan!");
        nextId++;
    }
    
    // Method untuk lihat semua task
    public void lihatSemuaTask() {
        if (taskList.isEmpty()) {
            System.out.println("Belum ada task dalam list.");
            return;
        }
        
        System.out.println("\n=== DAFTAR TASK ===");
        for (Task task : taskList) {
            System.out.println(task);
        }
    }
    
    // Method untuk update task
    public void updateTask(int id, String namaBaru) {
        Task task = cariTaskById(id);
        if (task != null) {
            task.setNama(namaBaru);
            System.out.println("✓ Task berhasil diupdate!");
        } else {
            System.out.println("✗ Task dengan ID " + id + " tidak ditemukan!");
        }
    }
    
    // Method untuk toggle status task (selesai/belum)
    public void toggleStatusTask(int id) {
        Task task = cariTaskById(id);
        if (task != null) {
            task.setSelesai(!task.isSelesai());
            String status = task.isSelesai() ? "Selesai" : "Belum Selesai";
            System.out.println("✓ Status task diubah menjadi: " + status);
        } else {
            System.out.println("✗ Task dengan ID " + id + " tidak ditemukan!");
        }
    }
    
    // Method untuk hapus task
    public void hapusTask(int id) {
        Task task = cariTaskById(id);
        if (task != null) {
            taskList.remove(task);
            System.out.println("✓ Task berhasil dihapus!");
        } else {
            System.out.println("✗ Task dengan ID " + id + " tidak ditemukan!");
        }
    }
    
    // Helper method untuk cari task berdasarkan ID
    private Task cariTaskById(int id) {
        for (Task task : taskList) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }
}

// Class Main untuk menjalankan aplikasi
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static TodoListManager manager = new TodoListManager();
    
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
                    System.out.println("Terima kasih! Aplikasi ditutup.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            
            if (running) {
                System.out.println("\nTekan Enter untuk melanjutkan...");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
    
    // Method untuk tampilkan menu utama
    private static void tampilkanMenu() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║     APLIKASI TODO LIST         ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("1. Tambah Task");
        System.out.println("2. Lihat Semua Task");
        System.out.println("3. Update/Edit Task");
        System.out.println("4. Hapus Task");
        System.out.println("5. Keluar");
        System.out.print("\nPilih menu (1-5): ");
    }
    
    // Method untuk input pilihan menu
    private static int inputPilihan() {
        try {
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline
            return pilihan;
        } catch (Exception e) {
            scanner.nextLine(); // clear buffer
            return -1;
        }
    }
    
    // Method menu tambah task
    private static void menuTambahTask() {
        System.out.print("\nMasukkan nama task: ");
        String nama = scanner.nextLine();
        
        if (!nama.trim().isEmpty()) {
            manager.tambahTask(nama);
        } else {
            System.out.println("✗ Nama task tidak boleh kosong!");
        }
    }
    
    // Method menu update task
    private static void menuUpdateTask() {
        manager.lihatSemuaTask();
        
        System.out.println("\n1. Edit nama task");
        System.out.println("2. Toggle status (Selesai/Belum)");
        System.out.print("Pilih aksi: ");
        
        int aksi = inputPilihan();
        System.out.print("Masukkan ID task: ");
        int id = inputPilihan();
        
        if (aksi == 1) {
            System.out.print("Masukkan nama baru: ");
            String namaBaru = scanner.nextLine();
            manager.updateTask(id, namaBaru);
        } else if (aksi == 2) {
            manager.toggleStatusTask(id);
        } else {
            System.out.println("✗ Pilihan tidak valid!");
        }
    }
    
    // Method menu hapus task
    private static void menuHapusTask() {
        manager.lihatSemuaTask();
        
        System.out.print("\nMasukkan ID task yang akan dihapus: ");
        int id = inputPilihan();
        
        System.out.print("Yakin ingin menghapus? (y/n): ");
        String konfirmasi = scanner.nextLine();
        
        if (konfirmasi.equalsIgnoreCase("y")) {
            manager.hapusTask(id);
        } else {
            System.out.println("Penghapusan dibatalkan.");
        }
    }
}