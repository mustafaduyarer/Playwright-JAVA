package com.poliformizm;

public class Mysql implements IDatabase {
    @Override
    public void userEkle(String veri) {
        System.out.println("Mysql user veri eklendi"+veri);
    }

    @Override
    public void userCikar(int id) {
        System.out.println("Mysql user veri silindi"+id);
    }

    @Override
    public void userGuncelle(int id, String veri) {
        System.out.println("Mysql user veri guncellendi"+id+" - " + veri);
    }

    @Override
    public void urunEkle(String veri) {
        System.out.println("Mysql urun eklendi"+veri);
    }

    @Override
    public void urunCikar(int id) {
        System.out.println("Mysql urun cıkarıldı"+id);
    }

    @Override
    public void urunGuncelle(int id, String veri) {
        System.out.println("Mysql urun guncellendi"+id+" - "+ veri);
    }
    public void bilgiler(){
        System.out.println("Mysql bilgileri");
    }
}
