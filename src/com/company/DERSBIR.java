package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DERSBIR {
    public static void degiskenler() {
        System.out.println("selam Java");
        System.out.println("selam Java");
        System.out.print("selam Java");
        System.out.print("selam Java");
        // bu bir yorum satırıdır
        /* selam bu bir satırıdır*/
        System.out.println();
        System.out.println("D");
        System.out.println("DE");
        System.out.println("DER");
        System.out.println("DERY");
        System.out.println("DERYA");

        // Veri tipleri
        //  String int boolean char double
        String isim = "Nurcan";
        System.out.println("selam " + isim);
        isim = "Kamile";
        System.out.println("selam " + isim);

        int sayi1 = 15;
        //int sayi2= "15";
        // int sayi2 = 21a
        //int sayi2 = 25.5;
        double sayi3 = 10.5;
        double sayi4 = 10;
        System.out.println(sayi4);
        // boolean degerler true ve false deger alır
        boolean durum = true;
        boolean status = false;
        System.out.println(status);

        char harf = 'D';
        char harf1 = '*';
        System.out.println(harf1);
        String harf2 = "N";
    }

    public static void matematikselOperatorler() {
        //  toplama +
        // cıkarma -
        // bolme  /
        // carpma *
        // mod alma %

        int sayi1 = 15;
        int sayi2 = 25;
        int toplam = sayi1 + sayi2;
        // toplama
        System.out.println(sayi1 + " + " + sayi2 + " = " + toplam);

        // cıkarma
        int kalan = sayi1 - sayi2;
        System.out.println(sayi1 + " - " + sayi2 + " = " + kalan);
        // bolme
        //System.out.println((double) 20);
        double bolme = (double) sayi1 / sayi2;
        System.out.println(sayi1 + " / " + sayi2 + " = " + bolme);

        // carpma *
        int sonuc = sayi1 * sayi2;
        System.out.println(sayi1 + " * " + sayi2 + " = " + sonuc);

        // mod alma %
        int fark = sayi2 % sayi1;
        System.out.println(sayi2 + " % " + sayi1 + " = " + fark);
    }

    public static void alistirmaOne() {
        //5+6-6+3+5
        System.out.println(5 + 3 * 2 - 6 + 9 / 3 + 5);
        //8+18-6+5-5
        System.out.println(8 + 9 * 2 - 6 + 15 / 3 - 5);
        //2+6-1+2-8
        System.out.println(9 / 4 + 3 * 2 - 1 + 12 / 6 - 8);

        String kelime = "numaram" + 15;
        String kelime1 = 25 + "numara";
        String kelime2 = "durum" + true;
        System.out.println(kelime2);
        // degiklen isimleri sayısal degerler ile baslayamaz
        //String 100numaralıadam = "Kemal Sunal";
        // java kodlamaya ozel olan ozel isimlerden degisken olusturlamaz
        // final break boolean switch
        //String final = "selam";
        String numaralıadam100 = "Kemal Sunal";
        String a = "selam";
        System.out.println(a);
    }

    public static void mantiksalOperatorler() {
        // < kucuk
        // > buyuk
        // <= kucuk esit
        // >= buyuk esit
        // ! degil

        System.out.println(15 < 25);
        System.out.println(25 < 15);
        System.out.println(25 < 25);
        System.out.println(36 > 72);
        System.out.println(72 > 36);
        System.out.println("****");
        System.out.println(25 <= 36);
        System.out.println(35 <= 35);
        System.out.println("****");
        System.out.println(27 >= 15);
        System.out.println(42 >= 42);
        System.out.println("****");

        System.out.println(!(15 < 25));
        System.out.println("****");

        System.out.println(15 == 15);
        System.out.println(15 == 25);
        System.out.println(85 != 85);
        System.out.println("**********");
        // && ve operatoru
        // || veya operatoru

        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println("********");

        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(25 == 25);

        System.out.println("ali" == "ali");
        System.out.println("veli".equals("veli"));
        System.out.println("Veli".equals("veli"));
    }

    public static void kosullar() {
        // String kelime = "selam";
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("lutfen adınızı yazınız");
        next() sadece bir kelime yakalar
        String isim = scanner.next();String isim = scanner.nextLine();
        System.out.println("klavyedne girilen deger = " + isim);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();
        System.out.println("girilen sayi = " + sayi);
       */
        // ogrenci klavyeden vize ve final notu verecek biz ogrencini gecip gecmedigini ekrana yazacaz
        // ort = vize yuzde ,40 final yuzde 60
        // 50 den asagı dersten kalma
        // 50 zorunlu gecme
        // 50 ustu dersi gecti
        System.out.println("lutfen vize notunuzu giriniz");
        int vizeNotu = scanner.nextInt();
        System.out.println("lutfen final notunuzu giriniz");
        int finalNotu = scanner.nextInt();
        double ortalama = vizeNotu * 0.4 + finalNotu * 0.6;
        /*
        if (ortalama < 50) {
            System.out.println(ortalama + " ile kaldiniz");
        }
        if (ortalama == 50) {
            System.out.println(ortalama + " ile zorunlu gectiniz");
        }
        if (ortalama > 50) {
            System.out.println(ortalama + " ile gectiniz");
        }
        */

        if (ortalama < 50) {
            System.out.println(ortalama + " ile kaldiniz");
        } else if (ortalama == 50) {
            System.out.println(ortalama + " ile zorunlu gectiniz");
        } else if (ortalama > 50) {
            System.out.println(ortalama + " ile gectiniz");
        } else {
            System.out.println("hatali girdi yazdınız");
        }

    }

    public  static  void switchCase(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();

        switch(sayi) {
            case 1:
                System.out.println("girilen deger 1");
                break;
            case 2:
                System.out.println("girilen deger 2");
                break;
            case 3:
                System.out.println("girilen deger 3");
                break;
            case 4:
                System.out.println("girilen deger 4");
                break;
            case 5:
                System.out.println("girilen deger 5");
                break;
            default:
                System.out.println("hatali girdi yapildi");
                break;
        }

    }
    public static  void  array(){
        int sayi1 = 25;
        int sayi2 =74;
        int sayi3= 93;
        int sayi4= 45;
        int sayi5= 27;

        int notlar [] = new int[5];
        notlar[0]=25;
        notlar[1]=23;
        notlar[2]=72;
        notlar[3]=32;
        notlar[4]=64;

        System.out.println(notlar[3]);
    }
    public static void donguler() {
        // donguler
        // for dongusu
        // baslangıc degeri, durma sartı, artıs azalis islemi
        /*
        for (int i = 0; i < 50 ; i++) {
            System.out.println("nurcan");
        }
        */

       /*
       // while
        int sayac = 0;
        while (sayac<50){
            sayac++;
            System.out.println(sayac+" kamile");
        }
       */
       /*
       // do while
        int sayac =0;
        do{
            System.out.println("derya");
            sayac++;
        }while (sayac<0);
       */
       /*
       //  soru 1 5 elamanlı bir array olsun icinde deger olan
        // arrayde kac tane tek ve kaac tene cift oldugunu ekrana yazan kod
        int sayi[] = new int[6];
        sayi[0]=15;
        sayi[1]=25;
        sayi[2]=28;
        sayi[3]=36;
        sayi[4]=23;
        sayi[5]=19;

       int sayilar []= {15,96,74,25,12};

       int tekSayi=0;
       int ciftSayi=0;
        for (int i = 0; i < sayilar.length; i++) {
            if((sayilar[i] % 2) == 0){
                ciftSayi++;
            }else{
                tekSayi++;
            }
        }
        System.out.println("tek sayi adeti : " + tekSayi);
        System.out.println("cift sayi adeti : " + ciftSayi);
        */
       /*
        // soru 2  : klavyeden girilen bir sayının faktoryerii bulan kodu yazınız
        // 5! = 5*4*3*2*1 = 120
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scanner.nextInt();
        int sonuc = 1;
        for (int i = sayi; i >= 1; i--) {
            sonuc = sonuc * i;
        }
        System.out.println(sayi+"! : " + sonuc);
        */
        // rastgele(random) sayı uretme yontem 1
/*
        Random random = new Random();
        int sayi1 = random.nextInt(100);
        System.out.println(sayi1);
        System.out.println("********");
        // rastgele(random) sayı uretme yontem 2
        //Math.random() 0 ile 1 arasında sayı uretir

        int sayi2= (int) (Math.random() * 100);
        System.out.println(sayi2);
        */
        // soru3 =  5 elemanlı bir array olusturum icindeki degerleri ramdom atayım
        // arraydeki verileri terminale yazın
        int sayilist[] = new  int[5];
        Random random = new Random();
        for (int i = 0; i <sayilist.length ; i++) {
            sayilist[i] = random.nextInt(300);
        }

        System.out.println(Arrays.toString(sayilist));
        for (int i = 0; i <sayilist.length ; i++) {
            System.out.println(sayilist[i]);
        }


    }
}
