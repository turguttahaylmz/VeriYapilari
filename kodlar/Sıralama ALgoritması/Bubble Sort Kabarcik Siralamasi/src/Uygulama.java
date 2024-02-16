import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {
        // sıralama algoritmaları
        // bubble sort (Kabarcık sıralaması) // en büyük değeri bulup en sona doğru taşıyoruz
        // for ()
        // for ()
        // 75 132
        // 5 13 2 7
        // 132 57
        // 12 357
        // 12 357

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("kaç adet sayı girmek istersiniz : ");
        n = scanner.nextInt();
        int dizi[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("sayı : ");
            dizi[i] = scanner.nextInt();
        }
        bubbleSort(dizi, n);
        System.out.println("bubble sort ile sıralama işlemi yapıldı ");
    }

    private static void bubbleSort(int[] dizi, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }
    }

}