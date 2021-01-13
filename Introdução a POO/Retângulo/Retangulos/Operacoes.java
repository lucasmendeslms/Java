package Retangulos;

import java.lang.Math;

public class Operacoes {

    public double width;
    public double height;

    public double Area(double width, double height) {
        return width * height;
    }

    public double Perimeter(double width, double height) {
        return 2 * (width + height);
    }

    public double Diagonal(double width, double height) {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public String toString() {
        return "Valor da área: " + Area(width, height) + "\n\nValor do Perímetro: " + Perimeter(width, height)
                + "\n\nValor da Diagonal: " + Diagonal(width, height);
    }

}
