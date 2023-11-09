package com.javaintermedio.Clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Clase3 {
    public static void main(String[] args) {
        // 1. Implementar salida de string en mayusculas

        List<String> lista=new ArrayList<>();
        lista.add("Hola");
        lista.add("Hola2");
        lista.add("Hola3");
        lista.add("Hola4");
        lista.add("Hola5");

        System.out.println("Ejercicio 1:\n\n");
        lista.forEach((x)->System.out.println(x.toUpperCase()));

        /* 2.Implementar un método que reciba como parámetro una lista de strings y un entero "n". El
        método debe devolver un String que concatene separando por coma y espacio todas las
        palabras, en la lista, que tengan más de "n" caracteres. */ 
        
        lista.clear();
        lista.add("Uno");
        lista.add("Hola");
        lista.add("Cinco");
        lista.add("Samsung");
        lista.add("A");
        lista.add("Webpage");
        lista.add("TecladoNumerico");

        int minChar=4;
        System.out.println("\n\nEjercicio 2:\n\n"+lista+"\n\n");

        System.out.println("Filtrado de palabras de mas de "+minChar+" caracteres:\n");

        System.out.println(concatNumChar(lista,minChar));


    }

    public static String concatNumChar(List<String> lista, int numChar){
        String resultado="";
        resultado=lista
            .stream()
            .filter(texto->texto.length()>numChar)
            .collect(Collectors.joining(", "));
        return resultado;
    }
}
