package bank;

import javax.swing.JOptionPane;
import bank.Conta;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		int resposta;
		double valor;

		JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao Banco LMS.");

		do {
			resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar uma nova conta?");

			if (resposta == JOptionPane.YES_OPTION) {

				resposta = 0;

				Conta conta;

				Random random = new Random();

				int numero = random.nextInt(10000);

				String nome = JOptionPane.showInputDialog("Informe o nome do proprietário da conta.");

				resposta = JOptionPane.showConfirmDialog(null, "Deseja iniciar sua conta com um depósito?");

				if (resposta == JOptionPane.YES_OPTION) {
					valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito inicial"));
					conta = new Conta(numero, nome, valor);
					conta.deposit(valor);
				}

				else {
					conta = new Conta(numero, nome);
				}

				resposta = 0;

				JOptionPane.showMessageDialog(null, conta);

				resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar um depósito?");

				if (resposta == JOptionPane.YES_OPTION) {
					valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito"));
					conta.deposit(valor);
					JOptionPane.showMessageDialog(null, conta);
				}

				resposta = 0;

				resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar um saque?");

				if (resposta == JOptionPane.YES_OPTION) {
					valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque"));
					conta.withdraw(valor);
					JOptionPane.showMessageDialog(null, conta);
				}

				resposta = 0;

			}
		} while (resposta == JOptionPane.YES_OPTION);

	}
}
