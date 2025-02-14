
package rayya_java;
import java.util.Scanner;
public class minggu_7_dan_8 {
    
    public static void main(String[] args) {
       
    Scanner scanner = new Scanner(System.in);
        
        System.out.println("      CAFE CERIA        ");
        System.out.println("     ANEKA MINUMAN      ");
        System.out.println("------------------------");
        System.out.println("     SPECIAL MENU :     ");
        System.out.println("   1. Soft drinks       ");
        System.out.println("   2. Mix juice         ");
        System.out.println("   3. Nescafe           ");
        System.out.println("   4. Soda milk         ");
        System.out.println("   5. Tea               ");
        System.out.println("------------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        String nama = scanner.nextLine();
        
        System.out.print("Silahkan masukkan pilihan anda : ");
        int pilihan = scanner.nextInt();
        
        String menuminuman = "";
        switch (pilihan) {
            case 1:
                menuminuman = "Soft drinks";
                break;
            case 2:
                menuminuman = "Mix juice";
                break;
            case 3:
                menuminuman = "Nescafe";
                break;
            case 4:
                menuminuman = "Soda milk";
                break;
            case 5:
                menuminuman = "Tea";
                break;
            default:
                System.out.println("Maaf, pilihan tidak tersedia");
                return;
        }
        
        System.out.println("Minuman yang anda pesan adalah " + menuminuman);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
       
    }
}
    

   
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----------------------------------------");
        System.out.println("   Kharisma Agung Plaza ( KAP )");
        System.out.println("       Promo Belanja Berhadiah");
        System.out.println("  Khusus Pembelian 5 Barang Pertama");
        System.out.println("    Dengan harga minimum Rp 10000,00");
        System.out.println("----------------------------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Harga Barang ke-1 : ");
        int harga1 = scanner.nextInt();
        System.out.print("Masukkan Harga Barang ke-2 : ");
        int harga2 = scanner.nextInt();
        System.out.print("Masukkan Harga Barang ke-3 : ");
        int harga3 = scanner.nextInt();
        System.out.print("Masukkan Harga Barang ke-4 : ");
        int harga4 = scanner.nextInt();
        System.out.print("Masukkan Harga Barang ke-5 : ");
        int harga5 = scanner.nextInt();
        
        int total;
        total = harga1+harga2+harga3+harga4+harga5;
        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " + total);
        
        if (total >= 10000){
            System.out.println("\nSelamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        }
        
        System.out.println("----------------------------------------");
        System.out.println("           Terima Kasih");
        System.out.println(" Anda sudah belanja di Kharisma Agung Plaza");
        System.out.println("----------------------------------------");

    }
}
*/

