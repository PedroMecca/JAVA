package model;

public class Inquilino extends Pessoa{
    private int idInquilino;
    private double rendaMensal;
    @Override
    public void mostrarDados() {
        System.out.println("\nCPF: "+getCpf()+"\nNome: "+ getNome()+"\nId: "+getIdInquilino()+"\nRenda: "+getRendaMensal());
    }
    public Inquilino(String cpf, String nome,int idInquilino,double rendaMensal) {
        super(cpf, nome);
        this.idInquilino = idInquilino;
        this.rendaMensal = rendaMensal;
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }


}
