import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        int orijinalSayi = sayi;
        int toplam = 0;

        // Basamak sayısını bulma
        int basamakSayisi = String.valueOf(sayi).length();

        // Her bir basamağın kuvvetini hesaplama ve toplama
        while (sayi > 0) {
            int basamak = sayi % 10; // Son basamağı alır
            int kuvvetliBasamak = 1;
            for (int i = 0; i < basamakSayisi; i++) {
                kuvvetliBasamak *= basamak;
            }
            toplam += kuvvetliBasamak;
            sayi /= 10; // Sayıyı 10'a bölerek sonraki basamağa geçer
        }

        // Armstrong sayısı kontrolü
        if (toplam == orijinalSayi) {
            System.out.println(orijinalSayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(orijinalSayi + " bir Armstrong sayısı değildir.");
        }

        scanner.close();
    }
}
