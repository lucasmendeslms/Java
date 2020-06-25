package Listas.Exercício_de_fixação;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Listas.Exercício_de_fixação.Funcionarios;

public class Principal {

    public static void main(String[] args) {

        List<Funcionarios> list = new ArrayList<>();

        int n = Integer
                .parseInt(JOptionPane.showInputDialog("Informe a quantidade de funcionários que deseja cadastrar"));

        for (int i = 1; i <= n; i++) {
            JOptionPane.showMessageDialog(null, "Employee #" + i + ": ");

            int id = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
            
        }

    }

}