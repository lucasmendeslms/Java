package Vetores;

import javax.swing.JOptionPane;
import java.util.Locale;

public class Vetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double soma = 0;

        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de números a serem digitados."));

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = Double
                    .parseDouble(JOptionPane.showInputDialog("Informe os números desejados para se calcular a média."));

            soma += vect[i];
        }

        JOptionPane.showMessageDialog(null, "Valor da média entre os números informados = " + String.format("%.2f", soma/vect.length));

    }
}