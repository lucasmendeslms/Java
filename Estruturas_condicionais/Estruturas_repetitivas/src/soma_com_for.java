import javax.swing.JOptionPane;

public class soma_com_for {

    public static void main(String[]args){
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));

        int soma = 0;

        for(int i = 0; i < n; i++){

            int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));

            soma += num;
        }

        JOptionPane.showMessageDialog(null, "A soma dos valores informados é: " + soma);

    }
}