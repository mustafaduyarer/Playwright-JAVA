package com.interfaceandabstract;

public class Kopek extends Hayvan {
    @Override
    void uyumak() {
        System.out.println("Kopek uyudu");
    }

    @Override
    void yemekYe() {
        System.out.println("Kopek yemek yedi");
    }

    @Override
    void hareketEt() {
        System.out.println("Kopek hareket etti");
    }

    @Override
    void dur() {
        System.out.println("Kopek durdu");
    }
}
