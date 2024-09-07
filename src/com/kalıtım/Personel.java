package com.kalıtım;

public class Personel {
    private String isim;
    private int sicilNo;
    private int maas;

    public Personel() {
    }
    public Personel(String isim, int sicilNo, int maas) {
        this.isim = isim;
        this.sicilNo = sicilNo;
        this.maas = maas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "isim='" + isim + '\'' +
                ", sicilNo=" + sicilNo +
                ", maas=" + maas +
                '}';
    }
}
