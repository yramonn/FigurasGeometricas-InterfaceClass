package com.sovos.figurageometrica.figuras;

import com.sovos.figurageometrica.interfaces.FiguraGeometricaDefault;

public class Quadrado implements FiguraGeometricaDefault {

    private int lado;
    private String area;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public int getArea() {
        int area = 0;
        area = lado * lado;
        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro = 0;

        perimetro = lado * 4;

        return perimetro;
    }

    @Override
    public void getRetornaNada() {




    }
}
