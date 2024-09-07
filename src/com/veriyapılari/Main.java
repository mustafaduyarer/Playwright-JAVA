package com.veriyapılari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void arrayList() {
        String kelimeler [] = new String[3];
        kelimeler[0]= "selam";
        kelimeler[1]= "merhaba";
        kelimeler[2]= "dunya";

        ArrayList<String> ulkeler = new ArrayList<String>();
        ulkeler.add("Turkiye");
        ulkeler.add("Amerika");
        ulkeler.add("Almanya");
        System.out.println(ulkeler);
        ulkeler.add(1,"Ingirtere");
        System.out.println(ulkeler);
        System.out.println(ulkeler.get(1));
        ulkeler.remove(1);
        System.out.println(ulkeler);
        ulkeler.remove("Almanya");
        System.out.println(ulkeler);
        System.out.println(ulkeler.size());
        ulkeler.set(0,"Bosna");
        System.out.println(ulkeler);
        System.out.println(ulkeler.contains("Turkiye"));
        System.out.println(ulkeler.contains("Amerika"));
        System.out.println("************************************");
        ArrayList sehirler = new ArrayList();
        sehirler.add("Istanbul");
        sehirler.add(06);
        sehirler.add(0.78);
        sehirler.add(true);
        System.out.println(sehirler);
        System.out.println("************************************");
        ArrayList isimler = new ArrayList<>();
        isimler.add("ali");
        isimler.add(123);
        System.out.println("************************************");
        ArrayList <String> numaralar = new ArrayList();
        numaralar.add("ali");
        System.out.println(numaralar);
        System.out.println("************************************");


    }

    public static void callByValueAndCallByReferans() {
        System.out.println("*****start call by value*******");
        String kelime = "selam";
        String cumle = kelime;
        System.out.println("kelime: "+kelime);
        System.out.println("cumle: "+cumle);
        System.out.println("**");
        kelime ="java";
        System.out.println("kelime: "+kelime);
        System.out.println("cumle: "+cumle);
        System.out.println("*****end call by value*******");
        System.out.println("*****start call by referans*******");
        ArrayList<String> isimler = new ArrayList<String>();
        isimler.add("Ali");
        ArrayList<String> isimListesi = isimler;
        System.out.println("isimler: "+ isimler);
        System.out.println("isimlistesi: " + isimListesi);
        isimListesi.add("Veli");
        System.out.println("isimler: "+ isimler);
        System.out.println("isimlistesi: " + isimListesi);
        System.out.println("*********************");
        ArrayList<String> ulkeler = new ArrayList<String>();
        ulkeler.add("Turkiye");
        ulkeler.add("Amerika");
        ArrayList<String> ulkelerClone =  (ArrayList) ulkeler.clone();
        System.out.println("ulkeler"+ulkeler);
        System.out.println("ulkelerClone"+ulkelerClone);
        System.out.println("***");
        ulkeler.add("Ingirtere");
        System.out.println("ulkeler"+ulkeler);
        System.out.println("ulkelerClone"+ulkelerClone);
        System.out.println("*****end call by referans*******");



    }

    public static void stream() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("**********");

        for (int numara:numbers) {
            System.out.println(numara);
        }
        System.out.println("**********");
     numbers.forEach((n)-> {
         System.out.println("deger :" + n);
     });
        //numbers.forEach( (n) -> { System.out.println(n); } );

        System.out.println("************");
        List<Integer> sayilar = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = sayilar.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(squares); // Output: [4, 16]

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers1.stream().reduce(0, Integer::sum);

        System.out.println(sum); // Output: 15
    }

    public static void main(String[] args) {
        ArrayList<String> ulkeler = new ArrayList<String>();
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Turkiye", "Ankara");
        capitalCities.put("England", "Paris");
        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.values());
        System.out.println(capitalCities.keySet());
    }
}
