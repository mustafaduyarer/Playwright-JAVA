package com.company;

import com.testpaket.Insan;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public void alıstırma() {
        /*
        String kelime = "Nur";
        Hayvan hayvan1 = new Hayvan();
        hayvan1.isim="mavis";
        hayvan1.turu="kedi";
        hayvan1.ayakSayisi=4;
        hayvan1.hayvanOzellikleri();
        System.out.println("*********");
        Hayvan hayvan2 = new Hayvan();
        hayvan2.isim="karabas";
        hayvan2.turu="kopek";
        hayvan2.ayakSayisi=4;
        hayvan2.hayvanOzellikleri();
        */
        Personel personel1 = new Personel();
        personel1.isim = "ali";
        personel1.sicilNo = 123456;
        personel1.departman = "IT";
        personel1.maas = 50000;
        personel1.bilgiler();
        Personel personel2 = new Personel();
        personel2.isim = "merve";
        personel2.sicilNo = 654321;
        personel2.departman = "IK";
        personel2.maas = 60000;
        personel2.bilgiler();
        Personel personel3 = new Personel("ali", 123, "Muhasebe", 40000);
        personel3.bilgiler();

        Personel personel4 = new Personel("melis", 852963);
        personel4.bilgiler();

        Ogrenci ogrenci = new Ogrenci("melek", 123, "aktif", 0);
        ogrenci.bilgiler();

    }

    public static void main(String[] args) {
        Ogretmen ogretmen1 = new Ogretmen();
        Ogretmen ogretmen2 = new Ogretmen();
        ogretmen1.setIsim("ali");
        ogretmen1.setBranş("Beden Egitimi");
        ogretmen1.setKimlikNo(12346);
        ogretmen1.setMaas(100000);

       ogretmen2.setIsim("Nurcan");
       ogretmen2.setBranş("Ingilizce");
       ogretmen2.setKimlikNo(654321);
       ogretmen2.setMaas(250000);
        ogretmen1.info();
        System.out.println("***********");
        ogretmen2.info();

    }
}
