package com.javaintermedio.Clase2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> lista=new ArrayList<>();
        lista.add("Hola");
        lista.add("Hola2");
        lista.add("Hola3");
        lista.add("Hola4");
        lista.add("Hola5");

        Operar operar=(a)->a.toUpperCase(); 
        List<String> listaMayuscula=new ArrayList<>();

        for (String string : lista) {
            listaMayuscula.add(operar.aMayuscula(string));       
        }
        
        System.out.println(lista);
        System.out.println(listaMayuscula);
    }
}
