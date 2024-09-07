package com.company;

public class Hayvan {
    int ayakSayisi =0;
    String turu = "tur belirtilmedi";
    String isim ="isimsiz";

    public void hayvanSesVer(){
        System.out.println("hayvan ses verdi");
    }
    public void yuru(){
        System.out.println("hayvan yurudu");
    }
    public void dur(){
        System.out.println("hayvan durdu");
    }
    public static  void selamVer(){
        System.out.println("hayvan Selam verdi");
    }
    public void hayvanOzellikleri(){
        System.out.println("isim = "+ this.isim+" ayakSayısı= "+this.ayakSayisi+ " turu= " +this.turu );
    }
}

