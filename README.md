# tugas-koding-2

## 1. _Project Overview_
 Java adalah salah satu bahasa pemrograman yang paling populer di dunia, digunakan dalam berbagai aplikasi, mulai dari pengembangan permainan hingga pembuatan aplikasi perusahaan. Proyek ini menyediakan panduan, tutorial, contoh kode, dan sumber daya lainnya untuk memahami bahasa Java 
 
## 2. _penjelasan program "tugas"_
### 2.1 _public class tugas_
  Dalam Java, kode public class digunakan untuk mendefinisikan kelas (class) yang dapat diakses dari luar kelas atau paket yang berbeda. Nama kelas harus sama dengan nama file Java, dan kelas ini akan berisi metode main yang akan dijalankan saat program dimulai.

### 2.2 _public static void main (String[] args)_
 adalah metode utama yang akan dieksekusi saat program dijalankan. Ini adalah titik masuk utama program Java. 
Parameter args adalah argumen baris perintah yang dapat diteruskan ke program.

### 2.3 _String Nama dan NPM_
  String dalam bahasa pemrograman Java digunakan untuk menyimpan urutan karakter atau teks, seperti "a,b,c". di sini saya mennggunakan untuk nama dan NPM.
  
### 2.4 _system.out.print_
  System.out.print() dalam bahasa pemrograman Java digunakan untuk mencetak output ke konsol atau terminal. dalam code yang saya buat akan mencetak nama "hendro  Paulus Limbong" dan dan npm jika angka lebih dari atau sama dengan 10

### 2.5 _perulangan for_
  Dalam perulangan for, akan mencetak variabel Untuk i dari 0 hingga 100: Jika i lebih besar dari atau sama dengan 10:Cetak nama
Selain itu:Cetak i. Ini akan mencetak angka dari 1 hingga 100 di layar.

### 2.6 _tipe data_
  Tipe data yang digunakan dalam program ini adalah int untuk variabel i, yang digunakan untuk menghitung angka dalam perulangan. 
Tipe data String digunakan untuk mencetak teks "Hendro Paulus Limbong."

## 3 _perulanganwhile_
  While bisa kita artikan selama. Cara kerja perulangan ini seperti percabangan, ia akan melakukan perulangan selama kondisinya bernilai true . 
Penjelasan: kondisi bisa kita isi dengan perbandingan maupun variabel boolean.
### 3.1 _penjelasan program "tugas2"_
 Program yang saya buat adalah program Java yang menggunakan perulangan while untuk mencetak bilangan ganjil atau genap sampai batas yang sudah kita tentukan 

#### a. _penjelasan lebih detail_

import java.util.Scanner; adalah pernyataan yang mengimpor kelas Scanner dari pustaka (library) Java java.util. Ini digunakan untuk menerima input dari pengguna.

public class perulanganwhile adalah deklarasi kelas yang diberi nama "tugas2" Kelas ini berisi metode main yang akan dieksekusi saat program dimulai.

Di dalam metode main, program pertama-tama membuat objek Scanner untuk menerima input dari pengguna dengan pernyataan Scanner scanner = new Scanner(System.in);.

Program kemudian mencetak pesan "Masukkan batas: " dan menggunakan scanner.nextInt(); untuk membaca angka yang dimasukkan oleh 
pengguna dan menyimpannya dalam variabel batas.

Variabel angka diinisialisasi dengan nilai 1. Ini adalah angka awal yang akan digunakan dalam perulangan.

Selama nilai angka kurang dari atau sama dengan batas, program masuk ke dalam perulangan while.

Di dalam perulangan, program memeriksa apakah angka adalah ganjil atau genap dengan menggunakan kondisi if (angka % 2 == 0). Jika benar, 
program mencetak nilai angka dengan System.out.println(angka);.

Setelah mencetak angka,  Tingkatkan nilai angka sebesar 1

Program yang saya buat hanya  akan mencetak nilai ganjil atau genap sesuai dengan batas yang kita buat 


## 4. _zodiac_ 
 Zodiac berasal dari bahasa latin yaitu zodiacus yang berarti lingkaran hewan. Karena hal itu, sebagian besar nama dan lambang zodiac
adalah hewan. Sedangkan, menurut Kamus Besar Bahasa Indonesia (KBBI) zodiac berarti lingkaran khayal di langit yang berpusat di ekliptika 
dan dibagi menjadi dua belas tanda perbintangan. Dan jika kita ingin membuat program yang dapat menghasilkan zodiac kita sesuai tanggal dan bulan lahir maka 

### 4.1 _penjelasan program zodiac_
Program yang saya buat adalah program Java yang dimana akan meminta kita memasukkan tanggal lahir dalam format "hari-bulan," dan
kemudian menentukan zodiak berdasarkan tanggal lahir tersebut. 

#### a. _penjelasan lebih detail
import java.util.Scanner; adalah pernyataan untuk mengimpor kelas Scanner dari pustaka (library) Java java.util. Ini digunakan untuk menerima input dari pengguna.

public class  adalah deklarasi kelas yang diberi nama "tugas3" Kelas ini berisi metode main yang akan dieksekusi saat program dimulai.

public static void main(String[] args): Ini adalah metode utama (main method) dari program Java. Program Java dimulai dari sini. Metode ini menerima array argumen string sebagai parameter, tetapi dalam kode ini, argumen tersebut tidak digunakan.

try (Scanner input = new Scanner(System.in)): Ini adalah blok try-with-resources, yang digunakan untuk mendeklarasikan dan menginisialisasi objek Scanner dengan sumber masukan dari System.in. Blok try-with-resources digunakan untuk memastikan bahwa objek Scanner akan ditutup secara otomatis setelah digunakan.

System.out.print("Masukkan tanggal lahir (1-31): ") dan System.out.print("Masukkan bulan lahir (1-12): "): Dua pernyataan ini digunakan untuk menampilkan pesan ke layar, meminta pengguna memasukkan tanggal lahir dan bulan lahir mereka.

int tanggalLahirInt = input.nextInt(): Ini adalah pernyataan yang digunakan untuk membaca input pengguna sebagai bilangan bulat dan menyimpannya dalam variabel tanggalLahirInt. Pengguna diminta untuk memasukkan tanggal lahir mereka dalam rentang 1 hingga 31.

int bulanLahirInt = input.nextInt(): Ini adalah pernyataan yang serupa dengan yang sebelumnya, tetapi kali ini digunakan untuk membaca input pengguna sebagai bilangan bulat dan menyimpannya dalam variabel bulanLahirInt. Pengguna diminta untuk memasukkan bulan lahir mereka dalam rentang 1 hingga 12. String input dipisahkan menjadi dua bagian (hari dan bulan) dengan menggunakan input.split("-");. Hasilnya disimpan dalam array parts.

Selanjutnya, ada serangkaian pernyataan if-else if yang digunakan untuk memeriksa bulan dan tanggal yang dimasukkan oleh pengguna dan menentukan zodiak berdasarkan aturan yang telah ditentukan. Misalnya, jika pengguna memasukkan bulan dan tanggal yang sesuai dengan kriteria Aquarius, maka variabel zodiac akan diatur sebagai "Aquarius". Hal ini dilakukan dengan membandingkan nilai bulanLahirInt dan tanggalLahirInt dengan tanggal-tanggal yang sesuai untuk masing-masing tanda zodiak.

Terakhir, program mencetak hasilnya dengan pernyataan System.out.println("Zodiac Anda adalah " + zodiac), di mana zodiac adalah hasil penentuan zodiak berdasarkan input pengguna

## 5. _tipedataarray_
Tipe data array adalah tipe data terstruktur yang merujuk kepada sebuah atau sekumpulan elemen yang mempunyai tipe data yang sama melalui indeks. 
Array disimpan dengan urutan yang sesuai dengan definisi indeks secara kontigu (berurutan) dalam memori komputer.

### 5.1 _penjelasan program tipe data array_
Program yang saya buat dalam tipe data array kali ini adalah program Java yang menggunakan tipe data array untuk menyimpan dan mencetak daftar nama. 

#### a. _penjelasan lebih detail_

package tugasliokusnata; adalah pernyataan yang menunjukkan paket (package) tempat kelas ini berada.

public class tipedataarray adalah deklarasi kelas utama (main class) dalam program. Ini adalah kelas yang berisi metode main yang akan dieksekusi saat program dimulai.

Di dalam metode main, program membuat array nama yang menyimpan daftar nama dalam bentuk string. Array ini diinisialisasi dengan empat nama.

Program menggunakan perulangan for untuk mengulang sebanyak panjang array nama (jumlah elemen dalam array). Variabel i digunakan sebagai penghitung indeks array.

Pada setiap iterasi perulangan, program mencetak pesan yang berisi nomor urut nama dan nama itu sendiri. "Nama ke-" + (i + 1) digunakan untuk mencetak nomor 
urut yang dimulai dari 1, dan nama[i] digunakan untuk mencetak nama yang sesuai dengan indeks saat ini.

Hasil cetakan akan menampilkan daftar nama beserta nomor urutnya.


## Daftra Pustaka

[1] [ahmad muhardian. 2016. https://www.petanikode.com/. Belajar Java: Memahami 2 Jenis Perulangan dalam Java. tersedia di:https://www.petanikode.com/java-perulangan/])

[2] [debbbyani nurinda. 2023. https://www.sonora.id/. Apa Itu Zodiak dan Macamnya Berdasarkan Bulan dan Tanggal Lahir. tersedia di : 
https://www.sonora.id/read/423804779/apa-itu-zodiak-dan-macamnya-berdasarkan-bulan-dan-tanggal-
lahir#:~:text=Zodiak%20berasal%20dari%20bahasa%20latin,menjadi%20dua%20belas%20tanda%20perbintangan.]

[3] [murhardian ahmad. 2016. https://www.petanikode.com/. Belajar Java: Menggunakan Array untuk Menyimpan Banyak Hal. tersedia di: https://www.petanikode.com/java-array/]
