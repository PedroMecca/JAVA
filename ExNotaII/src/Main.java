import data.*;
import model.Aluguel;
import model.Imovel;
import model.Inquilino;
import model.Proprietario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Proprietario proprietario1 = new Proprietario("1234","pedro",1,"Banco do Brasil","12345");
        Inquilino inquilino1 = new Inquilino("24564","lara",1,1200.00);

        List<Aluguel> alugueis = new ArrayList<>();

        Imovel imovel1 = new Imovel(1,"rua antonio",1500.00,proprietario1);
        Aluguel aluguel1 = new Aluguel(150,"21/12/2002","21/12/2007",inquilino1,imovel1);
        alugueis.add(aluguel1);
        imovel1.mostrarDados();
    }*/
        Proprietario proprietario1 = new Proprietario("12345","pedro",3,"Brasil","1234");
        ProprietarioDAO proprietarioDAO = new ProprietarioSQLiteDAO();
        //proprietarioDAO.salvar(proprietario1);
        Proprietario proprietario2 = new Proprietario("5636","Pablo",4,"santander","9687");
        //proprietarioDAO.salvar(proprietario2);
        for (Proprietario p: proprietarioDAO.buscarTodos()){
            p.mostrarDados();
        }
        Inquilino inquilino1 = new Inquilino("1234","antonio",5,1500);
        InquilinoDAO inquilinoDAO = new InquilinoSQLiteDAO();
        //inquilinoDAO.salvar(inquilino1);
        Inquilino inquilino2 = new Inquilino("4523","roberta",7,1700);
        //inquilinoDAO.salvar(inquilino2);
        //inquilinoDAO.apagar(inquilino1);

        Imovel imovel1 = new Imovel(1,"rua jajaja",2000,proprietario1);
        ImovelDAO imovelDAO = new ImovelSQLiteDAO();
        //imovelDAO.salvar(imovel1);

        for (Imovel i: imovelDAO.buscarTodos()){
            i.mostrarDados();
        }

        Aluguel aluguel1 = new Aluguel(1,"21/12/2002","21/12/2015",inquilino1,imovel1);
        AluguelDAO aluguelDAO = new AluguelSQLiteDAO();
        //aluguelDAO.salvar(aluguel1);


    }
}