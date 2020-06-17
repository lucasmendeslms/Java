package Vetores.Vetor_de_Objetos;

import javax.swing.JOptionPane;
import java.text.NumberFormat;
import Vetores.Vetor_de_Objetos.Produtos;

public class Principal {

    public static void main(String[] args) {

        double soma = 0;

        int n = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe a quantidade de produtos que serão fornecidos para o cálculo da média de preços."));

        Produtos[] vect = new Produtos[n];

        for (int i = 0; i < vect.length; i++) {
            String name = JOptionPane.showInputDialog("Informe o nome do produto.");
            double price = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto."));
            vect[i] = new Produtos(name, price);

            soma += vect[i].getPrice();
        }

        JOptionPane.showMessageDialog(null, "A média dos preços dos produtos informados é: "
                + NumberFormat.getCurrencyInstance().format(soma / vect.length));

    }

}