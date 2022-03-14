package com.sovos.figurageometrica.figuras;

import com.sovos.figurageometrica.interfaces.FiguraGeometricaDefault;
import java.lang.Math.*;

public class Circulo implements FiguraGeometricaDefault {

    private double raio;

    @Override
    public String getNomeFigura() {
        return "Circulo";
    }

    @Override
    public int getArea() {
        return (int) (Math.PI* raio * raio);
    }
    @Override
    public int getPerimetro() {
        return (int) (2 * Math.PI * raio);
    }

    @Override
    public void getRetornaNada() {
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
