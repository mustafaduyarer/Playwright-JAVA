package com.poliformizm;

public class Main {

    public static void main(String[] args) {
        Mysql mysql = new Mysql();
        mysql.urunEkle("gomlek");
        mysql.urunCikar(1);
        System.out.println("**********");

        IDatabase mysqlBir = new Mysql();
        DatabaseControl databaseControl = new DatabaseControl();
        databaseControl.userEkle( mysqlBir,"Nurcan");
        databaseControl.userEkle( mysqlBir,"Veysi");

        IDatabase mssqlBir = new Mssql();
        databaseControl.userEkle(mssqlBir,"merve");


    }
}
