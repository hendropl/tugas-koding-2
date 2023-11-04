import java.util.Scanner;


public class tugas3 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan tanggal lahir (1-31): ");
            int tanggalLahirInt = input.nextInt();
            System.out.print("Masukkan bulan lahir (1-12): ");
            int bulanLahirInt = input.nextInt();
   
             String zodiac = "";

              if ((bulanLahirInt== 1 && tanggalLahirInt >= 20) || (bulanLahirInt == 2 && tanggalLahirInt <= 18)) {
                zodiac = "Aquarius";
            } else if ((bulanLahirInt == 2 && tanggalLahirInt >= 19) || (bulanLahirInt == 3 && tanggalLahirInt <= 20)) {
                zodiac = "Pisces";
            } else if ((bulanLahirInt == 3 && tanggalLahirInt >= 21) || (bulanLahirInt == 4 && tanggalLahirInt <= 19)) {
                zodiac = "Aries";
            } else if ((bulanLahirInt == 4 && tanggalLahirInt >= 20) || (bulanLahirInt == 5 && tanggalLahirInt <= 20)) {
                zodiac = "Taurus";
            } else if ((bulanLahirInt == 5 && tanggalLahirInt >= 21) || (bulanLahirInt == 6 && tanggalLahirInt <= 20)) {
                zodiac = "Gemini";
            } else if ((bulanLahirInt == 6 && tanggalLahirInt >= 21) || (bulanLahirInt == 7 && tanggalLahirInt <= 22)) {
                zodiac = "Cancer";
            } else if ((bulanLahirInt == 7 && tanggalLahirInt >= 23) || (bulanLahirInt == 8 && tanggalLahirInt <= 22)) {
                zodiac = "Leo";
            } else if ((bulanLahirInt == 8 && tanggalLahirInt >= 23) || (bulanLahirInt == 9 && tanggalLahirInt <= 22)) {
                zodiac = "Virgo";
            } else if ((bulanLahirInt == 9 && tanggalLahirInt >= 23) || (bulanLahirInt == 10 && tanggalLahirInt <= 22)) {
                zodiac = "Libra";
            } else if ((bulanLahirInt == 10 && tanggalLahirInt >= 23) || (bulanLahirInt == 11 && tanggalLahirInt <= 21)) {
                zodiac = "Scorpio";
            } else if ((bulanLahirInt == 11 && tanggalLahirInt >= 22) || (bulanLahirInt == 12 && tanggalLahirInt <= 21)) {
                zodiac = "Sagittarius";
            } else if ((bulanLahirInt == 12 && tanggalLahirInt >= 22) || (bulanLahirInt == 1 && tanggalLahirInt <= 19)) {
                zodiac = "Capricorn";
            }
System.out.println("Zodiac Anda adalah " + zodiac);
        }
    }
}