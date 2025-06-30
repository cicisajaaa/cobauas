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
                 
                 switch (pilihan){
                     case 1: 
                         System.out.println("Masukkan Jumlah air (ml): ");
                         int jumlah = input.nextInt();
                         reminder.tambahAir(hariIni, jumlah);
                         break;
                     case 2: 
                         reminder.lihatProgress(hariIni);
                     case 3: 
                         input.nextLine();
                         try {
                             System.out.println("Masukkan tanggal (yyyy-mm-dd): ");
                             String tglInput = input.nextLine();
                             LocalDate tanggalLain = LocalDate.parse(tglInput);
                             System.out.println("Jumlah air (ml)");
                             int jml = input.nextInt();
                             reminder.tambahAir(tanggalLain, jml);
                         } catch (Exception e) {
                             System.out.println("Format tanggal salah! ");
                         }
                         break;
                     case 4: 
                         input.nextLine();
                         try { 
                             System.out.println("Masukkan tanggal yang ingin diedit : ");
                             String editTgl = input.nextLine();
                             LocalDate editTanggal = LocalDate.parse(editTgl);
                             System.out.println("Jumlah air baru (ml) : ");
                             int baru = input.nextInt();
                             reminder.editAir(editTanggal, baru);
                         } catch (Exception e){
                             System.out.println("Format tanggal salah! ");
                         }
                         break;
                     case 5:
                         reminder.lihatRiwayat();
                         break;
                     case 0:
                         System.out.println("Terimakasih sudah menggunakan aplikasi Pengingat Minum Air Sederhana.");
                         break;
                     default:
                         System.out.println("Pilihan tidak tersedia.");
                 }
             }
         } catch (Exception e){
             System.out.println("Input tidak valid.");
         } finally {
            input.close();
        }
    }
}
