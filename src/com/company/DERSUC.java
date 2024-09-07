package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class DERSUC {

    public static int usAlma(int taban, int us) {
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc = sonuc * taban;
        }
        return sonuc;
    }

    public void selamVer() {
        System.out.println("selam");
    }

    public static void mathsınıfı() {
        //Math ve String methodlarını
        int sonuc = DERSUC.usAlma(5, 4);
        System.out.println("sonuc : " + sonuc);
        // pow uslu sayılar icin kullanılr 5 uzeri 3 = 125.0
        System.out.println("us alma : " + Math.pow(5, 3));
        // abs bir sayının mutlak degerini alır
        System.out.println("mutlak deger alma " + Math.abs(-85));
        // sqrt bir sayının karekokunu alır
        System.out.println("karekok alma + " + Math.sqrt(25));
        // random  0 ile 1 arasında sayı uretir.
        double sayi = Math.random() * 100;
        System.out.println("random sayır uretme : " + sayi);
        // round methodu ondalıklı sayıyı .5 den sonrasının yukarı yuvarlar asagısını asagı yuvarlar
        System.out.println(Math.round(sayi));
        System.out.println("*********************");
        //floor method ondaklıklı sayıyı asagı yuvarlar
        System.out.println(Math.floor(25.2));
        //ceil method ondaklıklı sayıyı yukarı yuvarlar
        System.out.println(Math.ceil(25.2));

        System.out.println(Math.PI);

        System.out.println("******************************");


    }

    public static void stringMethodları() {
        String cumle = "MeRhaBa dUnya";
        //toUpperCase cumleyi buyuk harfe cevirir
        // toLowerCase cumleyi kucuk harfe cevirir
        System.out.println(cumle + " - " + cumle.toUpperCase());
        System.out.println(cumle + " - " + cumle.toLowerCase());
        System.out.println("karekter sayısı : " + cumle.length());
        String isim1 = "merve";
        String isim2 = "Merve";
        System.out.println(isim1.equals(isim2));
        System.out.println(isim1.equalsIgnoreCase(isim2));
        System.out.println("*********************");
        cumle = "merhaba java";
        // cumlenin 3. ve 7. index aralıgındaki degeri almak istiyorum
        // substring baslangic index dahil bitis index dahil olmayacak sekilde deger doner
        // [3,7)
        System.out.println("charAt ile : " + cumle.charAt(3) + cumle.charAt(4) + cumle.charAt(5) + cumle.charAt(6));
        System.out.println("substring" + cumle.substring(3, 7));
        // replace methodu bir string icersinde bir deger degistirmek istersek kullanılır
        String cumle3 = "merhaba java nasılsın java";
        String yeniCumle = cumle3.replace("java", "python");
        System.out.println(cumle3);
        System.out.println(yeniCumle);
        //indexOf methodu bir string icerisinde arana degerin indexin verir yok ise -1 degerini verir
        cumle3 = "merhaba java";
        System.out.println(cumle3.indexOf("ha"));
        String isim = "Nurcan";
        String soyiisim = "Kavlak";
        String tamIsim = isim + " " + soyiisim;
        System.out.println(tamIsim);
        System.out.println(isim.concat(" ").concat(soyiisim));
        // ["merhaba","java"]
        String arrayCumle[] = cumle3.split(" ");
        System.out.println(Arrays.toString(arrayCumle));
        //contains string icerisinde verilen deger var mı
        System.out.println(cumle3.contains("php"));
        System.out.println("**************************");
        // soru : klavyeden girilen bir metinde selam var ise " terminalde herkese selam yazsın"
        // gule gule var ise " terminalde herkese gule gule yazsın"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin yazınız");
        String metin = scanner.nextLine().toLowerCase();
        if(metin.contains("selam")){
            System.out.println("herkese selam");
        }else if(metin.contains("gule gule")){
            System.out.println("Herkese gule gule");
        }else{
            System.out.println("metinde selam ve gule gule bulunamadı");
        }

    }
}
