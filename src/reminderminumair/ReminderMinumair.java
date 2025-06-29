package reminderminumair;

import java.time.LocalDate;
import java.util.Scanner;

public class ReminderMinumair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate hariIni = LocalDate.now();
        
        
        System.out.println("========================================");
        System.out.println(" APLIKASI PENGINGAT MINUM AIR SEDERHANA ");
        System.out.println("========================================");
         
        try {
             System.out.println("Masukkan nama anda: ");
             String nama = input.nextLine();
             
             System.out.println("Masukkan target minum harian (ml): ");
             int target = input.nextInt();
             
             WaterReminder reminder = new WaterReminder(nama, target);
             
             int pilihan = -1;
             while (pilihan != 0){
                 System.out.println("\n==== MENU ===");
                 System.out.println("1. Tambah Minum Hari ini");
                 System.out.println("2. Lihat Progress Hari ini");
                 System.out.println("3. Tambah minum pada tanggal lain");
                 System.out.println("4. Edit minum pada tanggal tertentu");
                 System.out.println("5. Lihat Riwayat Minum");
                 System.out.println("0. Keluar");
                 System.out.println("Pilihan :");
                 pilihan = input.nextInt();
             }
         }
    }
}
