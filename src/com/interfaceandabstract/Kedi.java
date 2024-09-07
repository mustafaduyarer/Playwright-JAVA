package com.interfaceandabstract;

public class Kedi extends Hayvan {
    @Override
    void uyumak() {
        System.out.println("Kedi uyudu");
    }

    @Override
    void yemekYe() {
        System.out.println("Kedi yemek yedi");
    }

    @Override
    void hareketEt() {
        System.out.println("Kedi hareket etti");
    }

    @Override
    void dur() {
        System.out.println("Kedi durdu");
    }
    public void sesver(){
        System.out.println("kedi miyavladi");
    }
}
