package com.company;

import java.util.Random;
import java.util.Scanner;

public class DERDORT {
    public static void tryCatchBir() {
        int sayi3 = 15;
        int sayi1 = 10;
        int sayi2 = 0;
        try {
            System.out.println(sayi1 / sayi2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int sonuc = sayi1 + sayi2 + sayi3;
        System.out.println("sayıların toplam : " + sonuc);

    }

    public static void tryCatchIkı() {
        int sayi1 = 20;
        int sayi2 = 30;
        int sayi3 = 0;
        try {
            int sonuc = sayi1 + sayi2 + sayi3;
            System.out.println("try bolumu calisti");
        } catch (Exception e) {
            System.out.println("hata olustu mesaj: " + e.getMessage());
        } finally {
            System.out.println("finally bolumu calistı");
        }
        System.out.println("method sonu");
    }

    public static void tryCatchUc() {
        int ahmetYas = 15;
        int mehmetYas = 20;
        int leylaYas = 10;
        /*
        if (ahmetYas < mehmetYas) {
            throw neNullPointerExceptionw ("ahmet in yası mehmet in yasından kucuk olamaz");
        }
        */
        String isim = "Nurcan";
        System.out.println(isim.charAt(10));
        System.out.println("method sonu");
    }

    public static void asalSayiMi(int sayi) {
        boolean durum = true;
        int sayiYarisi = (int) (sayi / 2);
        for (int i = 2; i < sayiYarisi; i++) {
            if (sayi % i == 0) {
                durum = false;
                break;
            }
        }
        if (durum == true) {
            System.out.println(sayi + " asal sayidir");
        } else {
            System.out.println(sayi + " asal sayi degildir");
        }
    }

    public static void anamethod() {
        /*
        // klavyeden girilen bir sayının asal olup olmadıgını veren kodu yazınız
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();
        // 10 => 2 bolunuyor asal degildir
        // 11 => 2,3,4,5,6,7,8,9,10
        Main.asalSayiMi(sayi);
        */

        // soru: sayı tahmin oyunu
        // ratgele 0 ile 50 arasında bir sayi uretin ve bu sayıyı tahmin edin. Kacıncı denemede buldugunuzu ekrana yazın
        // cıktılar asagıdaki gibi olacak:
        // sayı  ile 0 ile 50 arasındadır lutfen tahmin sayınızı yazınız
        // daha dusuk sayı giriniz
        // daha yuksek sayı giriniz
        // tebrikler 15 sayısını 4. denemede buldunuz
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tahminEdilecekSayi = random.nextInt(50);
        System.out.println("Tahmin edilecek sayi 0 ile 50 arasındadır lutfen tahmin sayınızı yazınız");
        int tahmin = scanner.nextInt();
        boolean durum = true;
        int counter = 1;
        while (durum) {
            if (tahmin == tahminEdilecekSayi) {
                System.out.println("tebrikler " + counter + " denemede "+ tahminEdilecekSayi + " sayısını buldunuz");
                durum = false;
                break;
            } else if (tahmin > tahminEdilecekSayi) {
                System.out.println("daha dusuk deger giriniz");
            } else {
                System.out.println("daha buyuk deger giriniz");
            }
            tahmin = scanner.nextInt();
            counter++;

        }
    }
}
