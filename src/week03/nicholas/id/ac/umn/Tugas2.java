package week03.nicholas.id.ac.umn;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int pilihan;

        // Input nama
        System.out.print("=== Program String Methods ===\n");
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        
        // Tampilkan menu
        System.out.println("\n==========================================");
        System.out.println("String: " + nama);
        System.out.println("==========================================");
        System.out.println("1. charAt        6. concat");
        System.out.println("2. length        7. replace"); 
        System.out.println("3. substring     8. split");
        System.out.println("4. substring2    9. toLowerCase");
        System.out.println("5. contains      10. toUpperCase");
        System.out.println("==========================================");
        
        System.out.print("Pilihan menu: ");
        pilihan = input.nextInt();
        input.nextLine(); // consume newline
        
        switch(pilihan) {
            case 1:
                System.out.println("\n>>> Method: charAt <<<");
                System.out.println("String: " + nama);
                System.out.print("Masukkan index: ");
                int idx = input.nextInt();
                char hasil1 = nama.charAt(idx);
                System.out.println("Output: " + hasil1);
                break;
                
            case 2:
                System.out.println("\n>>> Method: length <<<");
                System.out.println("String: " + nama);
                int panjang = nama.length();
                System.out.println("Output: " + panjang);
                break;
                
            case 3:
                System.out.println("\n>>> Method: substring(n) <<<");
                System.out.println("String: " + nama);
                System.out.print("Index mulai: ");
                int start = input.nextInt();
                String potong1 = nama.substring(start);
                System.out.println("Output: " + potong1);
                break;
                
            case 4:
                System.out.println("\n>>> Method: substring(m,n) <<<");
                System.out.println("String: " + nama);
                System.out.print("Index awal: ");
                int awal = input.nextInt();
                System.out.print("Index akhir: ");
                int akhir = input.nextInt();
                String potong2 = nama.substring(awal, akhir);
                System.out.println("Output: " + potong2);
                break;
                
            case 5:
                System.out.println("\n>>> Method: contains <<<");
                System.out.println("String: " + nama);
                System.out.print("Cari kata: ");
                String cari = input.nextLine();
                boolean ada = nama.contains(cari);
                System.out.println("Output: " + ada);
                break;
                
            case 6:
                System.out.println("\n>>> Method: concat <<<");
                System.out.println("String: " + nama);
                System.out.print("Tambah kata: ");
                String tambah = input.nextLine();
                String gabung = nama.concat(tambah);
                System.out.println("Output: " + gabung);
                break;
                
            case 7:
                System.out.println("\n>>> Method: replace <<<");
                System.out.println("String: " + nama);
                System.out.print("Kata lama: ");
                String lama = input.nextLine();
                System.out.print("Kata baru: ");
                String baru = input.nextLine();
                String ganti = nama.replace(lama, baru);
                System.out.println("Output: " + ganti);
                break;
                
            case 8:
                System.out.println("\n>>> Method: split <<<");
                System.out.println("String: " + nama);
                System.out.print("Pemisah: ");
                String pemisah = input.nextLine();
                String[] pecah = nama.split(pemisah);
                System.out.print("Output: ");
                for(int i = 0; i < pecah.length; i++) {
                    System.out.print("[" + pecah[i] + "] ");
                }
                System.out.println();
                break;
                
            case 9:
                System.out.println("\n>>> Method: toLowerCase <<<");
                System.out.println("String: " + nama);
                String kecil = nama.toLowerCase();
                System.out.println("Output: " + kecil);
                break;
                
            case 10:
                System.out.println("\n>>> Method: toUpperCase <<<");
                System.out.println("String: " + nama);
                String besar = nama.toUpperCase();
                System.out.println("Output: " + besar);
                break;
                
            default:
                System.out.println("Pilihan tidak tersedia!");
        }
        
        input.close();
        System.out.println("\nProgram selesai. Terima kasih!");
    }
}