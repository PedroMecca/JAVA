import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Consulta implements IMostrarDados {
    private LocalDate data;
    private LocalTime hora;
    private Paciente paciente;
    private Medico medico;
    private Secretaria secretaria;
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();
    private ArrayList<Exame> exames = new ArrayList<>();

    public Consulta(LocalDate data, LocalTime hora, Paciente paciente, Medico medico, Secretaria secretaria, ArrayList<Medicamento> medicamentos, ArrayList<Exame> exames) {
        this.setData(data);
        this.setHora(hora);
        this.setPaciente(paciente);
        this.setMedico(medico);
        this.setSecretaria(secretaria);
        this.setMedicamentos(medicamentos);
        this.setExames(exames);
    }

    public Consulta(LocalDate data, LocalTime hora, Medico medico, Secretaria secretaria, ArrayList<Medicamento> medicamentos, ArrayList<Exame> exames) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.secretaria = secretaria;
        this.medicamentos = medicamentos;
        this.exames = exames;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\ndata: " +getData()+"\nHora: " +getHora()+"\nPaciente: " +getPaciente().getNome()+"\nMedico:"+getMedico().getNome()+"\nsecretaria:"+getSecretaria().getNome());
        System.out.println("\nMedicamentos:");
        for (Medicamento m: medicamentos){
            System.out.println(m.getNomeMedicamento());
        }
        System.out.println("\nExames");
        for (Exame e: exames){
            System.out.println(e.getNomeExame());
        }
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public ArrayList<Exame> getExames() {
        return exames;
    }

    public void setExames(ArrayList<Exame> exames) {
        this.exames = exames;
    }
}
