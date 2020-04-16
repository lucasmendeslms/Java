package app;

import java.util.Locale;

import javax.swing.JOptionPane;

public class telefonia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double min = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de minutos consumidos"));
        
        if(min <= 100){
            JOptionPane.showMessageDialog(null, "Valor a pagar R$ 50.00 ");
        }
        else{
            JOptionPane.showMessageDialog(null, "Valor a pagar: R$ " + String.format("%.2f",(50 + ((min - 100)*2))));
        }
    }

}