import java.util.Scanner;

public class TextAnalyzer {
    private static String text = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            displayMenu();
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline

            switch (choice) {
                case 1:
                    inputText(scanner);
                    break;
                case 2:
                    countCharacters();
                    break;
                case 3:
                    countWords();
                    break;
                case 4:
                    searchWord(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("=== MENU TEKS ANALYZER ===");
        System.out.println("1. Masukkan Teks");
        System.out.println("2. Hitung Jumlah Karakter");
        System.out.println("3. Hitung Jumlah Kata");
        System.out.println("4. Cari Kata dalam Teks");
        System.out.println("5. Keluar");
    }

    private static void inputText(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        text = scanner.nextLine();
        System.out.println("Teks telah dimasukkan!\n");
    }

    private static void countCharacters() {
        int charCount = text.length();
        System.out.println("Jumlah karakter dalam teks: " + charCount + "\n");
    }

    private static void countWords() {
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        System.out.println("Jumlah kata dalam teks: " + wordCount + "\n");
    }

    private static void searchWord(Scanner scanner) {
        System.out.print("Masukkan kata yang ingin dicari: ");
        String searchWord = scanner.nextLine();
        int wordFrequency = countWordFrequency(searchWord);
        System.out.println("Kata '" + searchWord + "' ditemukan sebanyak " + wordFrequency + " kali dalam teks.\n");
    }

    private static int countWordFrequency(String searchWord) {
        String[] words = text.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                count++;
            }
        }

        return count;
    }
}


//Laboratorium Informatika Universitas Muhammadiyah Malang merupakan salah satu bagian yang berdiri sebagai elemen krusial dalam Program Studi Informatika Universitas Muhammadiyah Malang dimana menjadi pijakan utama bagi berbagai kegiatan esensial, terutama praktikum. Aktivitas praktikum dilakukan antara asisten laboratorium dengan mahasiswa sebagai praktikan. Melalui kerjasama sinergis antara asisten laboratorium dan mahasiswa sebagai praktikan, setiap angkatan memiliki sejumlah asisten laboratorium yang akan melakukan asistensi terhadap praktikan angkatan setelahnya. Dengan semangat dan dedikasi yang mendalam, Laboratorium Informatika Universitas Muhammadiyah Malang terus menjadi wadah bagi pertumbuhan intelektual dan kolaborasi bermanfaat bagi masa depan bidang informatika yang cemerlang.
