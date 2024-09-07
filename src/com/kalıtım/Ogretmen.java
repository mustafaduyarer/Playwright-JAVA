package com.kalıtım;

public class Ogretmen extends  Personel{
   private int ogrenciSayisi;
   Ogretmen (){

   }
    Ogretmen (int ogrenciSayisi ){
        this.ogrenciSayisi=ogrenciSayisi;
    }

    public Ogretmen(String isim, int sicilNo, int maas,int ogrenciSayisi ) {
        super(isim, sicilNo, maas);
        this.ogrenciSayisi=ogrenciSayisi;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }


}
