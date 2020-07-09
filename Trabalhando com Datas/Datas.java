import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Datas {

    public static void main(String[] args){

        //Formata a data e a hora no padrão que você desejar. Tem que estar exatamente nesse formato "dd/MM/yyyy HH:mm:ss" com as letras em maiúsculo.
        SimpleDateFormat horaData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat somenteData = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat somenteHora = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat horaDataGMT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        horaDataGMT.setTimeZone(TimeZone.getTimeZone("GMT"));

        //Pegando a data e a hora do sistema local.
        Date horaAtual01 = new Date();

        //Também pode ser escrita dessa forma: 
        Date horaAtual02 = new Date(System.currentTimeMillis());

        
        JOptionPane.showMessageDialog(null, "Data e Hora atual 01: " + horaData.format(horaAtual01));

        JOptionPane.showMessageDialog(null, "Data e Hora atual 02: " + horaData.format(horaAtual02));
        
        JOptionPane.showMessageDialog(null, "Mostrando somente a data: " + somenteData.format(horaAtual01));

        JOptionPane.showMessageDialog(null, "Mostrando somente a hora: " + somenteHora.format(horaAtual02));

        JOptionPane.showMessageDialog(null, "Mostrando a data e a hora de acordo com o Meridiano de Greenwich: " + horaDataGMT.format(horaAtual01));
        
        //Acrescentando algumas horas a mais ao horário.
        Calendar ManipulandoDate = Calendar.getInstance();
        ManipulandoDate.setTime(horaAtual02);
        ManipulandoDate.add(Calendar.HOUR_OF_DAY, 4);
        Date horaAtualizada = ManipulandoDate.getTime();

        JOptionPane.showMessageDialog(null, "Mostrando a data e a hora com o acréscimo de 4 horas a mais: " + horaData.format(horaAtualizada));

        //Obtendo a quantidade de minutos do horário
        Calendar quantosMinutos = Calendar.getInstance();
        quantosMinutos.setTime(horaAtual01);
        int minutos = quantosMinutos.get(Calendar.MINUTE);

        JOptionPane.showMessageDialog(null, "Mostrando somente os minutos de um horário: " + minutos);

        //Obtendo o mês de uma data
        Calendar qualMes = Calendar.getInstance();
        qualMes.setTime(horaAtual02);
        int mes = 1 + qualMes.get(Calendar.MONTH); // É necessário somar +1 porque no Java os meses começam a ser contabilizados a partir do 0

        
        JOptionPane.showMessageDialog(null, "Mostrando somente o mês de uma data: " + mes);


    }
    
}