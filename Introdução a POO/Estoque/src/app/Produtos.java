package app;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Produtos {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {

        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            JOptionPane.showMessageDialog(null,
                    "Você não pode remover uma quantidade maior do que a existente no estoque.");
        }

    }

    public String toString() {
        return name + "\n" + "\n\nValor do produto: " + NumberFormat.getCurrencyInstance().format(price)
                + "\n\nQuantidade em estoque: " + quantity + "\n\nValor total da mercadoria em estoque: "
                + NumberFormat.getCurrencyInstance().format(totalValueInStock());
    }
}