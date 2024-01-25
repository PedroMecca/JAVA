import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Pessoa{
    private String endereco;
    private ArrayList<Consulta> consultas = new ArrayList<>();

    public Paciente(String cpf, String nome,String endereco,ArrayList<Consulta> consultas) {
        super(cpf, nome);
        this.setEndereco(endereco);
        this.setConsultas(consultas);
    }

    public Paciente(String cpf, String nome, String endereco) {
        super(cpf, nome);
        this.endereco = endereco;
    }

    public void exibirHistoricoConsultasPaciente(){
        System.out.println("Consultas:");

        for (Consulta c: consultas){
            System.out.println("\nNome: "+getNome()+"\ndata:"+c.getData()+ "\nhora:"+c.getHora()+ "\nMedico:"+c.getMedico().getNome()+"\nMedicamentos:"+c.getMedicamentos()+"\nExames:" + c.getExames());


        }

    }
    public void exibirHistoricoConsultas(LocalDate datainicio,LocalDate dataFinal){
        Boolean temConsulta = false;
        for (Consulta c: consultas){
            if(c.getData().isAfter(dataFinal)&&c.getData().isBefore(dataFinal)){
                System.out.println("\nConsultas do cliente: "+this.getConsultas());
                c.mostrarDados();
                temConsulta = true;
                if(!temConsulta){
                    System.out.println("não existe consultas nese periodo");
                }
            }
        }
    }
    public void exibirHistoricoMedico(Medico medico){
        medico.mostrarDados();
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
}
