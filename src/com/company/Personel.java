package com.company;

public class Personel {
    String isim;
    int sicilNo;
    String departman;
    int maas;

    Personel(){
        System.out.println("nesne olustu");
    }
    Personel(String isim,int sicilNo,String departman,int maas){
        this.isim=isim;
        this.departman=departman;
        this.sicilNo=sicilNo;
        this.maas=maas;
    }
    Personel(String isim,int sicilNo){
        this.isim =isim;
        this.sicilNo=sicilNo;
        this.departman="serbest bolum";
        this.maas = 17500;
    }

    public void bilgiler(){
        System.out.println("isim : " + this.isim);
        System.out.println("sicilNo : " + this.sicilNo);
        System.out.println("departman : " + this.departman);
        System.out.println("maas : " + this.maas);
        System.out.println("***************************");
    }

}
