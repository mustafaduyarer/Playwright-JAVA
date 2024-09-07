package com.interfaceandabstract;

public class Mssql implements IDatabase {
    @Override
    public void ekleme(String veri) {
        System.out.println(veri +" degeri mssql database eklendi ");
    }

    @Override
    public void cıkarma(int id) {
        System.out.println(id +" id li deger mssql databaseden cıkarıldı");
    }

    @Override
    public void guncelle(int id, String veri) {
        System.out.println(id + " id li veri " + veri +" ile mssql databasede guncellendi ");
    }
}
