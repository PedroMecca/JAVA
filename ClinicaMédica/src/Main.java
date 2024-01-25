import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        Medicamento medicamento1 = new Medicamento("benzetacil");
        Medicamento medicamento2 = new Medicamento("Dipirona");
        Medicamento medicamento3 = new Medicamento("Benegripe");
        medicamentos.add(medicamento1);
        medicamentos.add(medicamento2);
        medicamentos.add(medicamento3);

        ArrayList<Exame>exames = new ArrayList<>();
        Exame exame1 = new Exame("Exame CardioRespiratorio");
        Exame exame2 = new Exame("Exame de Coração");
        Exame exame3 = new Exame("RaioX");
        exames.add(exame1);
        exames.add(exame2);
        exames.add(exame3);

        Medico medico1 = new Medico("1669375","Eduardo","134-25","Cardiologista");
        Secretaria secretaria1 = new Secretaria("15986985","Marilia","219784",1500.0);
        Paciente paciente1 = new Paciente("12345","Pedro","rua antonio blanco numero 8");

        ArrayList<Consulta>consultas = new ArrayList<>();
        Consulta consulta1 = new Consulta(LocalDate.of(2023,10,23), LocalTime.of(10,23),paciente1,medico1,secretaria1,medicamentos,exames);
        Consulta consulta2 = new Consulta(LocalDate.of(2023,10,1),LocalTime.of(10,30),paciente1,medico1,secretaria1,medicamentos,exames);
        consultas.add(consulta1);
        consultas.add(consulta2);
        consulta1.mostrarDados();
        ArrayList<Consulta> consultas2 = new ArrayList<>();
        Consulta consulta3 = new Consulta(LocalDate.of(2023,9,15),LocalTime.of(12,25),medico1,secretaria1,medicamentos,exames);
        Consulta consulta4 = new Consulta(LocalDate.of(2023,9,30),LocalTime.of(12,50),medico1,secretaria1,medicamentos,exames);
        consultas2.add(consulta3);
        consultas2.add(consulta4);
        Paciente paciente2 = new Paciente("12355","sérgio","rua IFSP",consultas2);

        paciente2.exibirHistoricoConsultasPaciente();
        LocalDate dataInicio = LocalDate.of(2023,9,1);
        LocalDate dataFinal = LocalDate.of(2023,9,30);
        //paciente2.exibirHistoricoConsultas(dataInicio,dataFinal);
        //paciente2.exibirHistoricoMedico(medico1);





    }
}