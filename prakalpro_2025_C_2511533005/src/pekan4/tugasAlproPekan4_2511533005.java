package pekan4;
import java.util.Scanner;

public class tugasAlproPekan4_2511533005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hargaDasar = 50000;  
        double tambahanHari = 0, tambahanWaktu = 0, tambahanStudio = 0;
        double hargaPerTiket, subtotal, diskon = 0, total;
        String nama;
        int jumlah, hari, waktu, studio;

        System.out.println("=== SISTEM PEMBELIAN TIKET BIOSKOP ===");
        System.out.print("Nama Pembeli : ");
        nama = input.nextLine();
        System.out.print("Jumlah Tiket : ");
        jumlah = input.nextInt();
        System.out.print("Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
        hari = input.nextInt();
        System.out.print("Waktu Tayang (1=Pagi, 2=Siang, 3=Malam): ");
        waktu = input.nextInt();
        System.out.print("Jenis Studio (1=Regular, 2=Deluxe, 3=Premium): ");
        studio = input.nextInt();

        if (hari == 2) {
            tambahanHari = 0.10 * hargaDasar;  
        } else if (hari == 3) {
            tambahanHari = 0.30 * hargaDasar;  
        }
        if (waktu == 2) {
            tambahanWaktu = 0.10 * hargaDasar;  
        } else if (waktu == 3) {
            tambahanWaktu = 0.20 * hargaDasar;  
        }
        if (studio == 2) {
            tambahanStudio = 0.15 * hargaDasar;  
        } else if (studio == 3) {
            tambahanStudio = 0.30 * hargaDasar;  
        }
        hargaPerTiket = hargaDasar + tambahanHari + tambahanWaktu + tambahanStudio;
        subtotal = hargaPerTiket * jumlah;

        if (jumlah >= 5) {
            diskon = subtotal * 0.20; 
        }
        total = subtotal - diskon;
        System.out.println("\n===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.println("Nama Pembeli : " + nama);
        System.out.println("Jumlah Tiket : " + jumlah);

        String teksHari = (hari == 1) ? "Senin-Kamis" : (hari == 2) ? "Jumat" : "Sabtu-Minggu";
        String teksWaktu = (waktu == 1) ? "Pagi" : (waktu == 2) ? "Siang" : "Malam";
        String teksStudio = (studio == 1) ? "Regular" : (studio == 2) ? "Deluxe" : "Premium";

        System.out.println("Hari         : " + teksHari);
        System.out.println("Waktu Tayang : " + teksWaktu);
        System.out.println("Jenis Studio : " + teksStudio);
        System.out.println("-------------------------------------");
        System.out.println("Harga Dasar  : Rp " + (int)hargaDasar + "/tiket");
        System.out.println("Harga per Tiket : Rp " + (int)hargaPerTiket);
        System.out.println("Subtotal     : Rp " + (int)subtotal);
        System.out.println("Diskon       : Rp " + (int)diskon);
        System.out.println("-------------------------------------");
        System.out.println("TOTAL BAYAR  : Rp " + (int)total);
        System.out.println("=====================================");
        System.out.println("Terima kasih telah membeli tiket :)");
    }
}



