package model;

import java.util.ArrayList;
import java.util.List;

public class Imovel implements IMostrarDados {
    private int idImovel;
    private String endereco;
    private double valorAluguel;
    private Proprietario proprietario;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Imovel(int idImovel, String endereco, double valorAluguel, Proprietario proprietario) {
        this.idImovel = idImovel;
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.proprietario = proprietario;
        this.alugueis = alugueis;
    }
    public void exibirHistoricoAluguel(){
        int id = 0;
        if(id == idImovel){
            for (Aluguel a: alugueis){
                System.out.println(getAlugueis());
            }
        }

    }
    @Override
    public void mostrarDados() {
        System.out.println("\nid: " +getIdImovel()+
                "\nendereço: " +getEndereco()+
                "\nvalor do Aluguel: " +getValorAluguel()+"\nProprietario: "+getProprietario().getNome());

    }

    public int getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(int idImovel) {
        this.idImovel = idImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }
}
