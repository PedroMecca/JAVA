public class Medico extends Pessoa {
    private String numCRM;
    private String especialidade;


    public Medico(String cpf, String nome,String numCRM,String especialidade) {
        super(cpf, nome);
        this.setNumCRM(numCRM);
        this.setEspecialidade(especialidade);
    }

    public String getNumCRM() {
        return numCRM;
    }

    public void setNumCRM(String numCRM) {
        this.numCRM = numCRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
