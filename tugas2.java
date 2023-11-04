import java.util.Scanner;

public class tugas2 {
     public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan batas: ");
            int batas = input.nextInt();
            
            int angka = 1;
            
            while (angka <= batas) {
                if (angka % 2 == 0) {
                    System.out.println(angka + " adalah bilangan genap.");
                } else {
                    System.out.println(angka + " adalah bilangan ganjil.");
                }
                
                angka++;
            }
        }
    }
}

