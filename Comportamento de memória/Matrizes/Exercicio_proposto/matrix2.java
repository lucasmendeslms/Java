/*Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.*/

package Matrizes.Exercicio_proposto;

import javax.swing.JOptionPane;

public class matrix2 {

    public static void main(String[] args) {

        int m = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de linhas da matriz."));

        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de colunas da matriz."));

        int[][] mat = new int[m][n];

        JOptionPane.showMessageDialog(null, "Informe os números a serem inseridos na matriz");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog(""));
            }
        }

        String matriz = "";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                matriz += Integer.toString(mat[i][j]);
                matriz += "    ";
            }

            matriz += "\n";
        }

        JOptionPane.showMessageDialog(null, "Matriz: \n" + matriz);

        int x = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor a ser encontrado dentro da matriz."));

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {

                    JOptionPane.showMessageDialog(null, "Posição na matriz: " + i + "," + j);

                    if (j > 0) {
                        JOptionPane.showMessageDialog(null, "Número a esquerda: " + mat[i][j - 1]);
                    }

                    if (j < mat[i].length - 1) {
                        JOptionPane.showMessageDialog(null, "Número a direita: " + mat[i][j + 1]);
                    }

                    if (i > 0) {
                        JOptionPane.showMessageDialog(null, "Número acima: " + mat[i - 1][j]);
                    }

                    if (i < mat.length - 1) {
                        JOptionPane.showMessageDialog(null, "Número abaixo: " + mat[i + 1][j]);
                    }

                }
            }

        }

    }

}