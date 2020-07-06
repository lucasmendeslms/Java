package Exercicio_resolvido_01.aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

import Exercicio_resolvido_01.entidades.enums.WorkerLevel;
import Exercicio_resolvido_01.entidades.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String departmentName = JOptionPane.showInputDialog("Informe o nome do departamento.");

        JOptionPane.showMessageDialog(null, "Informe os dados do funcionário.");

        String workerName = JOptionPane.showInputDialog("Informe o nome do funcionário.");

        String workerLevel = JOptionPane.showInputDialog("Informe o nível do cargo.");

        Double workerBaseSalary = Double
                .parseDouble(JOptionPane.showInputDialog("Informe o salário base do funcionário."));

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary,
                new Department(departmentName));

        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos contratos esse trabalhador possui?"));

        for (int i = 1; i <= n; i++) {
            JOptionPane.showMessageDialog(null, "Informe os dados do contrato #" + i);

            Date contractDate = sdf.parse(JOptionPane.showInputDialog("Informe a data do contrato."));

            double valuePerHour = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor recebido por hora."));

            int hours = Integer.parseInt(JOptionPane.showInputDialog("Duração do contrato em horas."));

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        

    }

}