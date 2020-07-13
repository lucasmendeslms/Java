package aplicacao;

import modulos.*;
import modulos.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Program {

    public static void main(String[] args) throws ParseException {

        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo.");

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja digitar um pedido?");

        if (resposta == JOptionPane.YES_OPTION) {

            do {

                Date moment = new Date();

                String nome = JOptionPane.showInputDialog("Informe o nome do cliente.");

                String email = JOptionPane.showInputDialog("Informe o e-mail.");

                String birthday = (JOptionPane.showInputDialog("Informe a data de aniversário do cliente."));
                Date aniversario = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);

                Client cliente = new Client(nome, email, aniversario);

                JOptionPane.showMessageDialog(null, "Informe os dados do pedido.");

                OrderStatus status = OrderStatus.valueOf(JOptionPane.showInputDialog("Status do pedido: "));

                Order pedido = new Order(moment, cliente, status);

                int i = 0;
                do {
                    i++;

                    JOptionPane.showMessageDialog(null, "Entre com o item #" + i + " do pedido.");

                    String nomeProduto = JOptionPane.showInputDialog("Nome do produto.");

                    Double precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Preço do produto."));

                    Product produto = new Product(nomeProduto, precoProduto);

                    int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do produto."));

                    OrderItem itensPedido = new OrderItem(quantidade, precoProduto, produto);

                    pedido.addItem(itensPedido);

                    resposta = JOptionPane.showConfirmDialog(null, "Deseja incluir outro item em seu pedido?");

                } while (resposta == JOptionPane.YES_OPTION);

                resposta = JOptionPane.showConfirmDialog(null, "Digitar outro pedido?");

                if (resposta == JOptionPane.NO_OPTION) {

                    JOptionPane.showMessageDialog(null, "Descrição do pedido: \n" + pedido);
                }

            } while (resposta == JOptionPane.YES_OPTION);

        } else {
            JOptionPane.showMessageDialog(null, "Volte sempre... Até logo :)");
        }
    }

}