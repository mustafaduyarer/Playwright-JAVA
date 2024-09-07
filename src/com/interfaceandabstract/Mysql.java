package com.interfaceandabstract;

public class Mysql implements IDatabase {
    @Override
    public void ekleme(String veri) {
        System.out.println(veri +" degeri mysql database eklendi ");
    }

    @Override
    public void cıkarma(int id) {
        System.out.println(id +" id li deger mysql databaseden cıkarıldı");
    }

    @Override
    public void guncelle(int id, String veri) {
        System.out.println(id + " id li veri " + veri +" ile mysql databasede guncellendi ");
    }
}
