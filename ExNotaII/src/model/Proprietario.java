package model;

public class Proprietario extends Pessoa {
    private int idProp;
    private String banco;
    private String conta;

    public Proprietario(String cpf, String nome,int idProprietario,String banco,String conta) {
        super(cpf, nome);
        this.setIdProp(idProprietario);
        this.setBanco(banco);
        this.setConta(conta);
    }

    @Override
    public void mostrarDados() {
        System.out.println("\nCPF: " +getCpf()+"\nNome: " +getNome()+"\nId: "+getIdProp()+"\nBanco: "+getBanco()+"\nConta:" +getConta());
    }

    public int getIdProp() {
        return idProp;
    }

    public void setIdProp(int idProp) {
        this.idProp = idProp;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
}
