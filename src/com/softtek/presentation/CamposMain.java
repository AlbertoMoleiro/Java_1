package com.softtek.presentation;
import com.softtek.models.Campos;

public class Main {
    public static void main(String[] args) {

        Campos miCampo = new Campos(5);

        miCampo.incrementa(7);

        System.out.println(miCampo.muestra());

    }
}