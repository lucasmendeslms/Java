import javax.swing.JOptionPane;
import java.util.Locale;

public class leitor_de_temperatura {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
            
           int resposta = 0;

            do{
                double celsius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Celsius: "));

                JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit equivalente: " + String.format("%.1f",((9*celsius)/5)+32));

                resposta = JOptionPane.showConfirmDialog(null, "Deseja repetir?");
                
            } while(resposta == JOptionPane.YES_OPTION);  
        
    }

}