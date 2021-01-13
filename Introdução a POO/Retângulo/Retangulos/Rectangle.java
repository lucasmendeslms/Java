package Retangulos;

import javax.swing.JOptionPane;

public class Rectangle {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo a calculadora de retângulos");

        Operacoes retangulo = new Operacoes();

        retangulo.width = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base do Retângulo."));
        retangulo.height = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura do Retângulo"));

        JOptionPane.showMessageDialog(null, retangulo);

    }
}