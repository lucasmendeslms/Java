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
            String name = JOptionPane.showInputDialog("Nome: ");
            double salary = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
            list.add(new Funcionarios(id, name, salary));
        }

        JOptionPane.showMessageDialog(null, list);

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja aumentar o salário de algum funcionário?");

        if (resposta == JOptionPane.YES_OPTION) {

            int id = Integer
                    .parseInt(JOptionPane.showInputDialog("Enter the employee id that will have salary increase"));

            Funcionarios ide = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

            if (ide == null) {
                JOptionPane.showMessageDialog(null, "This id does not exist!");
            } else {
                double percentage = Double.parseDouble(JOptionPane.showInputDialog("Enter the porcentage."));

                ide.increaseSalary(percentage);
            }

            JOptionPane.showMessageDialog(null, "List of employees:");

            for (Funcionarios obj : list) {
                JOptionPane.showMessageDialog(null, obj);
            }

        }

    }

}