package com.company;

public class Ogretmen {
    private String isim;
    private String branş;
    private int kimlikNo;
    private int maas;

    public int getMaas() {
        if(this.maas >200000){
            return 200000;
        }else{
            return maas;
        }
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getIsim() {
        if(isim.equalsIgnoreCase("zeynep")){
            return "merve";
        }
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getBranş() {
        return branş;
    }

    public void setBranş(String branş) {
        this.branş = branş;
    }

    public int getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(int kimlikNo) {
        this.kimlikNo = kimlikNo;
    }
    public  void info(){
        System.out.println("isim1:"+this.isim);
        System.out.println("isim2:"+this.getIsim());
        System.out.println("brans1:"+this.branş);
        System.out.println("brans2:"+this.getBranş());
        System.out.println("kimlikNo1:"+this.kimlikNo);
        System.out.println("kimlikNo2:"+this.getKimlikNo());

        System.out.println("maas1:"+this.maas);
        System.out.println("maas2:"+this.getMaas());
    }
}
