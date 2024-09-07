package com.company;

import java.util.Random;
import java.util.Scanner;

public class DERSIKI {
    public static void selamVer() {
        System.out.println("selam arkadaslar");
    }

    public static void toplama(int sayi1, int sayi2) {
        int toplam = sayi1 + sayi2;
        System.out.println("sayilarin toplami : " + toplam);
    }

    public static void toplama(String sayi1, String sayi2) {
        String toplam = sayi1 + sayi2;
        System.out.println("sayilarin toplami : " + toplam);
    }

    public static void toplama(int sayi1, int sayi2, int sayi3) {
        int toplam = sayi1 + sayi2 + sayi3;
        System.out.println("sayilarin toplami : " + toplam);
    }

    public static int cıkarma(int sayi1, int sayi2) {
        int fark = sayi1 - sayi2;
        return fark;
    }

    public static int randomSayıVer() {
        Random random = new Random();
        int sayi = random.nextInt(200);
        return sayi;
    }

    public static void ciftTekSayiAdeti(int[] sayilar) {
        int ciftSayi = 0;
        int tekSayi = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if ((sayilar[i] % 2) == 0) {
                ciftSayi++;
            } else {
                tekSayi++;
            }
        }
        System.out.println("arrayde buluna tek sayi adeti : " + tekSayi);
        System.out.println("arrayde buluna cift sayi adeti : " + ciftSayi);
    }

    public static int[] addRandomNumberInArray(int[] sayilar) {
        Random random = new Random();
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = random.nextInt(200);
        }
        return sayilar;
    }

    public static String reversString(String name) {

        String tersIsim = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            //tersIsim = tersIsim + isim.charAt(i);
            tersIsim += name.charAt(i);
        }
        return tersIsim;
    }

    public static void soru() {
        /*
        // parametre alma ve  parametre alamama
        // return degeri olan ve retur degeri donmeyen methodlar
        // parametre almayan, return degeri olmayan method
        Main.selamVer();
        selamVer();
        // parametre alan , return degeri olmayan method
        Main.toplama(15, 36);

        // parametre alan ve return degeri olan method
        int kalan = Main.cıkarma(100, 40);
        System.out.println("kalan para = " + kalan);
        // parametre almayan ve return degeri olan method
        int rastgeleSayi = Main.randomSayıVer();
        System.out.println("uretilen sayi : " + rastgeleSayi);
        System.out.println("////////////////////////////");
        //1: random 10 sayı uretilecek ve array e eklecenecek. kac tene tek kac tane cift oldugunu bulan kod
        int sayiListesi[] = new int[10];
        sayiListesi = Main.addRandomNumberInArray(sayiListesi);
        System.out.println(Arrays.toString(sayiListesi));
        Main.ciftTekSayiAdeti(sayiListesi);

        int sayiListesi1[] = new int[20];
        sayiListesi1 = Main.addRandomNumberInArray(sayiListesi1);
        System.out.println(Arrays.toString(sayiListesi1));
        Main.ciftTekSayiAdeti(sayiListesi1);
        System.out.println("///////////////////////////");


        //soru2:klavyeden girilen bir kelimeyi tersten yazan kod // input: selam , output: meles
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isim giriniz");
        //nurcan
        //nacrun
        String isim = scanner.next();
        String tersIsim = Main.reversString(isim);
        System.out.println(isim + " isminin tersten yazılısı " + tersIsim + " dir");
        */
        //3: klavyeden girilen bir stringin tersten ve duzden yazılısı aynı mı kontrolu yapılacak
        //aynı ise tebrikler tersten ve duzden anlam aynı = ornek ; madam

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isim giriniz");
        String isim = scanner.next();
        String tersIsim = DERSIKI.reversString(isim);
        if(isim.equalsIgnoreCase(tersIsim)){
            System.out.println(isim +" ve " + tersIsim +" es seslidir");
        }else{
            System.out.println(isim +" ve " + tersIsim +" es sesli degildir");
        }
    }
}
