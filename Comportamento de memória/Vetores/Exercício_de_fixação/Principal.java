/*
A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
*/

package Vetores.Exercício_de_fixação;

import javax.swing.JOptionPane;
import Vetores.Exercício_de_fixação.Pensionato;

public class Principal {

    public static void main(String[] args) {

        Pensionato[] vect = new Pensionato[10];

        int n = Integer
                .parseInt(JOptionPane.showInputDialog("Informe a quantidade de estudantes que irão alugar um quarto."));

        for (int i = 0; i < n; i++) {
            String nome = JOptionPane.showInputDialog("Informe o nome da(o) estudante.");
            String email = JOptionPane.showInputDialog("Informe o e-mail da(o) estudante.");
            int quarto = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o número do quarto que a(o) estudante deseja alugar"));
            vect[quarto] = new Pensionato(nome, email);
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                JOptionPane.showMessageDialog(null, "Quarto " + i + ": " + vect[i]);
            }
        }
    }

}