package com.poliformizm;

public class DatabaseControl {
    void userEkle(IDatabase iDatabase,String veri){
      iDatabase.userEkle(veri);
    }
    void userCikar(IDatabase iDatabase,int id){
       iDatabase.userCikar(id);
    }
    void userGuncelle(IDatabase iDatabase,int id,String veri){
         iDatabase.userGuncelle(id,veri);
    }

    void urunEkle(IDatabase iDatabase,String veri){
        iDatabase.urunEkle(veri);
    }
    void urunCikar(IDatabase iDatabase,int id){
        iDatabase.urunCikar(id);
    }
    void urunGuncelle(IDatabase iDatabase,int id,String veri){
        iDatabase.userGuncelle(id,veri);
    }
}
