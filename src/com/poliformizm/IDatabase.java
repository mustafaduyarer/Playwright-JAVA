package com.poliformizm;

public interface IDatabase {
    void userEkle(String veri);
    void userCikar(int id);
    void userGuncelle(int id,String veri);

    void urunEkle(String veri);
    void urunCikar(int id);
    void urunGuncelle(int id,String veri);
}
