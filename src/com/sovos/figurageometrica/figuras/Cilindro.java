package com.sovos.figurageometrica.figuras;

import com.sovos.figurageometrica.interfaces.FiguraGeometricaDefault;
import java.lang.Math.*;

public class Cilindro implements FiguraGeometricaDefault {
    private double areaBase;
    private double raio;
    private double areaLateral;
    private double altura;
    private double areaTotal;

    @Override
    public String getNomeFigura() {
        return "Cilindro";
    }

    @Override
    public int getArea() {
        areaBase = Math.PI + Math.pow(raio,2);
        areaLateral = 2*Math.PI * raio *altura;
        areaTotal =  2*Math.PI*raio*(altura+raio);
        return (int) areaTotal;
    }

    @Override
    public int getPerimetro() {
        return 0;
    }

    @Override
    public void getRetornaNada() {

    }


    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAreaLateral() {
        return areaLateral;
    }

    public void setAreaLateral(double areaLateral) {
        this.areaLateral = areaLateral;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }
}
