public class Uygulama {
    public static void main(String[] args) {
        Tablo hTablo = new Tablo(5);
        hTablo.ekle(0, "ahmet");
        hTablo.ekle(10, "mehmet");
        hTablo.ekle(3, "hasan");
        hTablo.ekle(4, "hüseyin");
        hTablo.ekle(2, "ayse");
        hTablo.ekle(22, "fatma");
        hTablo.ekle(15, "beyza");
        hTablo.ekle(9, "ece");
        System.out.println(hTablo.dizi[3].next.isim);
        /////////////////////////////
        hTablo.sil(0);
        hTablo.sil(9);
        hTablo.sil(15);
        hTablo.sil(22);
        hTablo.sil(2);
        hTablo.sil(4);
        hTablo.sil(3);
        hTablo.sil(10);
        System.out.println();
        hTablo.sil(3);
        hTablo.sil(100);
    }
}
