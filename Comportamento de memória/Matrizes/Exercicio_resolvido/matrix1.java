package Matrizes.Exercicio_resolvido;

import javax.swing.JOptionPane;

public class matrix1 {

    public static void main(String[] args) {

        int l = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de linhas da matriz."));

        int c = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de colunas da matriz"));

        int[][] mat = new int[l][c];

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

        JOptionPane.showMessageDialog(null, matriz);

    }

}