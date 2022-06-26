package com.example.pm01ejercicio4.Procesos;

public class Transacciones {
    //Creacion de las Tablas
    public  static  final String tabla = "foto";
   /*  public  static  final String tablapaises = "Paises";
    campos */

    public static final String nombre = "txtnombre";
    public static final String desc = "txtdes";
    public static final String img;

    static {
        img = "Fotografia";
    }


    //tablas -CREATE, DROP
    public static final String CreateTableFoto = "CREATE TABLE foto( nombre TEXT, desc TEXT, img blob not null)";

    public static final String DropTableFoto = "DROP TABLE IF EXISTS foto";



    /* Creacion del nombre de la base de datos */
    public static final String NameDataBase = "db";
}
