package com.company;

public class Ogrenci {
    String isim;
    int okulNo;
    String durum;
    int disiplinNotu;

    Ogrenci(){

    }

    Ogrenci(String isim,int okulNo,String durum,int disiplinNotu){
       //this.isim=isim;
       //this.durum=durum;
       //this.okulNo=okulNo;

       this(isim, okulNo, durum);
       this.disiplinNotu=disiplinNotu;
    }
    Ogrenci(String isim,int okulNo,String durum){
       // this.isim=isim;
        //this.okulNo=okulNo;
        this(isim,okulNo);
        this.durum=durum;
    }
    Ogrenci(String isim,int okulNo){
        this.isim=isim;
        this.okulNo=okulNo;
    }

    Ogrenci(String isim){
        this.isim=isim;
    }
    public void bilgiler(){
        System.out.println("isim = "+this.isim);
        System.out.println("durum = "+this.durum);
        System.out.println("okulNo = "+this.okulNo);
        System.out.println("disiplinNotu = "+this.disiplinNotu);
    }
}
