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
 Program yang saya buat adalah program Java pengguna memasukkan sebuah batas tertentu, dan kemudian mencetak deret bilangan genap dan ganjil dari 1 hingga batas yang dimasukkan.
 
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

### 4.1 _penjelasan tugas3_
program Java yang memungkinkan pengguna untuk memasukkan tanggal lahir dan bulan lahir mereka dan kemudian menentukan tanda zodiak yang sesuai dengan tanggal dan bulan tersebut 

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
 Tipe data array adalah tipe data yang digunakan untuk menyimpan sejumlah elemen dengan tipe data yang sama di dalam satu variabel. Elemen-elemen ini disusun dalam urutan tertentu, dan setiap elemen dapat diakses dengan menggunakan indeksnya. Tipe data array umumnya disebut sebagai "array" dan merupakan struktur data yang fundamental dalam pemrograman.

### 5.1 _penjelasan program tugas4_
Program yang saya buat dalam tipe data array kali ini adalah program Java yang menggunakan tipe data array untuk menyimpan beberapa angka dan kemudian mencetak angka-angka tersebut ke layar. 

#### a. _penjelasan lebih detail_

import java.util.Scanner;: Ini adalah pernyataan impor yang digunakan untuk mengimpor kelas Scanner dari paket java.util, yang akan digunakan untuk membaca input dari pengguna.

public class tugas4 { ... }: Ini adalah deklarasi kelas Java dengan nama tugas4. Kode program Anda berada di dalam blok kelas ini.

public static void main(String[] args) { ... }: Ini adalah metode utama (main method) dari program Java. Program Java dimulai dari sini. Metode ini menerima array argumen string sebagai parameter, tetapi dalam kode ini, argumen tersebut tidak digunakan.

Scanner input = new Scanner(System.in);: Pada baris ini, Anda mendeklarasikan objek Scanner dengan nama input yang akan digunakan untuk membaca input dari pengguna melalui System.in. Namun, perhatikan bahwa dalam kode ini, Anda tidak benar-benar menggunakan objek input untuk membaca input apa pun, jadi ini sebenarnya tidak diperlukan.

int[] angka = {1, 2, 3, 4, 5};: Ini adalah deklarasi dan inisialisasi sebuah array integer dengan nama angka. Array ini berisi lima elemen dengan nilai 1, 2, 3, 4, dan 5.

for (int i = 0; i < angka.length; i++) { ... }: Ini adalah pernyataan loop for yang digunakan untuk melakukan iterasi melalui elemen-elemen dalam array angka. Loop ini akan mengulangi blok kode yang ada di dalamnya sebanyak lima kali, sesuai dengan panjang (length) dari array angka.
Hasil cetakan akan menampilkan daftar nama beserta nomor urutnya.

System.out.println(" Nilia Ke-" + ":" + angka[i]);: Dalam blok for, pernyataan ini digunakan untuk mencetak setiap elemen dari array angka ke layar. Masing-masing elemen akan dicetak dalam format "Nilai Ke-<indeks>: <nilai>" di mana <indeks> adalah indeks elemen dalam array dan <nilai> adalah nilai elemen itu sendiri.

## Daftar Pustaka

[1] [ahmad muhardian. 2016. https://www.petanikode.com/. Belajar Java: Memahami 2 Jenis Perulangan dalam Java. tersedia di:https://www.petanikode.com/java-perulangan/])

[2] [debbbyani nurinda. 2023. https://www.sonora.id/. Apa Itu Zodiak dan Macamnya Berdasarkan Bulan dan Tanggal Lahir. tersedia di : 
https://www.sonora.id/read/423804779/apa-itu-zodiak-dan-macamnya-berdasarkan-bulan-dan-tanggal-
lahir#:~:text=Zodiak%20berasal%20dari%20bahasa%20latin,menjadi%20dua%20belas%20tanda%20perbintangan.]

[3] [murhardian ahmad. 2016. https://www.petanikode.com/. Belajar Java: Menggunakan Array untuk Menyimpan Banyak Hal. tersedia di: https://www.petanikode.com/java-array/]
