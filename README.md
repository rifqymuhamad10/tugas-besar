# Aplikasi TodoList (Java, Console-Based)

Aplikasi TodoList ini adalah proyek berbasis Java yang dikembangkan untuk menerapkan konsep Pemrograman Berorientasi Objek (PBO). Program berjalan melalui console dan menyediakan fitur CRUD lengkap untuk mengelola daftar tugas. Struktur program dibagi menjadi tiga file utama: `Task.java`, `TodoListManager.java`, dan `Main.java`.

## Deskripsi Singkat

Aplikasi ini memungkinkan pengguna untuk:

* Menambahkan task baru
* Melihat seluruh task yang tersimpan
* Mengubah nama task atau mengubah statusnya (selesai/belum)
* Menghapus task dengan konfirmasi
* Menutup aplikasi dengan aman

Setiap fitur dibangun menggunakan pendekatan OOP yang terstruktur, dengan pembagian class berdasarkan Model, Logic Manager, dan UI Controller.

## Struktur Kode

### **1. Task.java (Model)**

File ini berfungsi sebagai representasi objek task.
Berisi atribut `id`, `nama`, dan `selesai`, lengkap dengan constructor, getter/setter, dan override `toString()` untuk tampilan yang lebih rapi.

### **2. TodoListManager.java (Logic)**

Berperan sebagai pusat operasi CRUD:

* Menyimpan seluruh task di dalam `ArrayList`
* Fitur tambah, lihat, update, toggle status, dan hapus task
* Memiliki helper method untuk mencari task berdasarkan ID

### **3. Main.java (User Interface)**

Mengatur alur utama aplikasi:

* Menampilkan menu
* Mengelola input user
* Menghubungkan UI ke `TodoListManager`
* Menyediakan fitur tambahan seperti multiple add dan validasi input

## Fitur Utama

* **Tambah Task** (support multiple add)
* **Lihat Semua Task** dengan format `[✓]` atau `[ ]`
* **Update Task** (edit nama atau toggle status)
* **Hapus Task** dengan konfirmasi keamanan
* **Input Validation** dan error handling untuk mencegah crash
* **Menu Console** dengan tampilan yang rapi (Unicode border)

## Testing

Seluruh fitur diuji melalui berbagai skenario:

* Input valid dan invalid
* List kosong maupun berisi
* Update dan toggle status
* Penghapusan dengan konfirmasi
* Penanganan input huruf pada field angka

Hasil: **10/10 test cases lulus** tanpa error.

## Konsep OOP yang Diterapkan

* **Encapsulation** — atribut private, akses via getter/setter
* **Class & Object Construction** — pemisahan model, logic, dan UI
* **Method Overriding** (`toString()`)
* **Collection Framework (ArrayList)**
* **Error Handling** (try–catch dan null checking)

## Struktur Proyek

```
todolist/
│
├── src/
│   ├── Task.java
│   ├── TodoListManager.java
│   └── Main.java
│
├── bin/                  (hasil compile)
└── README.md             (file ini)
```
## Kontributor

Proyek ini dikerjakan oleh tim beranggotakan lima orang, dengan pembagian tugas mulai dari pembuatan model, fitur CRUD, menu UI, hingga dokumentasi teknis.

## Status Proyek

**Selesai • Stabil • Siap Digunakan**
