package com.company;

public class Main {

    public static void main(String[] args) {

        try {
            Fecha fecha= new Fecha(3,30,2000);}
        catch (FechaException e){
            System.err.println(e);

        }
    }
}
