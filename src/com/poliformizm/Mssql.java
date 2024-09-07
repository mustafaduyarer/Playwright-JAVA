package com.poliformizm;

public class Mssql implements IDatabase {
    @Override
    public void userEkle(String veri) {
        System.out.println("Mssql user veri eklendi"+veri);
    }

    @Override
    public void userCikar(int id) {
        System.out.println("Mssql user veri silindi"+id);
    }

    @Override
    public void userGuncelle(int id, String veri) {
        System.out.println("Mssql user veri guncellendi"+id+" - " + veri);
    }

    @Override
    public void urunEkle(String veri) {
        System.out.println("Mssql urun eklendi"+veri);
    }

    @Override
    public void urunCikar(int id) {
        System.out.println("Mssql urun cıkarıldı"+id);
    }

    @Override
    public void urunGuncelle(int id, String veri) {
        System.out.println("Mssql urun guncellendi"+id+" - "+ veri);
    }
    public void mssqlBilgiler(){
        System.out.println("Mssql bilgileri");
    }
}
