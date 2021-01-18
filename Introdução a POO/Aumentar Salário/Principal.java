import javax.swing.JOptionPane;

public class Principal {

  public static void main(String[] args) {

    int resposta;

    JOptionPane.showMessageDialog(null, "Olá, seja bem vindo a ferramenta de controle de salários.");

    do {

      resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo funcionário?");

      if (resposta == JOptionPane.YES_OPTION) {

        resposta = 0;

        Funcionario funcionario = new Funcionario();

        funcionario.setName(JOptionPane.showInputDialog("Informe o nome do funcionário"));

        funcionario
            .setGrossSalary(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário bruto do funcionário.")));

        funcionario.setTax(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da taxa de imposto.")));

        funcionario.netSalary(funcionario.getTax());

        JOptionPane.showMessageDialog(null, funcionario);

        double porcentagem = Double
            .parseDouble(JOptionPane.showInputDialog("Informe a porcentagem de aumento que o funcionário receberá."));

        funcionario.increaseSalary(porcentagem);

        JOptionPane.showMessageDialog(null, funcionario);

      }
    } while (resposta == JOptionPane.YES_OPTION);

    JOptionPane.showMessageDialog(null, "Good Bye! See you later...");

  }

}