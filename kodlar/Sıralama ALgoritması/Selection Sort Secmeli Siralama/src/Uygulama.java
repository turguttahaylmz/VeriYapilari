import java.util.Scanner;

public class Uygulama {

    // SIRALAMA ALGORİTMALARI
    // Selection sort (seçmeli sıralama) algoritması : en küçük sayıyı bul basa taşı


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("kaç adet sayı girmek istersiniz: ");
        n = scanner.nextInt();
        int dizi[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("sayı: ");
            dizi[i] = scanner.nextInt();
        }
        selectionSort(dizi, n);
        System.out.println("sıralama yapıldı ");
        for (int i=0;i<n;i++){
            System.out.println(dizi[i]+" ");
        }
    }
    private static void selectionSort(int[] dizi, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (dizi[min] > dizi[j])
                    min = j;
            }
            int temp = dizi[min];
            dizi[min] = dizi[i];
            dizi[i] = temp;
        }
    }
}