import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç adet sayı girmek istersiniz : ");
        int n = scanner.nextInt();
        int[] dizi = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("sayı: ");
            dizi[i] = scanner.nextInt();
        }
        insertionSort(dizi, n);
        System.out.println("sıralama işlemi tamam");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + dizi[i]);
        }
    }

    public static void insertionSort(int[] dizi, int n) {
        for (int i=1;i<n;i++);
        {
            for (int k=i ;k>0;k--);
            {
                if(dizi[k]<dizi[k-1])
                {
                    int temp=dizi[k];
                    dizi[k]=dizi[k-1];
                    dizi[k-1]=temp;
                }
            }
        }
    }
}