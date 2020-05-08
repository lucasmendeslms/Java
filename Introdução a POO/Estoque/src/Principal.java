import javax.swing.JOptionPane;
//import java.util.Locale;
import app.Produtos;

public class Principal {

    public static void main(String[] args) {

        //Locale.setDefault(Locale.US);

        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao seu estoque.");

        int resposta = 0;

        do {
            resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um produto?");

            if (resposta == JOptionPane.YES_OPTION)

            {
                resposta = 0;

                Produtos produto = new Produtos();

                produto.name = JOptionPane.showInputDialog("Informe o nome do produto.");

                produto.price = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto."));

                produto.quantity = Integer.parseInt(
                        JOptionPane.showInputDialog("Informe a quantidade desse produto disponível em estoque."));

                JOptionPane.showMessageDialog(null, produto);

                resposta = JOptionPane.showConfirmDialog(null,
                        "Deseja adicionar mais unidades desse produto ao estoque?");

                if (resposta == JOptionPane.YES_OPTION) {
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(
                            "Informe a quantidade de unidades desse produto que deseja adicionar ao seu estoque."));

                    produto.addProducts(quantity);

                    JOptionPane.showMessageDialog(null, produto);
                }

                resposta = 0;

                resposta = JOptionPane.showConfirmDialog(null, "Deseja remover unidades desse produto do estoque?");

                if (resposta == JOptionPane.YES_OPTION) {
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(
                            "Informe a quantidade de unidades desse produto que deseja remover do estoque."));

                    produto.removeProducts(quantity);

                    JOptionPane.showMessageDialog(null, produto);
                }

                resposta = 0;

            }

            resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

        } while (resposta == JOptionPane.YES_OPTION);

    }
}