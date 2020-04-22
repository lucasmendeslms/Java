import javax.swing.JOptionPane;

public class soma_com_while {

    public static void main(String[] args){

        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));

        int soma = 0;

            while(num != 0){
            soma += num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
            }

        JOptionPane.showMessageDialog(null, "A soma dos valores informados é: " + soma);
    }
}