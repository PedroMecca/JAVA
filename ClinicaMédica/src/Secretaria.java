public class Secretaria extends Pessoa{
    private String matriculaFuncional;
    private double salario;

    public Secretaria(String cpf, String nome,String matriculaFuncional,double salario) {
        super(cpf, nome);
        this.setMatriculaFuncional(matriculaFuncional);
        this.setSalario(salario);
    }

    public String getMatriculaFuncional() {
        return matriculaFuncional;
    }

    public void setMatriculaFuncional(String matriculaFuncional) {
        this.matriculaFuncional = matriculaFuncional;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
