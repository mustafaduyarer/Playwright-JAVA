package com.kalıtım;

public class Main {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan();
        hayvan.kos();
        Kedi kedi = new Kedi();
        kedi.sesCıkar();
        kedi.kos();
        System.out.println("***************************");
        Personel personel = new Personel("mert",123456,25000);
        Ogretmen ogretmen = new Ogretmen("melis",654321,55000,25);
        System.out.println(ogretmen.toString());
        System.out.println(personel.toString());
    }
}
