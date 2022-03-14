package com.sovos.figurageometrica.main;

import com.sovos.figurageometrica.figuras.Quadrado;
import com.sovos.figurageometrica.figuras.Triangulo;
import com.sovos.figurageometrica.figuras.Circulo;
import com.sovos.figurageometrica.figuras.Cilindro;
import com.sovos.figurageometrica.figuras.Ponto;

public class Main {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        System.out.println("Nome : " + quadrado.getNomeFigura());
        System.out.println("Área : " +quadrado.getArea());
        System.out.println("Perimetro : " +quadrado.getPerimetro());
        System.out.println("-----------------------------------------------------------");

        Triangulo triangulo = new Triangulo();
        triangulo.setBase(5);
        triangulo.setAltura(10);
        triangulo.setLadoA(3);
        triangulo.setLadoB(2);
        triangulo.setLadoC(1);
        System.out.println("Nome : " + triangulo.getNomeFigura());
        System.out.println("Área : " +triangulo.getArea());
        System.out.println("Perimetro : " +triangulo.getPerimetro());
        System.out.println("Altura : " + triangulo.getAltura());
        System.out.println("LadoA : " + triangulo.getLadoA());
        System.out.println("LadoB : " + triangulo.getLadoB());
        System.out.println("LadoC : " + triangulo.getLadoC());
        quadrado.getRetornaNada();
        System.out.println("-----------------------------------------------------------");

        Circulo circulo = new Circulo();
        circulo.setRaio(3);
        System.out.println("Nome : " +circulo.getNomeFigura());
        System.out.println("Raio :  " + circulo.getRaio());
        System.out.println("Área : " + circulo.getArea());
        System.out.println("Perimetro: " + circulo.getPerimetro());
        circulo.getRetornaNada();
        System.out.println("-----------------------------------------------------------");

        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(2);
        cilindro.setRaio(3);
        System.out.println("Nome : " +cilindro.getNomeFigura());
        System.out.println("Altura : " + cilindro.getAltura());
        System.out.println("Raio : " + cilindro.getRaio());
        System.out.println("Area :  " + cilindro.getArea());
        System.out.println("Area Lateral : " + cilindro.getAreaLateral());
        System.out.println("Area Base : " + cilindro.getAreaBase());
        cilindro.getRetornaNada();
        System.out.println("-------------------------------------------------------------");

        Ponto ponto = new Ponto();
        System.out.println("Nome : " +ponto.getNomeFigura());
        System.out.println("Area : " + ponto.getArea());
        System.out.println("perimetro : " + ponto.getPerimetro());
        ponto.getRetornaNada();


    }



    }


