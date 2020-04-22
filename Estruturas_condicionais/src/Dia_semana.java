
import javax.swing.JOptionPane;

public class Dia_semana {

 public static void main(String[] args){

    int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro que represente um dia da semana"));

    String dia;

    switch(num){

        case 1: dia = "Domingo";
        break;

        case 2: dia = "Segunda";
        break;

        case 3: dia = "Terça";
        break;

        case 4: dia = "Quarta";
        break;

        case 5: dia = "Quinta";
        break;

        case 6: dia = "Sexta";
        break;
        
        case 7: dia = "Sábado";
        break;

        default: dia = "Valor inválido";
        break; 
    }

    JOptionPane.showMessageDialog(null, "Dia da semana: " + dia);

 }
}