package bank;

import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class Conta {

    private int number;
    private String username;
    private double balance;
    public double value;

    public Conta(int number, String username, double value) {
        this.number = number;
        this.username = username;
        this.value = value;
    }

    public Conta(int number, String username) {
        this.number = number;
        this.username = username;
    }

    public int getNumber() {
        return number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        if (balance < value + 5) {

            int resposta = JOptionPane.showConfirmDialog(null,
                    "Tem certeza de que deseja realizar um saque?\nComo a sua conta não possui saldo suficiente para realizar essa operação, se continuar com esse saque você entrará no cheque especial.");

            if (resposta == JOptionPane.YES_OPTION) {

                balance -= value + 5;
            }
        } else {

            balance -= value + 5;
        }
    }

    public String toString() {
        return "\n\nNúmero da conta: " + number + "\n" + "\n\nNome do proprietário da conta: " + username + "\n"
                + "\n\nSaldo: " + NumberFormat.getCurrencyInstance().format(balance);
    }

}