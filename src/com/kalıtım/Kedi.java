package com.kalıtım;

public class Kedi extends Hayvan {
    public void sesCıkar(){
        System.out.println("Kedi miyavladı");
    }
    public  void  kos(){
        super.kos();
        System.out.println("Kedi kostu");
    }
}
