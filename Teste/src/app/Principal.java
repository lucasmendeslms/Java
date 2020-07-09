package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Funcionario> list = new ArrayList<>();

		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcionários você deseja cadastrar?"));

		for (int i = 1; i <= n; i++) {
			JOptionPane.showMessageDialog(null, "Funcionário #" + i + ":");
			int id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do funcionário"));
			String nome = JOptionPane.showInputDialog("Informe o nome do funcionário");
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário"));
			list.add(new Funcionario(id, nome, salario));

		}

		int id = Integer.parseInt(
				JOptionPane.showInputDialog("Informe o ID do funcionário que você deseja aumentar o salário"));

		// Função para encontrar a primeira vez que o valor informado aparece

		Funcionario aumenta = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (aumenta == null) {
			JOptionPane.showMessageDialog(null, "Esse ID não existe!");
		}

		else {
			double porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem do aumento"));
			aumenta.increaseSalary(porcentagem);
		}

		for (Funcionario obj : list) {
			JOptionPane.showMessageDialog(null, "Lista de funcionários" + "\n" + obj);
		}
	}

}