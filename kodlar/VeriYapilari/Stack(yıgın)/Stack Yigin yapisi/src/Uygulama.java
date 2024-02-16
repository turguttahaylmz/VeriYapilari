import java.util.Scanner;
public class Uygulama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("stack yapısına kaç eleman girmek istersiniz ");
        int n = scanner.nextInt();
        StackYapisi liste = new StackYapisi(n);
        int secim = -1, sayi;
        while (secim != 0) {
            System.out.println("1- Ekle");
            System.out.println("2- Çıkar");
            System.out.println("3- En üstteki elemanı göster");
            System.out.println("4- Tüm elemanları yazdır");
            System.out.println("0 - Çıkış ");
            System.out.print("seçiminiz: ");
            secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("sayı: ");
                    sayi = scanner.nextInt();
                    liste.push(sayi);
                    break;
                case 2:
                    liste.pop();
                    break;
                case 3:
                    liste.topGoster();
                    break;
                case 4:
                    liste.print();
                    break;
                case 0:
                    System.out.println("çıkış yaptınız ");
                    break;
                default:
                    System.out.println("hatalı seçim [0-4] ");
                    break;
            }
        }
    }
}